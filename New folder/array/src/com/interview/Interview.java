package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interview {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("stack overflow",Keys.ENTER);
		driver.findElement(By.partialLinkText("stackoverflow.com")).click();
		WebElement sb = driver.findElement(By.xpath("//a[@class='s-topbar--menu-btn js-left-sidebar-toggle']"));
		sb.click();
		Actions a=new Actions(driver);
		WebElement tag = driver.findElement(By.xpath("(//div[@class='d-flex ai-center'])[2]"));
		a.moveToElement(tag).clickAndHold().keyDown(Keys.CONTROL);
		a.sendKeys(Keys.ENTER);
		a.keyUp(Keys.CONTROL).build().perform();

		 
		  
	
		
	}
}
