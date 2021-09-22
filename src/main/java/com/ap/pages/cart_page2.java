package com.ap.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class cart_page2 {

public WebDriver driver= null;
	
	public cart_page2(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='lnk_wishlist']")
	public WebElement lnk_submit;
	
	@FindBy(xpath="//img[@class='replace-2x img-responsive']")
	public WebElement img_Select;
	
	@FindBy( xpath="(//button[@type='submit'])[3]")//add to cart
	public WebElement btn_AddToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")//pop up checkout
	public WebElement btn_ProceedToCheckout_confirmation;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[last()]")//summary
	//@FindBy(xpath="//a[@title='Proceed to checkout'])[last()]")
	public WebElement btn_summaryCheckout;
	
	@FindBy(xpath="//button[@name='processAddress']")//address
	public WebElement btn_AddressToCheckout;
	
	@FindBy(css="input#cgv")//check box
	public WebElement checkbox_Agree;
	
	@FindBy(xpath="//button[@name='processCarrier']")//payment
	public WebElement btn_Address;
	
	
	
	public void NavToWishlist() {
		lnk_submit.click();
	}
	public void SelecttoWishlist() {
		img_Select.click();
	}
	public void AddToCart() {
		while(btn_AddToCart.isDisplayed()) {
			btn_AddToCart.click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public void navtoCheckConformation() {
		while(btn_ProceedToCheckout_confirmation.isDisplayed()) {
			btn_ProceedToCheckout_confirmation.click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void navtoSummary() {
		while(btn_summaryCheckout.isDisplayed()) {
			btn_summaryCheckout.click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void navtoAddress() {
		while(btn_AddressToCheckout.isDisplayed()) {
			btn_AddressToCheckout.click();

			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void navtocheckbox() {
		while(checkbox_Agree.isDisplayed()) {
			if(isElementPresent(checkbox_Agree))
				checkbox_Agree.click();
			
			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		btn_Address.click();
			
		}
	
	
//	public void navtopayment() {
//		while(btn_Address.isDisplayed()) {
//			btn_Address.click();
//
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}


public boolean isElementPresent(WebElement ele) {
	boolean elePresent = false;

	try {
		if(ele.isDisplayed()&& ele.isEnabled())
			elePresent = true;
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}

	return elePresent;
}
}