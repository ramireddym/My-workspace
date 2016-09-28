import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Class {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*WebElement ele=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[1]"));
		ele.click();*/
		
	        driver.findElement(By.xpath("//div[@role='listbox']")).sendKeys("June");
	        //driver.findElement(By.xpath("//div[@text()='June']")).sendKeys("June");
}
}
