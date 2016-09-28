package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testinglivesite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Tirupati (TIR)")).click();
		driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		driver.findElement(By.linkText("12")).click();
		WebElement mvr=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select select=new Select(mvr);
		select.selectByVisibleText("4 Adults");

		//        WebElement mvr1=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		//        Select select1=new Select(mvr1);
		//        select.selectByIndex(3);
		//        
		//        WebElement mvr2=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		//        Select select2=new Select(mvr2);
		//        select.selectByValue("4 Infants");

		WebElement mvr3=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select3=new Select(mvr3);
		select.selectByVisibleText("Indian Rupee(INR)");

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();





	}

}
