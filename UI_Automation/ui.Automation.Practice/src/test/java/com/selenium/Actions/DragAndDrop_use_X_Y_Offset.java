package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop_use_X_Y_Offset 
{
	@Test
	public void useOf_X_Y_offset()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/droppable/");
		DriverMaximize_Utility.windowMaximize(driver);
		
		WebElement from =driver.findElement(By.xpath("//div[@id='simpleDropContainer']/child::div[@id='draggable']"));
		WebElement to =driver.findElement(By.xpath("//div[@id='simpleDropContainer']/child::div[@id='draggable']/following-sibling::div"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", to);
		
		Actions offsetWise = new Actions(driver);
		
		int X_offset_from = from.getLocation().getX();
		int Y_offset_from = from.getLocation().getY();
		
		
		int X_offSet_To  = to.getLocation().getX();
		int Y_offSet_To = to.getLocation().getY();
		
		int xoffset = (X_offSet_To - X_offset_from)+10;
		int yoffset =		(Y_offSet_To - Y_offset_from)+20;
		
		offsetWise.dragAndDropBy(from, xoffset, yoffset).build().perform();
		
		String Bg_color = to.getCssValue("background-color");
		System.out.println(Bg_color);
		System.out.println(Color.fromString(Bg_color).asHex());
		System.out.println(Color.fromString(Bg_color).getColor());
		
		
		
		
		
		
		
		
		
		
		
	}

}








