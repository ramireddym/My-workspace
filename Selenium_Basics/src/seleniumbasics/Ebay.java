package seleniumbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ebay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", 
				"D:\\Venkata Rami Reddy\\softwares\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement mvr=driver.findElement(By.id("gh-cat"));
		Select select=new Select(mvr);
		select.selectByVisibleText("Books");
		driver.findElement(By.id("gh-ac")).sendKeys("tendulkar");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.linkText("Playing It My Way, Tendulkar, Sachin, New Books")).click();
		driver.findElement(By.id("qtyTextBox")).clear();
		driver.findElement(By.id("qtyTextBox")).sendKeys("1");
		driver.findElement(By.linkText("Buy It Now")).click();
		driver.findElement(By.xpath(".//*[@id='regTab']")).click();
		driver.findElement(By.id("email")).sendKeys("ramireddy51@hotmail.com");
		driver.findElement(By.id("remail")).sendKeys("ramireddy51@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='showPASSWORD']/ul/li/span[1]")).isSelected();
		driver.findElement(By.id("PASSWORD")).sendKeys("9989560641@3");
		driver.findElement(By.id("firstname")).sendKeys("venkataramireddy");
		driver.findElement(By.id("lastname")).sendKeys("mareddy");
		WebElement mvr1=driver.findElement(By.xpath(".//*[@id='selected-flag-phonephoneFlagComp1']"));
		mvr1.click();
		driver.findElement(By.xpath(".//*[@id='country-flag-in-phoneFlagComp1']/span[1]")).click();
		/*Select select2=new Select(mvr1);
		select.selectByVisibleText("Canada");*/
		driver.findElement(By.id("phoneFlagComp1")).sendKeys("9989593467");
		driver.findElement(By.id("sbtBtn")).click();
		
		
		
		WebElement mvr2=driver.findElement(By.id("countryId"));
		mvr2.click();
		Select select3=new Select(mvr2);
		select.selectByIndex(95);
		driver.findElement(By.id("address1")).sendKeys("3-119ambapuram,gurazala,guntur");
		driver.findElement(By.id("address2")).sendKeys("balaji nager,kp,hyd");
		driver.findElement(By.id("city")).sendKeys("Guntur");
		WebElement mvr3=driver.findElement(By.id("state"));
		Select select4=new Select(mvr3);
		select.selectByValue("AP");
		driver.findElement(By.id("zip")).sendKeys("522415");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("phonePart0")).sendKeys("9704367212");
		driver.findElement(By.linkText("Text me now")).click();
		//#@#@#@#@#@########@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@###
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.id("1586847027")).clear();
		driver.findElement(By.id("1586847027")).sendKeys("mareddy697@gmail.com");
		driver.findElement(By.id("307204936")).sendKeys("9989560641@3");
		driver.findElement(By.id("csi")).isSelected();
		driver.findElement(By.id("sgnBt")).click();
		//		driver.findElement(By.id("incentive-input")).sendKeys("GOODNOW");
		//		driver.findElement(By.id("incentive-apply")).click();
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement mvr4=driver.findElement(By.id("PAYPAL"));
		mvr4.isSelected();
		System.out.println("Current window id: "+driver.getWindowHandle()); 
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);
		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Pay with PayPal");
		driver.findElement(By.id("username")).sendKeys("ramireddy591@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9989560641@3");
		driver.findElement(By.xpath("//label[@class='ng-binding']")).isSelected();
		driver.findElement(By.id("btn full loginBtn")).click();
		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());
	}
}


