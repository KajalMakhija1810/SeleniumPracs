package navigationcmds;
/*  Write a Selenium script using the TestNG framework in a Maven project to automate web navigation 
 * and verify web page titles.
 */  



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCmds3 
{
	
		public static void main(String args[])
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://learn-automation.com/");
			String title =driver.getTitle();
		
		
		   String url =  driver.getCurrentUrl();
		   System.out.println("Current Url is " + url);
		   String src = driver.getPageSource();
		   
		   driver.quit();		   
		}
		
		
}

	
	
	
	
	
	

	
	
	
	


