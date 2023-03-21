package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement X = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		X.click();
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		//driver.get("https://www.flipkart.com/");
		WebElement mobileno = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//System.out.println(mobileno.isDisplayed());
		mobileno.sendKeys("9751132830");
		
		WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		password.sendKeys("9751132830");
		
		WebElement Login = driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l _2HKlqd')])[1]"));
		Login.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
