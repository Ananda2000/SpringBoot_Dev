package com.selenium.Actions;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop 
{
	@Test()
	public void Use_DragAnddropMethod()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//div[@id='simpleDropContainer']/child::div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='simpleDropContainer']/child::div[@id='draggable']/following-sibling::div"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", from);
		
		
		
		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDrop(from, to).perform();
		
		String dropBgcolor = to.getCssValue("background-color");
		System.out.println("Back ground color ---"+dropBgcolor);
		String colorInHexa = org.openqa.selenium.support.Color.fromString(dropBgcolor).asHex();
		
		System.out.println("BackGround In HexaDecimal --"+colorInHexa);
		Assert.assertEquals(colorInHexa, "#4682b4");
		
		
		
	}

}









