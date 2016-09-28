package google.free.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Googlemaps {

	WebDriver driver=Googlecodes.driver;


	@Test
	public void mapclick()
	{


		driver.findElement(By.linkText("Maps")).click();
		driver.navigate().back();

	}


}

