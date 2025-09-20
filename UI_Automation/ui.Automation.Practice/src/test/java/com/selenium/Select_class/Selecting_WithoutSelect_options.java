// THIS PROGRAM DROPDOWN OPTIONS WILL DISPLAY AFTER CLICKING ON SELECT BUTTON..


package com.selenium.Select_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_WithoutSelect_options 
{
	
	@Test
	public void dropdowns_afterClick()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
				
		WebElement ele = driver.findElement(By.xpath("//div[@id='selectOne']/child::div/child::div/child::div[text()='Select Title']"));
				
		ele.click();
	}

}
