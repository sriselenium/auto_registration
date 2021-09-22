package utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class configReader {

	String path =Iconstants.envpath;
	Properties prop = null;
	
	public void Readconfig() {
		
		File file =new File(path);
		prop =new Properties();
		try {
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getbrowser() {
		return prop.getProperty("browser");
		}
	
	public String geturl() {
		return prop.getProperty("url");
		}
	
	public String getplatform() {
		return prop.getProperty("platform");
		}

	
	}
	
	
	

