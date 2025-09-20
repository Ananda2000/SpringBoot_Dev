package com.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	
	@Test
	public void explicitWaitsTesting()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebDriverWait expliticWait = new WebDriverWait(driver, 3);
	WebElement ele=	expliticWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bad-request")));
	System.out.println(ele.getText());
	Assert.assertEquals(ele.isDisplayed(), true);
		
		
	}

}
