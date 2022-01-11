package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import firstprogram.SeleniumTesting;

public class PropertiesFile {
	 static Properties prop=new Properties();
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		
	}
	public static void readPropertiesFile() {
		
		try {
			InputStream input =new FileInputStream("C:\\Users\\91814\\eclipse-workspace\\firstprogram\\src\\Config\\config.properties");
			prop.load(input);
			SeleniumTesting.browser=prop.getProperty("browser");
			System.out.println(SeleniumTesting.browser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void writePropertiesFile() {
		try {
			OutputStream output=new FileOutputStream("C:\\Users\\91814\\eclipse-workspace\\firstprogram\\src\\Config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
