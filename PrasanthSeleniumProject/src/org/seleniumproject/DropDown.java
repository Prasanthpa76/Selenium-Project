package org.seleniumproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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

		WebElement drop = driver.findElement(By.xpath("//select[@id='variation-selector-0']"));
		Select s = new Select(drop);
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		System.out.println(size);

		for (WebElement i : alloptions) {
			System.out.println(i.getText());

		}

	}

}
