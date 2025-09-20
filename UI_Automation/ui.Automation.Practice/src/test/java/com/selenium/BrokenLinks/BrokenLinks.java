package com.selenium.BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
	@Test
	public void checkbrokenLinks() throws IOException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='linkWrapper']/p/a"));
		System.out.println(ele.size());
		for (WebElement webElement : ele) 
		{
			String texxt = webElement.getText();
			System.out.println(texxt);
			String url = webElement.getAttribute("href");
			System.out.println(url);
			
			if(url.startsWith("http://") || url.startsWith("https://"))
			{
			URL link = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) link.openConnection();
			conn.connect();
			int code = conn.getResponseCode();
			if(code >=400)
			{
				System.out.println("------------------It is a broken link -------------------" + url);
			}
			else
			{
				System.out.println("------------------NOT BROKEN LINK ----"+ url);
			}
			}
			else
			{
				System.out.println("------------------It is a broken link -------------------"+ url);
			}
			
		}
	}

}
