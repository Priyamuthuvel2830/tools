package com.seleniumprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotandactions {
public static void main(String[] args) throws AWTException, Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	Robot rc = new Robot();
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement dec = driver.findElement(By.id("droppable"));
	ac.dragAndDrop(src, dec).build().perform();
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement login = driver.findElement(By.linkText("Login"));
	ac.moveToElement(login).perform();
	WebElement grocery = driver.findElement(By.linkText("Grocery"));
	//ac.moveToElement(grocery).perform();
	ac.contextClick(grocery).perform();
	rc.keyPress(KeyEvent.VK_DOWN);
	rc.keyRelease(KeyEvent.VK_DOWN);
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
