package google.free.codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Googlecodes {
	
	public static WebDriver driver=new FirefoxDriver();
	
	@Test
	public void googlesearching()
	{
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.id("lst-ib"));
		search.clear();
		search.sendKeys("Keetech");
		driver.findElement(By.xpath(".//*[@id='sblsbb']")).click();
		String actualtext=driver.findElement(By.className("_Rm")).getText();
		String execpttext="www.keetechsoft.com/";
		Assert.assertEquals(actualtext, execpttext);
			
	}
	
	@Test
	public void search()
	{
		
		System.out.println("Hai how r u");
	}
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}

	@BeforeTest
	public void testBeforeTest() {
		System.out.println("testBeforeTest()");
	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("testAfterTest()");
	}



}
