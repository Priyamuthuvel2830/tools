package com.seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplewebtable {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://letcode.in/table");
	driver.manage().window().maximize();
	System.out.println("******************* Print All Ddate*****************");
	List<WebElement> alldata = driver.findElements(By.xpath("(//table)[3]/tr/td"));
	for (WebElement all : alldata) {
		System.out.println(all.getText());
	}
	System.out.println("*******************Single Row *****************");
    List<WebElement> singlerow = driver.findElements(By.xpath("(//table)[3]/tr[4]/td"));	
	for (WebElement row : singlerow) {
		System.out.println(row.getText());
	}
	System.out.println("*******************Single Column *****************");
	List<WebElement> column = driver.findElements(By.xpath("(//table)[3]/tr/td[5]"));
	for (WebElement col : column) {
		System.out.println(col.getText());
	}
	
	System.out.println("*******************Single value *****************");
	 WebElement SingleValue = driver.findElement(By.xpath("(//table)[3]/tr[2]/td[6]"));
	System.out.println(SingleValue.getText());
	}
	
	
	
}

