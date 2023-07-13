package com.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 4)
	private void searchmobile() {
		System.out.println("search mobile");

	}
	@Test(priority = -2)
	private void searchlaptop() {
	System.out.println("search laptop");
	}
	@Test(priority = 0)
	private void searchtv() {
	System.out.println("search tv");

	}
	@Test(priority = 2)
	private void SearchFruits() {
    System.out.println("search fruits");
	}
   @Test(priority = 1)
	private void Searchwatch() {
    System.out.println("searchwatch");

	}
	
}
