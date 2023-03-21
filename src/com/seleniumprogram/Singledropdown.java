package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Singledropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(firstname));
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Mukil");
		driver.findElement(By.name("lastname")).sendKeys("Kailash");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8838072896");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ragha@0306");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("3");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
	    s1.selectByIndex(4);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 = new Select(year);
	    s2.selectByVisibleText("1991");
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    driver.findElement(By.xpath("//button[text()='Sign Up'][1]")).click();
		
	   Thread.sleep(3000);
		driver.findElement(By.className("_42ft _4jy0 layerButton uiOverlayButton _4jy3 _517h _51sy")).click();
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
