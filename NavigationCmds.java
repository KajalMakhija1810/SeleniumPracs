package navigationcmds;
/*  Write a Selenium script using the TestNG framework in a Maven project to automate web navigation 
 * and verify web page titles.
 */  


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCmds 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void quit()
	{
	driver.quit();
		
	}
	@Test
	public void testBasicNavigationHerokuapp()
	{
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Title :- " + driver.getTitle());
		
	}
	
	@Test
	public void testFwdNavigation()
	{
		driver.get("https://app.vwo.com/#/login");
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("Current URL :- " + driver.getCurrentUrl());
		
	}
		
		
		
	}
	
	
	
	


