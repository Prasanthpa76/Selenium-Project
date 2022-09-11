package org.seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement singin = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
		a.moveToElement(singin).perform();
		singin.click();

		Thread.sleep(3000);

		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("Prasanth");
		a.doubleClick(mail).perform();

		Robot r = new Robot();

		a.contextClick(mail).perform();

		for (int i = 0; i < 3; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		a.contextClick(password).perform();

		for (int i = 0; i < 4; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement button = driver.findElement(By.xpath("//button[@name='submit_attempt']"));
		button.click();

	}

}
