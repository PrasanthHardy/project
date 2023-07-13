package com.testng.concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parllel_Test {
	
	@Test
	private void amazontest() {
		 System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in/");

}
	@Test
private void flipkart() {
		//here i need to install IE driver and run apo tha parllel ha run agum
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://www.flipkart.in/");

}
	
	
	
	
	
	
	
	
	
}