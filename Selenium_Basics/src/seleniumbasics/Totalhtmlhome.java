package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Totalhtmlhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Venkata%20Rami%20Reddy/softwares/SeleniumTest/home.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("myHeader");
		driver.findElement(By.xpath("html/body/div/h3"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myNavigation");
		driver.findElement(By.linkText("tree")).click();
		driver.findElement(By.linkText("Handle Alert")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert");
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myDetail");
		driver.findElement(By.id("myBtn")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println("alert1");
		alert1.accept();
		driver.findElement(By.id("myInputText")).sendKeys("chaitanya");
		driver.findElement(By.id("myInputTextArea")).sendKeys("welcome to chaitanya");
		WebElement select1=driver.findElement(By.id("mySelect"));
		Select select=new Select(select1);
		select.selectByVisibleText("option3");
		driver.findElement(By.linkText("click me to show content")).click();
		driver.findElement(By.id("myCheckbox")).click();
		System.out.println("click on checkbox");
		WebElement el=driver.findElement(By.linkText("click me to open a new window"));
		el.click();
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement clickmeelement=driver.findElement(By.linkText("click me to open a new window"));
		clickmeelement.click();
		System.out.println("Current window id: "+driver.getWindowHandle()); 
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);

		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "satix new window");

		driver.findElement(By.id("newInputText")).sendKeys("kommineni");

		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());

		driver.switchTo().frame("subFrame");
		driver.switchTo().frame("frameHeader");
		driver.findElement(By.xpath("html/body/div/h3"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("subFrame");
		driver.switchTo().frame("frameDetail");
		driver.findElement(By.id("myBtn2")).click();
		driver.close();

	}


}
