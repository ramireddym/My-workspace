package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInLoginpage {
	WebDriver driver;
	public LinkedInLoginpage(WebDriver driver) {
		this.driver=driver;	
	}
	public void login(String Username,String Password)
	{
	driver.findElement(By.id("login-email")).sendKeys(Username);
	driver.findElement(By.id("login-password")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	}

}
