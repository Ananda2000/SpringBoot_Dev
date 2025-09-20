package com.selenium.parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import net.bytebuddy.agent.builder.AgentBuilder.Default.BootstrapInjectionStrategy.Enabled;

public class SimpleParallel_Launch 
{
	

	
	@Test(enabled=true,description="This is parallel testing..")
	public void test001( )
	{
		WebDriver driver ;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//Assert.assertEquals(true, false);
		
	}
	
	@Test()
	public void test002()
	{
		WebDriver driver1 ;
		WebDriverManager.firefoxdriver().setup();
		driver1 = new FirefoxDriver();
		driver1.get("https://demoqa.com/select-menu");
		driver1.manage().window().maximize();
		
	}
	
	/*@Test()
	public void test003()
	{
		System.out.println("this is test method --test003--");
		
	}
	
	@Test()
	public void test004()
	{
		System.out.println("this is test method --test004--");
		
	}

	
	@Test()
	public void test005()
	{
		System.out.println("this is test method --test005--");
		
	}

	
	@Test()
	public void test006()
	{
		System.out.println("this is test method --test006--");
		
	}
*/
}
