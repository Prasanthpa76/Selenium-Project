package org.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
    	
    	String title = driver.getTitle(); 
    	System.out.println(title);
    	
    	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
    	
    	driver.close();
    	
    	driver.quit();
	}

}
