package selenium.testng.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Googlemaps {
	@Test(groups={"Retest"})
	public void mapclick()
	{

		WebDriver driver=Googlesearch.driver;
		driver.findElement(By.linkText("Maps")).click();

	}


}
