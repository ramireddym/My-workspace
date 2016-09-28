package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		final String expectedinfomsg="Meet Advay, a teen scientist from Chennai who is making fishing safer";
		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Current Browser Title: "+driver.getTitle());
		System.out.println("Current Browser Url: "+driver.getCurrentUrl());
		System.out.println("Current Browser pagesource: "+driver.getPageSource());
		WebElement infomsg = driver.findElement(By.xpath("//div[contains(text(),'Meet')]"));
		//System.out.println("Information message from Google Search page:"+infomsg.getText());
		Assert.assertEquals(infomsg.getText(), expectedinfomsg);
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		searchbox.clear();
		searchbox.sendKeys("mantis bt");
		driver.findElement(By.xpath("//button[@value='Search']")).click();
		driver.findElement(By.linkText("MantisBT | SourceForge.net")).click();			
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("MantisBT | Source"));
		Assert.assertEquals(driver.getTitle(), "MantisBT | SourceForge.net");
	}

}
