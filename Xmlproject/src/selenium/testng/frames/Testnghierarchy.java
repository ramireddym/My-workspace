package selenium.testng.frames;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testnghierarchy {
	WebDriver driver;
	@Test
	public void test1()
	{
		System.out.println("Hai ");
	}

	@Test
	public void test2()
	{
		System.out.println("Hello ");
	}

	@Test
	public void test3()
	{
		System.out.println("How are you");
	}


	@Test
	public void test4()
	{
		System.out.println("what are you ");
	}


	@Test
	public void test5()
	{
		System.out.println("doing right now ");
	}


	@Test
	public void test6()
	{
		System.out.println("Any problem Please infrom");
	}

	@BeforeMethod
	public void name1()
	{
		System.out.println("this will execute before every method");
	}

	@AfterMethod
	public void name2()
	{
		System.out.println("this will execute after every method");
	}

	@BeforeClass
	public void name3()
	{
		System.out.println("this wiil execute before every class");
	}

	@AfterClass
	public void name4()
	{
		System.out.println("this wiil execute after every class");
	}

	@BeforeTest
	public void name5()
	{
		System.out.println("this wiil execute before every test");
	}

	@AfterTest
	public void name6()
	{
		System.out.println("this wiil execute after every test");
	}

	@BeforeSuite
	public void name7()
	{
		System.out.println("this wiil execute before every suite");
	}

	@AfterSuite
	public void name8()
	{
		System.out.println("this wiil execute after every suite");
	}

}
