package com.ap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver= null;
	
	public Login_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement txtFld_EmailAddress;
	
	@FindBy(id="passwd")
	public WebElement txtFld_Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public WebElement btn_submit;
	
	
	public void login(String username,String password)
	{
		txtFld_EmailAddress.sendKeys(username);
		txtFld_Password.sendKeys(password);
		 btn_submit.click();
	}
	
	
	
	
	
}
