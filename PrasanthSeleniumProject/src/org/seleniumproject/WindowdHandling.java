package org.seleniumproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowdHandling {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();

		WebElement textbox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
		textbox.sendKeys("iphone case");

		WebElement button = driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']"));
		button.click();

		WebElement cover = driver.findElement(By.xpath("(//div[@class='height-placeholder'])[6]"));
		cover.click();

		Set<String> window = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(window);
		String each = li.get(1);
		driver.switchTo().window(each);

		WebElement price = driver.findElement(By.xpath("//p[@class='wt-text-title-03 wt-mr-xs-1']"));
		String text = price.getText();
		System.out.println(text);
		
	}

}
