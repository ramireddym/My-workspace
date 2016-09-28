package cucumber;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Icicinetbankinglogin {
	WebDriver driver;
	@Given("^Given URL as \"([^\"]*)\" and browser as \"([^\"]*)\"$")
	public void given_URL_as_and_browser_as(String url, String browser)  {
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
	    
	

	@When("^userid is \"([^\"]*)\"$")
	public void userid_is(String userid) {
	    driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys(userid);
	    
	}

	@When("^password is\"([^\"]*)\"$")
	public void password_is(String password)  {
	   driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys(password);
	    
	}
	@When("^click the \"([^\"]*)\"$")
	public void click_the(String arg1)  {
	    driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();

	}

	@Then("^Verify Icicibanking Home Page$")
	public void verify_Icicibanking_Home_Page()  {
		driver.findElement(By.xpath("//p[@id='LoginName'][text()='BONGURAM TRIVENI']"));
		System.out.println("Welcome to Icicinetbanking");
	    
	}
	
	
	
	@Then("^Verify error message \"([^\"]*)\" displayed$")
	public void verify_error_message_displayed(String arg1)  {
		System.out.println("Display error message");
		driver.findElement(By.xpath("//p[@id='LoginName'][text()='BONGURAM TRIVENI']"));
		
	   
	}

}
