package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myalertspage {
	WebDriver driver;
	public Myalertspage(WebDriver driver) {
		this.driver=driver;	
	}
	public void myalert(String name,String number,String message)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.id("aMyAlerts")).click();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.xpath("//span[@class='date'][text()='2']")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.id("txtName")).sendKeys(name);
		driver.findElement(By.id("spanCategories")).click();
		driver.findElement(By.xpath("//ul/li[contains(text(),'Anniversary')]/following-sibling::li")).click();
		WebElement element=driver.findElement(By.id("chkAlert"));
		element.isSelected();
		element.click();
		driver.findElement(By.id("sel_hour")).click();
		driver.findElement(By.xpath("//ul/li[contains(text(),'01')]/preceding-sibling::li")).click();
		driver.findElement(By.id("sel_minute")).click();
		driver.findElement(By.xpath("//ul/li[contains(text(),'10')]/preceding-sibling::li")).click();
		driver.findElement(By.id("mobile")).sendKeys(number);
		driver.findElement(By.id("txtaMsg")).sendKeys(message);
		driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		
		
	}

}
