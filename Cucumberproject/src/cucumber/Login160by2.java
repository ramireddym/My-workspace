package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login160by2 {
	WebDriver driver;
	@Before
	public void setup(){
		System.out.println("GoTo browser");
	}
	@Given("^url as \"([^\"]*)\" browser as \"([^\"]*)\"$")
	public void url_as_browser_as(String Url, String Browser) throws Throwable {

		if(Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Venkata Rami Reddy\\testing softwares\\chromedriver.exe");
			 driver=new ChromeDriver();	 
		}
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	}

	@When("^username is\"([^\"]*)\" And password is\"([^\"]*)\" And click  loginButton$")
	public void username_is_And_password_is_And_click_loginButton(String username, String password) throws Throwable {
	   driver.findElement(By.id("username")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("^Verify the (\\d+)by(\\d+) login success$")
	public void verify_the_by_login_success(int arg1, int arg2) throws Throwable {
	    
	}

	@Then("^Verify the (\\d+)by(\\d+) login Fail$")
	public void verify_the_by_login_Fail(int arg1, int arg2) throws Throwable {
	   
	}

	/*@Given("^url as http://www\\.(\\d+)by(\\d+)\\.com/Index browser asFirefox$")
	public void url_as_http_www_by_com_Index_browser_asFirefox(int url, int browser) throws Throwable {
		

			if(Browser.equals("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(Browser.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else if(Browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","D:\\Venkata Rami Reddy\\testing softwares\\chromedriver.exe");
				 driver=new ChromeDriver();	 
			}
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
		}
	    
	

	@When("^username is(\\d+) And password is(\\d+)$")
	public void username_is_And_password_is(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify the success$")
	public void verify_the_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^url as http://www\\.(\\d+)by(\\d+)\\.com/Index browser aschrome$")
	public void url_as_http_www_by_com_Index_browser_aschrome(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify the Fail$")
	public void verify_the_Fail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/
	@After
	public void quit()
	{
		System.out.println("close the browser");
		driver.quit();
	}

}
