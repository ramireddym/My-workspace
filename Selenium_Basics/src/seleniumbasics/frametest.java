package seleniumbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Venkata%20Rami%20Reddy/softwares/SeleniumTest/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("myHeader");
		WebElement myHeader=driver.findElement(By.xpath("//h3[contains(text(),'Welcome')]"));
		System.out.println(myHeader.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myNavigation");
		driver.findElement(By.linkText("tree")).click();
		driver.findElement(By.linkText("Handle Alert")).click();
		Alert alert=driver.switchTo().alert();
		String alert1=alert.getText();
		System.out.println(alert1);
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myDetail");
		driver.findElement(By.xpath(".//input[@id='myBtn']")).click();
		Alert alert2=driver.switchTo().alert();
		String alert3=alert.getText();
		System.out.println(alert2);
		alert.accept();
		driver.findElement(By.id("myInputText")).sendKeys("Hai RamiReddy");
		driver.findElement(By.id("myInputTextArea")).sendKeys("Hai friends what are you doing ");
		//driver.findElement(By.xpath(".//select[@id='mySelect']")).click();
		//driver.findElement(By.xpath("//option[@value='option1_value']")).click();
		driver.findElement(By.linkText("click me to show content")).click();
		//Actions action = new Actions(driver);
		//action.moveToElement(ApplyOnlineelement);
		//action.build().perform();
		driver.findElement(By.id("myCheckbox")).click();
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
		driver.findElement(By.id("newInputText")).sendKeys("Hello Mareddy");
		driver.close();

		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());

		driver.switchTo().defaultContent();
		driver.switchTo().frame("subFrame");

		driver.switchTo().frame("frameHeader");
		WebElement frameHeader=driver.findElement(By.xpath("//h3[(text()='This is frame header')]"));
		System.out.println(frameHeader.getText());
		driver.switchTo().frame("frameDetail");
		driver.findElement(By.id("myBtn2")).click();	


	}

}
