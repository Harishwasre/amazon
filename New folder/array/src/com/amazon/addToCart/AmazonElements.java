package com.amazon.addToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AmazonElements {
	WebDriver driver;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signInbtn;
	@FindBy(id = "ap_email")
	private WebElement emailtab;
	@FindBy(id = "ap_password")
	private WebElement passtab;
	@FindBy(id = "nav-hamburger-menu")
	private WebElement allbtn;
	@FindBy(xpath = "//*[contains(text(),'Mobiles, C')]")
	private WebElement allmobilestab;
	@FindBy(xpath = "//*[contains(text(),'All Mobile Phone')]")
	private WebElement mobilestab;
	@FindBy(xpath = "//*[@aria-label='A54']")
	private WebElement selectItem;
	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	private WebElement addTocartbtn;
	@FindBy(id= "nav-cart-count-container")
	private WebElement checkcart;
		@FindBy(id = "sc-subtotal-label-activecart")
		private WebElement afterAddSubtotal;
	@FindBy(xpath = "(//*[@data-feature-id=\"delete\"])[1]")
	private WebElement removebtn;
	@FindBy(xpath = "//*[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature']")
	private WebElement afterremoveSubtotal;
	AllMethodes b;
	public AmazonElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		b=new AllMethodes();
		
		b.login(signInbtn);
		b.email(emailtab, "8722143878");
		b.password(passtab, "8050202722");

	}

	public void SelectionMobile() {
		
		b.alltab(allbtn);
		b.allmobile(allmobilestab, driver);
		b.Mobile(mobilestab, driver);
		b.selectItem(selectItem, driver);
		b.addToCart(addTocartbtn, driver);
		b.refreshpage(driver);
		b.checkcart(checkcart, driver);
				b.afterAddSubtotal(afterAddSubtotal, driver);

		b.deletebtn(removebtn);
		b.removefromsubtotal(afterremoveSubtotal, driver);

	}

}
