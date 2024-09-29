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

public class NavigationCmds4 
{
	
		public static void main(String args[])
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://learn-automation.com/");
			System.out.println("Title 1 is " +  driver.getTitle());
			
			driver.navigate().to("https://in.yahoo.com/");
			System.out.println("Title 2 is " +  driver.getTitle());
			
			driver.get("https://in.linkedin.com/");
			System.out.println("Title 3 is " +  driver.getTitle());
			
			driver.navigate().back();
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			driver.navigate().refresh();
			
			driver.navigate().refresh();
			
			
			
			
			
			
		}
		
		
}

	
	
	
	
	
	

	
	
	
	


