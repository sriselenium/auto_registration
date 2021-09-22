package com.ap.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.pages.Home_page;
import com.ap.pages.Login_page;
import com.ap.pages.cart_page;
import com.ap.pages.cart_page2;
import com.ap.pages.cart_page3;

public class cart_test extends Base_test {

	cart_page3 cp =null; 	
	Login_page lp=null;
	Home_page hp=null;
	
	

	@BeforeMethod
	public void init() {
		cp =new cart_page3(driver);
		hp=new Home_page(driver);
		lp =new Login_page(driver);
		
	}
	@Test
	public void TestLogin() {
		hp.navToLoginpage();
		lp.login("dem7@gmail.com", "xyzabc" );
		cp.NavToWishlist();
		cp.SelecttoWishlist();
		cp.AddToCart();
		
	}
	
	@Test
	public void TestToCart() {
		cp.navtoCheckout();
		cp.addAddressAndCheckout();
					
 }
}
	
	
	
	
	
	

