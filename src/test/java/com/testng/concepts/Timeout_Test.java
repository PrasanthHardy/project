package com.testng.concepts;

import org.testng.annotations.Test;

public class Timeout_Test {

@Test(timeOut = 1500)
private void searchlaptop() throws InterruptedException {
Thread.sleep(1000);
	System.out.println("search laptop");

}
@Test(timeOut = 500)
private void searchheadset() throws InterruptedException {
	Thread.sleep(2000);
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

}
