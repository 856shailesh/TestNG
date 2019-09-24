package appCodes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {
	
	public static String TakeScreenshots(WebDriver driver,String fileName ) throws IOException {
		fileName = fileName + ".png";
		String dir = "C:\\Users\\shailesh.kumar2\\eclipse-workspace\\Screenshots\\";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(dir + fileName));
		String destination = dir + fileName;
		return destination;
		
	}

}
