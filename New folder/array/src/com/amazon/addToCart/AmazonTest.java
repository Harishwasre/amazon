package com.amazon.addToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		 AmazonElements amazon =new  AmazonElements (driver);
		 amazon.login();
		 amazon.SelectionMobile();

	}

}
