package cucumber;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Facebooklogin {
	WebDriver driver;
	@Given("^Url as\"([^\"]*)\" and browser as \"([^\"]*)\"$")
	public void url_as_and_browser_as(String url, String browser) throws Throwable {
	    
		if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Venkata Rami Reddy\\testing softwares\\chromedriver.exe");
			 driver=new ChromeDriver();	 
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/*@When("^username is\"([^\"]*)\" And password is\"([^\"]*)\" And click \"([^\"]*)\"$")
	public void username_is_And_password_is_And_click(String username, String password, String button) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(username);
	   driver.findElement(By.id("pass")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@value='Log In']")).click();
	   Assert.assertEquals(driver.getTitle(), "(1) Facebook");
	}*/
	@When("^username is<email> And password is<password> And click loginButton$")
	public void username_is_email_And_password_is_password_And_click_loginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("email");
		   driver.findElement(By.id("pass")).sendKeys("password");
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   Assert.assertEquals(driver.getTitle(), "(1) Facebook");
	}

	@Then("^Verify the facebook login$")
	public void verify_the_facebook_login(DataTable arg1) throws Throwable {
	    
	    
	}

	@When("^username is\"([^\"]*)\" And password is\"([^\"]*)\" And click loginButton$")
	public void username_is_And_password_is_And_click_loginButton(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Display Error message$")
	public void display_Error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify the facebook login$")
	public void verify_the_facebook_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
