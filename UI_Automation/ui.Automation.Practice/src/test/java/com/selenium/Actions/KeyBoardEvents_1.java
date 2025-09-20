// THIS TEST CASE IS PERFORMING THE KEYBOARD EVENTS LIKE , SELECT ALL, COPY AND PASTE.

package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents_1 
{
	@Test
	public void KeyboardEvents_Select_copy_paste()
	{
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		DriverMaximize_Utility.windowMaximize(driver);
		
		WebElement Fullname =driver.findElement(By.xpath("//label[text()='Full Name']/../following-sibling::Div/input[@id='userName']"));
		Fullname.sendKeys("Ravi Kumar");
		
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@id='userEmail']"));
		EmailAddress.sendKeys("thisisemail@gmail.com");
		
		WebElement Current_address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Current_address.sendKeys(Keys.CONTROL);
		Current_address.sendKeys(Keys.SHIFT);
		
		Current_address.sendKeys("5th cross, 6th main - hcm layout --");
		WebElement permanent_address = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		Actions actions= new Actions(driver);
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys("v");
		actions.keyUp(Keys.SHIFT);
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		
		// Here selecting all text from current address.
		/*Current_address.sendKeys(Keys.CONTROL);
		Current_address.sendKeys("A");
		Current_address.sendKeys(Keys.CONTROL);
		Current_address.sendKeys("C");
// Here am shifting the cursor to permanent address tab.
		Current_address.sendKeys(Keys.TAB);
		*/
		
	/*	permanent_address.sendKeys(Keys.CONTROL);
		permanent_address.sendKeys("V");*/
		
		Assert.assertEquals(Current_address.getAttribute("value"), permanent_address.getAttribute("value"));
		
	}

}
