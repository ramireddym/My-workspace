import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {

	WebDriver driver;

	@Before

	public void setUp() throws Exception {

		driver = new FirefoxDriver();

		driver.get("https://google.com");

	}

	@After

	public void tearDown() throws Exception {

		driver.quit();

	}



	@Test

	public void test() throws IOException {

		// Code to capture the screenshot

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location

		FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));                  

	}

}