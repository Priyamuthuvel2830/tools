package com.seleniumprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadlink {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.id("addBtn")).click();
		
		Robot r = new Robot();
		
		r.delay(3000);
		StringSelection ss = new StringSelection("C:\\Users\\Administrator\\Pictures\\Screenshots\\Screenshot.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		
		
	}
	
	
	
}
