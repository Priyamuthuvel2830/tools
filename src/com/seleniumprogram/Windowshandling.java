package com.seleniumprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {
public static void main(String[] args) throws AWTException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	Robot rb = new Robot();
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    WebElement grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"));
	ac.contextClick(grocery).perform();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	WebElement mobiles = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
	ac.contextClick(mobiles).perform();		
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	ac.contextClick(fashion).perform();		
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	for (String id : windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
	String myString = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	for (String id : windowHandles) {
		if (driver.switchTo().window(id).getTitle().equals(myString)) {
		break;
		}
			
		}
	System.out.println("************************************");
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
    for (String id : windowHandles) {
    	String url = driver.switchTo().window(id).getCurrentUrl();
    	}

z}
	
	}

