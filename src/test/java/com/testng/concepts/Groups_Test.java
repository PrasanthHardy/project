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

public class Groups_Test {

@Test (groups = {"smoke","sanity"})
private void setup() {
System.out.println("setup");

	}
@Test(groups = {"regression","sanity"})
private void enterurl() {
System.out.println("enter url");
}

@Test(groups = {"smoke","e2e"})
private void login() {
System.out.println("log in");
}
@Test
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
@Test
private void verifyhomepage() {
System.out.println("verify the homepage");
}
@Test
private void logout() {
System.out.println("logout");

}
@Test
private void browserclose() {
	System.out.println("browserclose");
}
@Test
private void browserquit() {
System.out.println("browser quit");
}
}

