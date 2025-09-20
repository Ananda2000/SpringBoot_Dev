package com.selenium.Waits;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait 
{
	
	
	@Test
	public void implicitwait_implementation()
	{
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 System.out.println("testing chrome driver..");
		 
		long beforeTime = System.currentTimeMillis();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 long afterWaitTime = System.currentTimeMillis();
		 System.out.println( afterWaitTime - beforeTime +"  --Wait period --");
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		
		 
	}

}
