package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opeingabrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement element = driver.findElement(By.id("Email"));
        element.sendKeys("mareddy697");

        WebElement element1=driver.findElement(By.id("next"));
        element1.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.id("Passwd"));
        element2.sendKeys("9704367212");
        WebElement element3=driver.findElement(By.id("signIn"));
        element3.click();
        driver.manage().window().maximize();
        driver.close();*/

		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("ramireddy591");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("00000000000");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();	
	}

}
