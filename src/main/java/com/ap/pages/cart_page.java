package com.ap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page {

public WebDriver driver= null;
	
	public cart_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='lnk_wishlist']")
	public WebElement lnk_submit;
	
	@FindBy(xpath="//img[@class='replace-2x img-responsive']")
	public WebElement img_Select;
	
	@FindBy(xpath="//button[@name='Submit']")
	public WebElement btn_submit;
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium']")
	public WebElement btn_checkout;
	
	@FindBy(xpath="//button[name='processAddress']")
	public WebElement btn_address;
	
	
	//button[@name='Submit']"
	public void NavToWishlist() {
				lnk_submit.click();
				
	}
	public void SelecttoWishlist() {
	img_Select.click();
	btn_submit.click();
	
	}
	public void AddToCart() {
		
		btn_checkout.click();
		}
	
	public void navtoCheckout() {
		btn_address.click();
	}
}
