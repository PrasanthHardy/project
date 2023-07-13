package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Launch {
public static void main(String[] args) {
	

	System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.instagram.com/");
	driver.manage().window().maximize();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	String Curent= driver.getCurrentUrl();
	System.out.println(Curent);
	String title= driver.getTitle();
	System.out.println(title);

	driver.close();
	driver.quit();
}
}
