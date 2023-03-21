package com.seleniumprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://letcode.in/alert");
	//simple alert
	driver.findElement(By.id("accept")).click();
	driver.switchTo().alert().accept();
	//confirm alert
	driver.findElement(By.id("confirm")).click();
	driver.switchTo().alert().dismiss();
	//prompt alert
	driver.findElement(By.id("prompt")).click();
	Alert prompt = driver.switchTo().alert();
	prompt.sendKeys("PriyaMuthuvel");
	prompt.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
