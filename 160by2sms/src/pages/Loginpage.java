package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;	
	}
public void login(String username,String password)
{
driver.findElement(By.id("username")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.xpath("html/body/form/div/section/div/div[1]/div[3]/div[3]/button")).click();
driver.switchTo().frame("by2Frame");
driver.findElement(By.xpath("//button[text()='Send Free SMS']")).click();
}

}
