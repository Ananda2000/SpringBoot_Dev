package com.selenium.WindowsHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentWindow_id_reading 
{
	
	@Test
	public void parentwindowIdDisplay() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	String parentWindow = driver.getWindowHandle();
	Thread.sleep(3000);
	System.out.println("The parent window id --"+parentWindow);
		
		
	}

}
