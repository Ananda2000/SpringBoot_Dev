package com.selenium.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick_Method 
{
	@Test
	public void Double_clickPerform()
	{
		WebDriver driver;
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
// Creating the instance of Action class.	
		Actions action= new Actions(driver);
		WebElement doubleClickElement = driver.findElement(By.id("doubleClickBtn"));
// After done the double click it will open another tab , so the windows count will increate
//I used getWindowHandles() method and pulling the size.
		action.doubleClick().click(doubleClickElement).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Set<String> windows = driver.getWindowHandles();
		Assert.assertEquals(windows.size(), 1);

		
	}

}
