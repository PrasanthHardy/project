package com.testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setup() {
		System.out.println("setup");

	}
@BeforeTest	
private void enterurl() {
System.out.println("enter url");
}

@BeforeClass
private void login() {
System.out.println("log in");
}
@BeforeMethod
private void searchmobile() {
System.out.println("search mobile");
}
@Test
private void searchlaptop() {
	System.out.println("search laptop");

}
@Test
private void searchheadset() {
System.out.println("searchheadset");
}
@AfterMethod
private void verifyhomepage() {
System.out.println("verify the homepage");
}
@AfterClass
private void logout() {
System.out.println("logout");

}
@AfterTest
private void browserclose() {
	System.out.println("browserclose");
}
@AfterSuite
private void browserquit() {
System.out.println("browser quit");
}
}
