// PERFORM CONTEXT CLICK OR RIGHT CLICK....

package com.selenium.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick 
{
	
	@Test
	public void contextclickPerform()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Right Click Me')]"));
		
		WebDriverWait waits = new WebDriverWait(driver, 5);
		waits.until(ExpectedConditions.visibilityOf(ele));
		
// SCROLLING THE WINDOW TILL VISIBLE THE CONTEXT CLICK BUTTON...		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		/*WebDriverWait waits1 = new WebDriverWait(driver, 5);
		waits1.until(ExpectedConditions.visibilityOf(ele));
		*/
		
		Actions Act_contextclick = new Actions(driver);
		Act_contextclick.contextClick(ele).perform();
		
		WebElement messageEle = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
		String msg =messageEle.getText();
		
		Assert.assertEquals(msg, "You have done a right click");
		
	}
	

}
