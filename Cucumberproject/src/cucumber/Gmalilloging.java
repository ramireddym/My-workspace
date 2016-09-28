package cucumber;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Gmalilloging {
	WebDriver driver;
	@Before
	public void setup(){
		System.out.println("GoTo browser");
	}
	@Given("^browser as \"([^\"]*)\" And URL as \"([^\"]*)\"$")
	public void browser_as_And_URL_as(String browser, String url) throws Throwable {
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

	@When("^username is \"([^\"]*)\" And click \"([^\"]*)\" And password is \"([^\"]*)\" And click on Login \"([^\"]*)\"$")
	public void username_is_And_click_And_password_is_And_click_on_Login(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(arg1);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(arg3);
		driver.findElement(By.id("signIn")).click();
		driver.quit();
	}

	@Then("^Verify Gmail Home Page$")
	public void verify_Gmail_Home_Page() throws Throwable {
		driver.findElement(By.xpath("//div[text()='COMPOSE']"));
		System.out.println("Welcome to gmailhome page");
	}

	@Then("^Display the Error message$")
	public void display_the_Error_message() throws Throwable {
		System.out.println("Display Error message");
		driver.findElement(By.xpath("//div[text()='COMPOSE']")); 
	}
	@After
	public void quit(){
		System.out.println("close window");
	}
}
