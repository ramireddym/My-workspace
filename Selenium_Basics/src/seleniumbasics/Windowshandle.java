package seleniumbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Windowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.andhrabank.in/English/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement ApplyOnlineelement = driver.findElement(By.linkText("Apply Online"));

		//Actions action = new Actions(driver);
		//action.moveToElement(ApplyOnlineelement);
		//action.build().perform();

		ApplyOnlineelement.click(); 
		System.out.println("Current window id: "+driver.getWindowHandle()); 
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);

		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Andhra Bank | Online loan tracking system");
		driver.close(); 
		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());



	}

}
