package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("PRIYADHARSHINIRATHA");
		driver.findElement(By.id("password")).sendKeys("Radha1991");
		driver.findElement(By.id("login")).click();
		WebElement single = driver.findElement(By.id("location"));
		Select s = new Select(single);
		s.selectByValue("Adelaide");
		WebElement single1 = driver.findElement(By.id("hotels"));
		Select s1 = new Select(single1);
		s1.selectByIndex(2);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(3);
		WebElement noofroom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noofroom);
		s3.selectByVisibleText("3 - Three");
		WebElement indate = driver.findElement(By.id("datepick_in"));
		indate.clear();
		indate.sendKeys("13/11/2022");
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		outdate.clear();
		outdate.sendKeys("13/11/2022");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(3);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Mukil");
		driver.findElement(By.id("last_name")).sendKeys("Muthuvel");
		driver.findElement(By.id("address")).sendKeys("Karambayam,Pattukottai");
		driver.findElement(By.id("cc_num")).sendKeys("3245678543279876");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select cc = new Select(cctype);
		cc.selectByIndex(4);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select em = new Select(expmonth);
	    em.selectByValue("4");
	    WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select ey = new Select(ccexpyear);
	    ey.selectByVisibleText("2022");
	    driver.findElement(By.id("cc_cvv")).sendKeys("456");
		driver.findElement(By.id("book_now")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
