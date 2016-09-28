package selenium.testng.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Googlevideos {
	@Test(groups={"Smoke"})
	public void videos()
	{
		WebDriver driver=Googlesearch.driver;
		driver.findElement(By.linkText("Videos")).click();
		String actual=driver.findElement(By.xpath(".//*[@id='rso']/div/div[6]/div/div/div[2]/span")).getText();
		String execpeted="Parkovací asistent KEETEC BS 100";
		Assert.assertTrue(actual.contains(execpeted));
		
	}

}
