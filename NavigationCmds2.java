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

public class NavigationCmds2 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testNavigationCmds()
	{
		//1.Navigating to main page
		driver.get("https://the-internet.herokuapp.com/");
		
		//2.Clicking to A/b test For Navigating to Another Page
		driver.findElement(By.linkText("A/B Testing")).click();
		System.out.println("Title after Clicking  A/B testing" + driver.getTitle());
		
		//3.Navigate Back
		driver.navigate().back();
		System.out.println("Title after Navigating Back" + driver.getTitle());
		
		//4.Navigate Fwd to A/B  Testing  again
		driver.navigate().forward();
		System.out.println("Title after Navigating Fwd" + driver.getTitle());
		
		//5.Refresh Page
		driver.navigate().refresh();
		System.out.println("Title after Refreshing" + driver.getTitle());
		
		//6.Click on Key Press to Navigate to that Page
		//driver.findElement(By.linkText("Key Presses")).click();
		//System.out.println("Title after Clicking Key Press" + driver.getTitle());
		
		//7.Navigating Back
		driver.navigate().back();
		System.out.println("Title after Navigating back" + driver.getTitle());
		
		
		//8.Clicking to Checkboxes to Navigate to another page
		driver.findElement(By.linkText("Checkboxes")).click();
		System.out.println("Title Clicking Checkboxes  Pages " + driver.getTitle());
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
		
		
}

	
	
	
	
	
	

	
	
	
	


