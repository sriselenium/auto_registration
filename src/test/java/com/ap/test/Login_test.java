package com.ap.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.pages.Home_page;
import com.ap.pages.Login_page;

public class Login_test extends Base_test{
	
	Login_page lp =null; 	
	Home_page hp=null;
	
	@BeforeMethod
	public void init() {
		hp=new Home_page(driver);
		lp =new Login_page(driver);
	}
	


	public void testInValidLogin() {
		hp.navToLoginpage();
		lp.login("dem@gmail.com", "xyzdbc");
		assertTrue(isElementPresent(lp.btn_submit));
		
	}
	
	@Test	
	public void testValidLogin() {
		hp.navToLoginpage();
		lp.login("dev7@gmail.com", "xyzabc");
		assertFalse(isElementPresent(lp.btn_submit));
		
	}

	@AfterMethod
	public void afterMethod() {
		if(isElementPresent(hp.btn_Signout))
			hp.Signout();
		driver.navigate().back();
		sleep();
	}
}
