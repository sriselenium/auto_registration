package utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class propertyfilereader {

	
	
	public static void main(String[] args) {
		
		
		String path =Iconstants.envpath;
		File file =new File(path);
		Properties prop =new Properties();
		try {
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("browser"));
		
		
	}
	
}
