package com.hdfc.loans.personalloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver;   //Here WebDriver is an Interface.
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bh12461\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.com");
		
		
		/* System.setProperty("webdriver.geco.driver", "C:\\Users\\bh12461\\Documents\\Drivers\\geckodriver-win64.exe");
		 driver = new FirefoxDriver();
		frfxdr.get("https://www.amazon.com"); */
	}

}
