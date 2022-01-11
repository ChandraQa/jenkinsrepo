package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.PropertiesFile;

public class SeleniumTesting {
	public static String browser;
	static WebDriver driver ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
		
	}

	public static void setBrowser() {
		browser="chrome";
	}
	public static void setBrowserConfig() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}
	public static void runTest() {
		driver.get("https://www.google.co.in");
		driver.quit();
	}
}
