package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Getstartedpage {
	WebDriver driver;
	public Getstartedpage(WebDriver driver) {
		this.driver=driver;	
	}
	public void Rlogin(String Firstname,String Lastname, String Email,String Password)
	{
		driver.findElement(By.id("first-name")).sendKeys(Firstname);
		driver.findElement(By.id("last-name")).sendKeys(Lastname);
		driver.findElement(By.id("join-email")).sendKeys(Email);
		driver.findElement(By.id("join-password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
	}
	public void Country(String Postalcode)
	{
		WebElement ele=driver.findElement(By.id("country"));
		ele.click();
		Select select=new Select(ele);
		select.selectByVisibleText("India");
		WebElement ele1=driver.findElement(By.id("zip-code"));
		ele1.clear();
		ele1.sendKeys(Postalcode);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public void student(String jodtitle,String companyname)
	{
		//driver.findElement(By.id("student")).click();
		driver.findElement(By.id("job-title")).sendKeys(jodtitle);
		driver.findElement(By.id("company")).sendKeys(companyname);
		driver.findElement(By.xpath("//input[@class='save-profile']")).click();
	}
	public void findjobs()
	{
		driver.findElement(By.xpath("//button[text()='Finding a job']")).click();
	}
	public void email()
	{

		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement ApplyOnlineelement = driver.findElement(By.id("resolve-btn"));
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
		driver.findElement(By.id("submit_approve_access")).click();
		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());
	}

	public void  Confirming()
	{
driver.findElement(By.xpath("//button[@class='resend-email-btn main-btn']")).click();
	}

}
