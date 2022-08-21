package com.amazon.addToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	WebDriver driver;
	AllMethodes all;
	AmazonElements amazon;
	@BeforeClass
	public void browserlaunch(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}
	@Test
public void login() {
		
	amazon=new AmazonElements(driver);
	amazon.login();
	
	amazon.SelectionMobile();
}

}
