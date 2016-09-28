package google.free.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class googlevideos {

	WebDriver driver=Googlecodes.driver;

	@Test
	public void videos()
	{

		driver.findElement(By.linkText("Videos")).click();
		driver.findElement(By.linkText("Ross Kee - tech house mix - YouTube")).click();
		/*String actual=driver.findElement(By.xpath(".//*[@id='rso']/div/div[4]/div/div/div[2]/span")).getText();
		String execpeted="Parkovací asistent KEETEC BS 100";
		Assert.assertTrue(actual.contains(execpeted));*/

	}

}

