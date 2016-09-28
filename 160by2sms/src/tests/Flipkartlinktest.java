package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Flipkartlinkpage;
import pages.Loginpage;

public class Flipkartlinktest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Loginpage singin= new Loginpage(driver);
		singin.login("9989593467","ramireddy");
	}
	@Test
	public void window()
	{
		Flipkartlinkpage page=new Flipkartlinkpage(driver);
		page.click();
	}

}
