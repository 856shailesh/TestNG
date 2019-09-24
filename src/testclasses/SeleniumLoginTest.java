package testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.Screenshots;

public class SeleniumLoginTest {

	WebDriver driver;
	String BaseURL;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("C:\\Users\\shailesh.kumar2\\eclipse-workspace\\ReportsExtent\\logintext.html");
		test = report.startTest("Verify Welcome Text");
		driver = new ChromeDriver();
		BaseURL = "https://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		test.log(LogStatus.INFO, "Got base URL");
	}

	@Test
	public void test1_ValidLoginTest() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement popHTML = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("comp-jgmoxwr2inlineContent")));
		WebElement overlayDiv = driver.findElement(By.id("p7kjtbalatabgcoloroverlay"));
		overlayDiv.click();
		test.log(LogStatus.INFO, "Removed Overlay");
		// System.out.println("Removed Overlay");

		WebElement LoginBtn = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		LoginBtn.click();

		WebElement LoginSwitch = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		LoginSwitch.click();

		WebElement Email = driver.findElement(By.id("memberLoginDialogemailInputinput"));
		Email.sendKeys("test@email.com");

		WebElement password = driver.findElement(By.id("memberLoginDialogpasswordInputinput"));
		password.sendKeys("abcabc");

		WebElement SignUpbtn = driver.findElement(By.id("memberLoginDialogokButton"));
		SignUpbtn.click();
		test.log(LogStatus.INFO, "Clicked on SignUp button");

		Thread.sleep(3000);

		WebElement WelcomeText = driver.findElement(By.id("comp-iiqg1vggmemberTitle"));
		Assert.assertTrue(WelcomeText != null);
		test.log(LogStatus.PASS, "Verified Welcome text");

	}

	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}
