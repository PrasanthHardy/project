package com.testng.concepts;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test
	private void AddTest() {
    int i= 10;
    int j=20;
    
    System.out.println("add"+(+i+j));
    }
	@Test(expectedExceptions = Exception.class)
	private void divide() {
    int i= 10;
    int j=0;
    
    System.out.println("divide"+(+i/j));
    }
}
