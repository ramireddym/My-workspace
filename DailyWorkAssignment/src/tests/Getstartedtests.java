package tests;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Getstartedpage;
import pages.LinkedInLoginpage;

public class Getstartedtests {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=0)
	public void logintest()
	{	
		Getstartedpage singin= new Getstartedpage(driver);
		singin.Rlogin("venakatarmireddy","mareddy","mareddy4356437@gmail.com","9989593467");
		Assert.assertEquals(driver.getTitle(), "World’s Largest Professional Network | LinkedIn");
	}
	@Test(priority=1)
	public void logintest1()
	{
		Getstartedpage singin= new Getstartedpage(driver);
		singin.Country("522415");
		Assert.assertEquals(driver.getTitle(), "LinkedIn | LinkedIn");
	}
	@Test(priority=2)
	public void logintest2()
	{
		Getstartedpage singin= new Getstartedpage(driver);
		singin.student("Tester","KeeTech Software Solutions Pvt.Ltd");
		//Assert.assertEquals(driver.getTitle(), "LinkedIn | LinkedIn");	
	}
	@Test(priority=3)
	public void logintest3()
	{
		Getstartedpage singin= new Getstartedpage(driver);	
		singin.findjobs();
	}
	@Test(priority=4)
	public void logintest4()
	{
		Getstartedpage singin= new Getstartedpage(driver);
		singin.email();
		
	}
	@Test(priority=5)
	public void logintest5()
	{
		Getstartedpage singin= new Getstartedpage(driver);
		singin.Confirming();	
	}
	/*@AfterClass
	public void quit()
	{
		driver.quit();
	}*/

}
