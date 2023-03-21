package com.seleniumprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.id("ap_email"));
		System.out.println(Username.isDisplayed());
		Username.sendKeys("9751132830");
		
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		System.out.println(ContinueButton.isEnabled());
		ContinueButton.click();
		
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("Amazon");
		
		WebElement Signin = driver.findElement(By.id("signInSubmit"));
		Signin.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Administrator\\eclipse-work\\Selenium\\Screenshot\\amazonloginpage.png");
		FileUtils.copyFile(src, des);
		//   driver.close();
	
		
		
		
	}
}
