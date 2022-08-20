package com.amazon.addToCart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AllMethodes {
	Actions ac;

	public void login(WebElement element) {

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

	public void allmobile(WebElement element, WebDriver driver) {

		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void Mobile(WebElement element, WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void selectItem(WebElement element, WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void addToCart(WebElement element, WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void refreshpage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void checkcart(WebElement element, WebDriver driver) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}

	public void afterAddSubtotal(WebElement element, WebDriver driver) {
		String afterAddSubtotal = element.getText();
		System.out.println("afterAddSubtotal" + afterAddSubtotal);
	}

	public void deletebtn(WebElement element) {
	element.click();

	}

	public void removefromsubtotal(WebElement element, WebDriver driver) {
		String afterremoveSubtotal = element.getText();
		System.out.println("afterremovalSubtotal" + afterremoveSubtotal);
	}

}
