package selenium.testng.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Googlenews {

	@Test(groups={"Smoke"})
	public void news()
	{
		WebDriver driver=Googlesearch.driver;
		driver.findElement(By.linkText("News")).click();
		String actual=driver.findElement(By.xpath(".//*[@id='rso']/div[4]/div/div/div[2]")).getText();
		String execpted="Las Vegas, Nevada, United States, October 30, 2005. KEE Technologies";
		Assert.assertTrue(actual.contains(execpted));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		
	}

	@Test(groups={"Retest"})
	public void linkclick()
	{
		WebDriver driver=Googlesearch.driver;
		WebElement actual=driver.findElement(By.linkText("Multi-deal Monday: Sport earbuds, Android flash drive, Kindle ..."));
		actual.click();
		actual.getText();
		String execpted="Multi-deal Monday: Sport earbuds, Android flash drive, Kindle Paperwhite, and more!";
		Assert.assertEquals(actual, execpted);

	}


}
