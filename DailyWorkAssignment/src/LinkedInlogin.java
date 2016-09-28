import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedInlogin {
	WebDriver driver;
	/*@Before
	@Given("^browser as \"([^\"]*)\" And URL as \"([^\"]*)\"$")
	public void browser_as_And_URL_as(String browser, String URL) throws Throwable {
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
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("^user logs in using Username  And Password$")
	public void user_logs_in_using_Username_And_Password(DataTable usercredentials) throws Throwable {
		List<List<String>> data = usercredentials.raw();
		WebElement ele=driver.findElement(By.id("login-email"));
		ele.clear();
		ele.sendKeys(data.get(1).get(0));
		WebElement ele1=driver.findElement(By.id("login-password"));
		ele1.clear();
		ele1.sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//input[@value='Sign in']")).click(); 
		
		WebElement ele2=driver.findElement(By.id("login-email"));
		ele2.clear();
		ele2.sendKeys(data.get(0).get(0));
		WebElement ele3=driver.findElement(By.id("login-password"));
		ele3.clear();
		ele3.sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();  
	}
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		//Assert.assertEquals("Sign In | LinkedIn", driver.getTitle());
		System.out.println("Login ");   
	}
	
	@Then("^login functionality$")
	public void login_functionality() throws Throwable {
		Assert.assertEquals("Sign In | LinkedIn", driver.getTitle());
		System.out.println("Login ");
	}
	*/
	@After
	public void quite()
	{
		driver.quit();
	}

}
