// HERE WE ARE TAKING SCREENSHOT FOR A PARTICULAR ELEMENT IN WEBPAGE..

package com.selenium.TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.support.FindElementBy;

public class Screenshot_ParticularElement 
{
	@Test
	public void Sc_withElement()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Buttons']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ANANDA K R\\Desktop\\Desktop\\ScreenShots\\webelement_anand.jpg");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
