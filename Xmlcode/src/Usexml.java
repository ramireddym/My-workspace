import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Usexml {
	WebDriver driver;

	//@Parameters ("url")

	@BeforeTest
	public void setup ()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//System.out.println("URL of the application:" +url);
		driver.get("file:///D:/Venkata%20Rami%20Reddy/softwares/SeleniumTest/home.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test
	public void mvr1()
	{
		driver.switchTo().frame("myNavigation");
		driver.findElement(By.linkText("tree")).click();
		System.out.println("Hello Ramireddy");
		driver.switchTo().defaultContent();
	}

	@Test
	public void mvr2()
	{
		driver.switchTo().frame("myDetail");
		driver.findElement(By.id("myBtn")).click();
		System.out.println("How are you");

	}

	@Test
	public void mvr3()
	{

		System.out.println("what going on");
	}

	@Test
	public void mvr4()
	{

		System.out.println("Today");
	}

	@Test
	public void mvr5()
	{

		System.out.println("Any Issues");
	}

	@Test
	public void mvr6()
	{

		System.out.println("In last class");
	}

	@Test
	public void mvr7()
	{

		System.out.println("Please Inform to me");
	}

}
