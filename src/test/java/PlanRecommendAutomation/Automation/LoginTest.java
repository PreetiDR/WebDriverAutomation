package PlanRecommendAutomation.Automation;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
				driver= new FirefoxDriver();
				
	}
	@Test
	public void doLogin()
	{
		driver.get("http://planselect.dzeecloud.com/employeePlanSelection/#!/");
		System.out.println("hello");
	}
	
	@AfterTest
	public void teardown()
{
	driver.quit();
}

}
