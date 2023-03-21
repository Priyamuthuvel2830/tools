package com.seleniumprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {
	
	public static void main (String[] ags) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		//driver.findElement(By.xpath("//a[text()='Phones']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement mobile1 = driver.findElement(By.xpath("(//a[@class='hrefch'])[1]"));
		//mobile.click();
		System.out.println(mobile1.getText());
		List<WebElement> allproductsprice = driver.findElements(By.xpath("//h4[@class='card-title']//parent::div//child::h5"));
		
	    	for (WebElement mobile : allproductsprice) {
				System.out.println(mobile.getText());
			}
		
		
		//		List<WebElement> Phones = driver.findElements(By.xpath("//a[text()='Phones']"));
//		int totalnoofproducts = Phones.size();	
//		System.out.println("Totalnoofproducts :" +totalnoofproducts);
//		for (WebElement product : Phones) {
//			
//		System.out.println("Product Brand Name is :" +product.getText());
//	
		List<WebElement> allproductstext = driver.findElements(By.xpath("//a[@class='hrefch']"));
	int totalnoofproducts = allproductstext.size();	
		System.out.println("Totalnoofproducts :" +totalnoofproducts);
		for (WebElement product : allproductstext) {
		
    	System.out.println("Product Brand Name is :" +product.getText());
	}
		
		
	}}
