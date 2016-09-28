package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Flipkartlinkpage {
	
WebDriver driver;
	
	public Flipkartlinkpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		driver.switchTo().defaultContent();
		WebElement element=driver.findElement(By.id("aFindYogi"));
		element.click();
		System.out.println("Current window id: "+driver.getWindowHandle()); 
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);

		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Freedom Sale 1 Online at Best Price | Flipkart.com");
		driver.close(); 
		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());
	}

	}


