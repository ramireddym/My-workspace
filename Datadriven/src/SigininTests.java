import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SigininTests {
	
WebDriver driver;
	
	@DataProvider(name="getusernameandpassword")
	public Object[][] getUserNameAndPassword() throws FileNotFoundException, IOException{
		Properties props = new Properties();
		props.load(new FileInputStream(new File("gmail.properties")));
		int size = props.size();
		String[][] str =  new String[size/2][2];
		for(int i=0;i<size/2;i++){
			str[i][0] = props.getProperty("UserID"+i);
			str[i][1] = props.getProperty("Password"+i);
		}
		return str;
	}
	
	@BeforeMethod(groups={"Regression","Smoke"})
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/*@Test(dataProvider="getusernameandpassword")
	public void login(String username, String password)
	{
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(password);
		driver.findElement(By.id("signIn")).click();	
	}*/
	
	@Test(dataProvider="getusernameandpassword")
	public void logintest(String username,String password)
	{
		gmailpage sigin = new gmailpage(driver);
		sigin.login(username, password);
		driver.findElement(By.xpath("//div[text()='COMPOSE']"));
		System.out.println("Welcome to gmail home page");
		 
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
