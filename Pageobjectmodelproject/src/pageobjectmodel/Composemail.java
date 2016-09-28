package pageobjectmodel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Composemail {
	
	WebDriver driver=Gmailpage.driver;
	@Test
	public void compose()
	{
		driver.findElement(By.xpath(".//*[@id=':2z']/div/div")).click();
		driver.findElement(By.xpath(".//*[@id=':lo']")).sendKeys("mareddy697@gmail.com");
		driver.findElement(By.xpath(".//*[@id=':no']")).sendKeys("to day report");
		driver.findElement(By.xpath(".//*[@id=':os']")).sendKeys("HI");
		
		
	}
	
	@Test
	public void send()
	{	
		driver.findElement(By.xpath(".//*[@id=':nd']")).click();
	}
	
	@Test
	public void drafts()
	{	
		driver.findElement(By.xpath("//*[@id=':3c']/div/div[1]")).click();
	}
}
