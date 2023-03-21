package com.seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='product-price']"));
		System.out.println(findElements.size());
			
		
		
	}
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                         	
	
}
