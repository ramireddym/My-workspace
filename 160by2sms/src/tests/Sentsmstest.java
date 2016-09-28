package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Sentsmspage;

public class Sentsmstest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Loginpage sigin =new Loginpage(driver);
		sigin.login("9989593467", "ramireddy");
	}
	@Test(priority=0)
	public void validtest()
	{
		Sentsmspage sms=new Sentsmspage(driver);
		sms.sentsms();
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
