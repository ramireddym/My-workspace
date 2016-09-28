package google.free.codes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Googlenews { 
	
	WebDriver driver=Googlecodes.driver;
	
	@Test
	public void news()
	{
		
		driver.findElement(By.linkText("News")).click();
		String actual=driver.findElement(By.xpath("//div[contains(text(),'Las Vegas, Nevada, United States, October 30, 2005. KEE Technologies')]")).getText();
		String execpted="Las Vegas, Nevada, United States, October 30, 2005. KEE Technologies";
		Assert.assertTrue(actual.contains(execpted));
	}
	
	@Test
	public void linkclick()
	{
		WebDriver driver=Googlecodes.driver;
		WebElement actual=driver.findElement(By.linkText("Multi-deal Monday: Sport earbuds, Android flash drive, Kindle ..."));
		actual.click();
		actual.getText();
		String execpted="Multi-deal Monday: Sport earbuds, Android flash drive, Kindle Paperwhite, and more!";
		Assert.assertEquals(actual, execpted);
		
	}
	

}
