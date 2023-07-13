package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "\"./Drivers/chromedriver.exe\"");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	  WebElement mail = driver.findElement(By.id("email"));
mail.sendKeys("9962482400");
driver.findElement(By.name("pass")).sendKeys("34433443");
driver.findElement(By.name("login")).click();
}
}
