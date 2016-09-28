package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Onlinebusbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		driver.findElement(By.id("toPlaceName")).sendKeys("GUNTUR");
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("txtReturnJourneyDate")).click();
		driver.findElement(By.linkText("31")).click();
		driver.findElement(By.id("searchBtn")).click();

	}

}
