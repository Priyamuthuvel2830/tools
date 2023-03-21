package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement france = driver.findElement(By.linkText("France"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();",france);
	
	//WebElement electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
    //js.executeScript("arguments[0].scrollIntoView();",electronics);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
