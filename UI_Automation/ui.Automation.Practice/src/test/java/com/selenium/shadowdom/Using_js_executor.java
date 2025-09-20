// HERE WE ARE USING JAVA SCRIPT EXECUTOR...

package com.selenium.shadowdom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Using_js_executor 
{
	@Test
	public void Test001()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/shadow");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Shadow shadow = new Shadow(driver);
		// THIS IS FOR OPEN SHADOW DOM....
		shadow.findElementByXPath("//input[@id='fname']").sendKeys("testing firstname 998");
		
		// THIS IS FOR CLOSED SHADOW DOM..
		WebElement closed_shadow = driver.findElement(By.xpath("//div[@class='field']/child::my-web-component"));
		
		WebElement rootnode =(WebElement)js.executeScript("return arguments[0].shadowRoot.getElementByClass('control').shadowRoot.getElementByID('lname').click", closed_shadow);
		rootnode.sendKeys("clsoed shadow dome");				  
		
	}

}
