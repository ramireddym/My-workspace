import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class gmailpage {
	WebDriver driver;
	
	public gmailpage(WebDriver driver) {
		this.driver=driver;
	}
	public void login(String username,String password)
	{
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(password);
		driver.findElement(By.id("signIn")).click();
	}

}
