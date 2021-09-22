package com.ap.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utills.Iconstants;
import utills.configReader;

public class Base_test {
	public WebDriver driver =null;
	configReader cfgRdr =null;
	
	
	
	@BeforeSuite
	public void beforesuite() {
		cfgRdr =new configReader();
		cfgRdr.Readconfig();
		
	}
	

	@BeforeTest
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"" );
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\sride\\selenium\\edgedriver_win64\\msedgedriver.exe");
		String browser = cfgRdr.getbrowser();
		if(browser.equalsIgnoreCase("chrome"))
			openchrome();
		else if(browser.equalsIgnoreCase("firefox"))
			
		
		 driver =new ChromeDriver ();
		 driver.get(cfgRdr.geturl());
		 driver.manage().window().maximize();
		 sleep();
	
	}
	
	public void openchrome() {
		
		System.setProperty("webdriver.chrome.driver", Iconstants.chromeDriverPath);
		 driver =new ChromeDriver ();
		}
	
public void openfirefox() {
	System.setProperty("webdriver.gecko.driver", Iconstants.firefoxDriverPath);
	 driver =new FirefoxDriver ();
	 openfirefox();
	}
public void openedge() {
	
	System.setProperty("webdriver.edge.driver", Iconstants.EdgeDriverPath);
	 driver =new EdgeDriver ();
	
}
	public boolean isElementPresent(WebElement ele) {
		boolean elepresent = false;
		
		try {
			if(ele.isDisplayed()&& ele.isEnabled())
				elepresent = true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return elepresent;
	}
	
	@AfterTest
	public void terminate() {
		driver.quit();
	}
	
	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
