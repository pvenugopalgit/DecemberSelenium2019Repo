package com.hdfc.loans.personalloans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p;
	
	public static void init() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bh12461\\eclipse-workspace\\FirstProject\\data.properties");
		
		p = new Properties();
		p.load(fis);
	}
	
	public static void navigateUrl(String url) {
		
		driver.get(p.getProperty(url));
	}

	public static void launch(String browser) {
		
		if(p.getProperty(browser).equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bh12461\\Documents\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if(p.getProperty(browser).equals("firefox")) {
			
			/* System.setProperty("webdriver.geco.driver", "C:\\Users\\bh12461\\Documents\\Drivers\\geckodriver-win64.exe");
			 driver = new FirefoxDriver();
			frfxdr.get("https://www.applestore.com"); */
		}
		
		
	}

}
