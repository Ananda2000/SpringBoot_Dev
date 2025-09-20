// In this class we move the element to particular element and perform click operation.
// Using meesho website...


package com.Selenium.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement 
{
	@Test
	public void mouseOverAndclick() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/elec-b2b-store?fm=neo%2Fmerchandising&iid=M_a6b8a544-0fe8-4004-9cf4-c6d0dec20582_1_X1NCR146KC29_MC.8S96M66IX7U4&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Electronics%2BGST%2BStore_8S96M66IX7U4&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=8S96M66IX7U4");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		
		WebElement moveele = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		act.moveToElement(moveele).perform();
	
		
		WebElement selec = driver.findElement(By.xpath("//a[@title='Remote Control Toys']"));
		act.moveToElement(selec);
		act.click().build().perform();
		
	}

}


//p[text()='All Baby Care'] --> webelement for inside kids tag.
//span[text()='Baby Care']/../following-sibling::a/p[text()='All Baby Care']
