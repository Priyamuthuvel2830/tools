package com.seleniumprogram;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("1");
		// wait

		String parentwindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement openwindow = driver.findElement(By.id("newWindowBtn"));
		openwindow.click();
		

		Set<String> parentchild = driver.getWindowHandles();
		for (String childwindow : parentchild) {
			driver.switchTo().window(childwindow);
			if (!childwindow.equals(parentwindow)) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				WebElement fname = driver.findElement(By.id("firstName"));
				fname.sendKeys("Priyamuthuvel");
				driver.close();
				driver.switchTo().window(parentwindow);
				WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
				textbox.clear();
				textbox.sendKeys("2");
			}

		}
		Thread.sleep(3000);

		
	}

}
