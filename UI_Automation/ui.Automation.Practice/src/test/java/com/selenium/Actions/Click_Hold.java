package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Hold 
{
	
	@Test
	public void click_and_hold()
	{
		System.out.println("Testing purpose---");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//div[@class='fade tab-pane']/preceding-sibling::div/child::div/child::div[@id='draggable']"));
		
		Actions clickHold_action = new Actions(driver);
		clickHold_action.moveToElement(ele).clickAndHold().build().perform();
		
		
		
		
	}

}
