package selenium.testng.frames;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Googlesearch {
	
	public static WebDriver driver=new FirefoxDriver();
	
	@BeforeMethod
	public void name1()
	{
		System.out.println("@BeforeMethod The annotated method will be run before each test method");
	}
	
	@BeforeClass
	public void name3()
	{
		System.out.println("@BeforeClass The annotated method will be run before the first test method in the current class is invoked");
	}
	
	@BeforeTest
	public void name5()
	{
		System.out.println("@BeforeTest The annotated method will be run before any test method belonging to the classes inside the tag is run.");
	}
	
	@BeforeSuite
	public void name7()
	{
		System.out.println("@BeforeSuite The annotated method will be run before all tests in this suite have run");
	}
	
	@Test(groups={"Smoke"})//The annotated method is a part of a test case
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
	@Test(groups={"Retest"})
	public void search()
	{
		
		System.out.println("Hai how r u");
	}
	
	@AfterMethod
	public void name2()
	{
		System.out.println("@AfterMethod The annotated method will be run after each test method");
	}

	@AfterClass
	public void name4()
	{
		System.out.println("@AfterClass The annotated method will be run after all the test methods in the current class have been run");
	}

	@AfterTest
	public void name6()
	{
		System.out.println("@AfterTest The annotated method will be run after all the test methods belonging to the classes inside the tag have run.");
	}
	@AfterSuite
	public void name8()
	{
		System.out.println("@AfterSuite The annotated method will be run after all tests in this suite have run");
	}


}
