package com.ap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

 private WebDriver driver= null;
	
	public  Home_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement btn_Signin;
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	public WebElement btn_Signout;
	
	public void navToLoginpage() {
		btn_Signin.click();
	}
	
	public void Signout() {
		 btn_Signout.click();
		
	}
	
	
	
}
