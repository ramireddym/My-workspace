package seleniumbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Windowsalertsxpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.axisbank.com/pre-login/internetbanking_prelogin.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement applyonlineelement=driver.findElement(By.linkText("Know More"));
		applyonlineelement.click();
		System.out.println("current windowid:"+driver.getWindowHandle());
		Set<String> setwindows=driver.getWindowHandles();
		for(String window:setwindows)

		{
			if(window.equals(parentwindowid))
				continue;
			else
			{
				driver.switchTo().window(window);	
				break;
			}			

		}
		System.out.println("currentwindowtitle:"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Personal Loan");
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("curreny window:"+driver.getTitle());

	}
}
