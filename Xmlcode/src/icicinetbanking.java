import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class icicinetbanking {
WebDriver driver;
@BeforeMethod
public void setup(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&_ga=1.142288186.924139891.1472195120");
	
}
@Test(dataProvider="nameandpassword")
public void login(String Username,String Password){
	driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys(Username);
    driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys(Password);
    driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();


}
@DataProvider(name="nameandpassword")
public Object[][] getusernameandpassword() throws FileNotFoundException, IOException{
	Properties prop=new Properties();
	prop.load(new FileInputStream(new File("C:\\Users\\viswas\\workspace\\Xmlcode\\icici.properties")));
	String str= prop.getProperty("UserID");
	String st=prop.getProperty("Password");
	String[][] string = new String[1][2];
	string[0][0]=str;
	string[0][1]=st;
return string;
}
 }
