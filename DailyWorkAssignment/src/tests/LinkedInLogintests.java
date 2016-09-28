package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LinkedInLoginpage;

public class LinkedInLogintests {
	WebDriver driver;

	@DataProvider(name="getusernameandpassword")
	public Object[][] getUserNameAndPassword() throws FileNotFoundException, IOException{
		Properties props = new Properties();
		props.load(new FileInputStream(new File("LinkedInLogin.properties")));
		int size = props.size();
		String[][] str =  new String[size/2][2];
		for(int i=0;i<size/2;i++){
			str[i][0] = props.getProperty("Username"+i);
			str[i][1] = props.getProperty("Password"+i);
		}
		return str;
	}
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test(dataProvider="getusernameandpassword")
	public void logintest(String Username,String Password)
	{	
		LinkedInLoginpage singin= new LinkedInLoginpage(driver);
		singin.login(Username,Password);
		Assert.assertEquals(driver.getTitle(), "Welcome! | LinkedIn");
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}



