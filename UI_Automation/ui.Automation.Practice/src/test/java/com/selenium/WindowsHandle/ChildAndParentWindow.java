package com.selenium.WindowsHandle;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildAndParentWindow 
{
	@Test
	public void child_And_parentID_Display()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");
		WebElement Newwindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		String parentid = driver.getWindowHandle();
		
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		explicitWait.until(ExpectedConditions.visibilityOf(Newwindow));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollIntoview();", Newwindow);
		js.executeScript("arguments[0].scrollIntoView();", Newwindow);
		
		if(Newwindow.isDisplayed())
		{
		Newwindow.click();
		}
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent window ID --- "+parentWindowId);
		Set<String> allwidnowid = driver.getWindowHandles();
		System.out.println("Size of total windws opened --- "+allwidnowid);
		
		Iterator<String> str = allwidnowid.iterator();
		while(str.hasNext())
		{
			if(parentid !=str.next())
			{
				String childid =str.next();
			System.out.println("The child id --"+childid);
			driver.switchTo().window(childid);
			WebElement childtext = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String stt = childtext.getText();
			System.out.println("This is text in child winld --"+ stt);
			driver.close();
			}
		}
		
	}

}
