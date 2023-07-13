package com.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	@Ignore
	@Test
	private void searchmobile() {
		System.out.println("search mobile");

	}
	@Test (enabled = false)
	private void searchlaptop() {
	System.out.println("search laptop");
	}
	@Test
	private void searchtv() {
	System.out.println("search tv");

	}
	@Test
	private void SearchFruits() {
System.out.println("search fruits");
	}
	
	
	}

