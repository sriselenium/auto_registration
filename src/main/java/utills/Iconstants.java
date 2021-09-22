package utills;

public interface Iconstants {
	
	String userDir = System.getProperty("user.dir");
	String chromeDriverPath = userDir +"/src/main/resources/drivers/chromedriver.exe";
	String firefoxDriverPath= userDir +"/src/main/resources/drivers/geckodriver.exe";
	String EdgeDriverPath= userDir +"/src/main/resources/drivers/msedgedriver.exe"; 
	String envpath = userDir +"/src/test/resources/env.properties";

}
