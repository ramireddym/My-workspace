package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public void validlogin()
	{
		Loginpage singin= new Loginpage(driver);
		singin.login("9989593467","ramireddy");
		driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println("HI");
		
		
	}
	@Test(priority=1)
	public void Invalidlogin()
	{
		Loginpage singin= new Loginpage(driver);
		singin.login("9989593467","ramirddy");
		try {
			driver.findElement(By.xpath("//button[text()='Login']"));
		} catch (Exception e) {
			System.out.println("Hello");
			// TODO: handle exception
		}
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
