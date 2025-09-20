package ui.Automation.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTesting 
{
	@Test
	public void TestLaunch() throws InterruptedException
	{
		
			WebDriver driver;
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 System.out.println("testing chrome driver..");
			 driver.manage().window().maximize();
	Thread.sleep(3000);
			 //driver.navigate().to("www.gmail.com");
			driver.get("https://www.facebook.com/");
			 System.out.println("Gmail launching..");
		}
	

}
