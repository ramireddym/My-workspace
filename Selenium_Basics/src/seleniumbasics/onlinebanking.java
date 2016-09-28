package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class onlinebanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");

		driver.findElement(By.xpath("html//body//form//table[2]//tbody//tr//td[2]//table//tbody//tr[1]//td[1]//table//tbody//tr[3]//td[2]//table//tbody//tr[6]//td[2]//a//img")).click();



	}

}
