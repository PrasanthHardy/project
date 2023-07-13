package com.testng.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Demo {
	String actual="Bala";
	String excpected="bala";
	
	//Hard Assert=validation( when assert fail, test will be terminated rest of the test cases are skipped)
	@Test
	private void test1() {
System.out.println("Test1 started");
Assert.assertEquals(actual, excpected); //when assertion fails it will terminate the execution
	System.out.println("Test1 completed");
	}
	
	private void test2() {
		SoftAssert sa= new SoftAssert(); //verification (even the test case is failed.soft assert will execute rest of test testcases) 
		System.out.println("test2 stareted");
		sa.assertEquals(actual, excpected);
		sa.assertAll(); //it is given to check whether the method is passed or failed
	}

}
