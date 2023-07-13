package com.testng.concepts;

import org.testng.annotations.Test;

public class Invocation {

@Test(invocationCount = 5)
private void searchlaptop() {
System.out.println("search laptop");

}
@Test (invocationCount = 4)
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
}
