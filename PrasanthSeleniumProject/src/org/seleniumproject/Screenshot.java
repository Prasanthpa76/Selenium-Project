package org.seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();

		WebElement adrs = driver.findElement(By.xpath("(//p[@class='wt-text-body-01'])[1] "));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", adrs);

		TakesScreenshot tk = (TakesScreenshot) driver;

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\prasa\\eclipse-workspace\\PrasanthSeleniumProject\\Screenshots\\test1.jpg");

		FileUtils.copyFile(src, des);

	}

}
