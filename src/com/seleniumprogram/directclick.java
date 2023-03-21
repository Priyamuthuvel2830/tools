package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class directclick {

public static void main (String[] ags) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("birds",Keys.ENTER);
		
		
		
		
		
}
	
}
