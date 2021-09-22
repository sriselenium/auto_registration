package com.ap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page3 {
public WebDriver driver= null;
	
	public cart_page3(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='lnk_wishlist']")
	public WebElement lnk_submit;
	
	@FindBy(xpath="//img[@class='replace-2x img-responsive']")
	public WebElement img_Select;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public WebElement btn_AddToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	public WebElement btn_ProceedToCheckout_confirmation;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[last()]")
	public WebElement btn_ProceedToCheckout;
	
	@FindBy(xpath="//div[@id='uniform-cgv']")
	public WebElement chkBox_Agree;
	
	
	
	//button[@name='Submit']"
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
		btn_ProceedToCheckout_confirmation.click();
	}
	
	
	public void navtoCheckout() {
		while(btn_ProceedToCheckout.isDisplayed()) {
			if(isElementPresent(chkBox_Agree))
				chkBox_Agree.click();
			btn_ProceedToCheckout.click();
		}
	}

		
		
	public void addAddressAndCheckout() {
		btn_ProceedToCheckout.click();
	}




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

