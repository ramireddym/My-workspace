package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookolgin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ramireddy591@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9989593467");
		driver.findElement(By.id("loginbutton")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("login successfully");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']//div//div//div[1]//div//div//ul//li[18]//a//span//span")).click();
		System.out.println("logout successfully");
		driver.close();


	}

}
