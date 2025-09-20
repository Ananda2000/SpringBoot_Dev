// In this class we perform moveToElement Action using Actions class..

package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement_action 
{
	@Test
	public void MoveToElement()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement MoveTo = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", MoveTo);
						//arguments[0].scrollIntoView();
		
		Actions act_moveTo = new Actions(driver);
		act_moveTo.moveToElement(MoveTo).contextClick().perform();
		
		
	}

}
