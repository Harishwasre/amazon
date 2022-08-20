package com.AmazonAddToCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browserlunch extends TestClass {
	
	Actions ac;
	
//	WebDriver driver;
	public void browserLunch()  {

//		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
//		driver.get("http://amazon.in");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}

	public void login(  WebElement element) {
		
	element.click();
	}

	public void email(WebElement element, String text) {
		element.sendKeys(text, Keys.ENTER);
	}

	public void password(WebElement element, String text) {
		element.sendKeys(text, Keys.ENTER);
	}

	public void alltab(WebElement element) {
		element.click();
	}

	@SuppressWarnings("deprecation")
	public void allmobile(WebElement element,WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void Mobile(WebElement element,WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public void selectItem(WebElement element,WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public void addToCart(WebElement element,WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public void refreshpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	public void checkcart(WebElement element,WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public void afterAddSubtotal(WebElement element,WebDriver driver) {
		String afterAddSubtotal=element.getText();
		System.out.println("afterAddSubtotal"+afterAddSubtotal);
	}
	public void deletebtn(  WebElement element) {
		Select s=new Select(element);
		s.selectByValue("0");
	
	}

	public void removefromsubtotal(WebElement element,WebDriver driver) {
		String afterremoveSubtotal=element.getText();
		System.out.println("afterremovalSubtotal"+afterremoveSubtotal);
	}
	
}
