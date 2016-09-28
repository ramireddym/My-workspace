package seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2sms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		 List link = driver.findElements(By.tagName("a"));
		 System.out.println(link.size());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("9989593467");
		driver.findElement(By.id("password")).sendKeys("ramireddy");
		driver.findElement(By.id("loginBTN")).click();
		driver.getTitle();
		System.out.println("current window title:"+ driver.getTitle());
		driver.getCurrentUrl();
		System.out.println("current url: "+ driver.getCurrentUrl());
		driver.getPageSource();
		System.out.println("Page source file: "+ driver.getPageSource());
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath(".//a[text()='Send SMS']")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.id("Send")).click();
		Alert alert=driver.switchTo().alert();
		//String a1=alert.getText();
		System.out.println("alert");
		alert.accept();
		driver.findElement(By.id("mobile")).sendKeys("9989593467");
		driver.findElement(By.id("message")).sendKeys("9704367212");
		driver.findElement(By.id("Send")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//li[@class='lout']/i")).click();
		driver.switchTo().defaultContent();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("javascript:logout();");
		  driver.quit();  




	}

}
