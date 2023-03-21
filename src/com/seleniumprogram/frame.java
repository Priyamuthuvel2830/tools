package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://letcode.in/frame");
	//driver.manage().window().maximize();
	
	driver.switchTo().frame("firstFr");
	//Thread.sleep(5000);
	driver.findElement(By.name("fname")).sendKeys("Priya");
	driver.findElement(By.name("lname")).sendKeys("Muthuvel");
	// inner frame
	
	WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	driver.switchTo().frame(innerFrame);
	driver.findElement(By.name("email")).sendKeys("priyamuthuvel@gmail.com");
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
