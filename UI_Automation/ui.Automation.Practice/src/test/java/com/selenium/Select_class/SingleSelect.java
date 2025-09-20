// HERE WE PERFORMING SELECTING SINGLE OPTIONS FROM DROPDOWN. USING SELECT CLASS....
package com.selenium.Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelect 
{

	@Test
	public void Select_single()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
// HERE WE ARE LAUNCHING THE URL....
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
//	HERE WE SELECTING OPTIONS FROM SELECT ONE DROPDOWN FROM URL...
		
	// HERE WE ARE SELECTING THE COLORS ------------------
		WebElement select_oneDropwon = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		
		Select selectclass= new Select(select_oneDropwon);
		
		boolean checkmultiSelect = selectclass.isMultiple();
		if(checkmultiSelect==false)
		{
		List<WebElement> Dropdown_Options=	selectclass.getOptions();
		
		for( WebElement ele : Dropdown_Options)
		{
			System.out.println(ele.getText());
		}
		}
			

		
// ---------- HERE WE ARE SELECTING CARS LIST -------------
		WebElement select_cars =driver.findElement(By.xpath("//b[text()='Standard multi select']/../following-sibling::select[@name='cars']"));
		Select select_Cars = new Select(select_cars);
		
		boolean selectcar = select_Cars.isMultiple();
		if(selectcar)
		{
			select_Cars.selectByIndex(0);
			select_Cars.selectByValue("saab");
			select_Cars.selectByVisibleText("Opel");
		}
		
		
		
	}
}
