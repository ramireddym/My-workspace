package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmailpage {
	
	public static WebDriver driver=new FirefoxDriver();
	
	
	
	@Test(priority=0)
	
	public void gmaillogin()
	{
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test(priority=1)
	public void username()
	{
		driver.findElement(By.id("Email")).sendKeys("ramireddy591");
		driver.findElement(By.id("next")).click();
	}
	@Test(priority=2)
	public void password()
	{
		driver.findElement(By.id("Passwd")).sendKeys("9666860641");
		
	}
	
	@Test(priority=3)
	public void signin()
	{
		driver.findElement(By.id("signIn")).click();
		System.out.println("You Have Succesfully Logged in");
	}
	
	/*@Test(priority=4)
	public void logout()
	{
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
		System.out.println("You Have Succesfully Logged Out");
		
	}
	
	@Test(priority=5)
	public void close()
	{
		
		driver.close();
		System.out.println("You Have Succesfully close browser");
		
	}*/
}



