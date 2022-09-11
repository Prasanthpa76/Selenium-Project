package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement clothing = driver.findElement(By.id("catnav-primary-link-10923"));
		a.moveToElement(clothing).perform();
		a.doubleClick(clothing).perform();

		WebElement dress = driver.findElement(By.xpath("(//div[@class='height-placeholder'])[2]"));
		a.moveToElement(dress).perform();
		dress.click();

	}

}
