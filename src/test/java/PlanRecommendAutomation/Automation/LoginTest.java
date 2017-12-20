package PlanRecommendAutomation.Automation;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginTest {
	
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","/Users/ratnakar/Downloads/chromedriver");		
		driver= new ChromeDriver();
				
	}
	@Test
	public void doLogin()
	{
		driver.get("https://www.google.com/");
		System.out.println("hello");
	}
	
	@AfterTest
	public void teardown()
{
	driver.quit();
}

}
