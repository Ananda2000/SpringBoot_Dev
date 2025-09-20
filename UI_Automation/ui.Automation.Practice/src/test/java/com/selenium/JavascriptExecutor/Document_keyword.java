package com.selenium.JavascriptExecutor;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Document_keyword 
{
	WebDriver driver;
	@Test
	public void useOfDocument() throws InterruptedException
	{
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			System.out.println("testing chrome driver.."); 
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("Gmail launching..");
			Thread.sleep(3000);
			js.executeScript("document.getElementById('email').value ='alksdlkdf';");
		}
	}

}
