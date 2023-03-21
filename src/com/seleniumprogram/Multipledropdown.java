package com.seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	private static List<WebElement> options;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-work\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement multipledrop = driver.findElement(By.id("superheros"));
		
		Select s = new Select(multipledrop);
		s.selectByValue("aq");
		s.selectByValue("ta");
		s.selectByValue("bt");
		s.selectByValue("bp");
		s.selectByVisibleText("Captain America");
	    s.selectByVisibleText("Captain Marvel");
	    s.selectByVisibleText("Daredevil");
	    //deselect
	    s.deselectByValue("cm");
	    s.deselectByVisibleText("Batman");
	    //getoptions
	    
	    System.out.println("************GetOptons*********************");
	    List<WebElement> options = s.getOptions();
	    for (WebElement alloptions : options) {
			System.out.println(alloptions.getText());
		}
	    //getAllSelectedOptions
	    System.out.println("*****************AllSelected Options**********************");
	    List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement SelectedOptions : allSelectedOptions) {
			System.out.println(SelectedOptions.getText());
			}
		//getFirstSelectionoption
		System.out.println("*************************GetFirstSeletOption*************************************");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		//deselectall
		s.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
