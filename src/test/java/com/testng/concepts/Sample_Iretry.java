package com.testng.concepts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_Iretry {
	
	
	@Test(retryAnalyzer =Myretry_Test.class)
private void usernamevalidation() {

	Assert.assertEquals('a', 'A');
 
}
@Test
	private void userpasswordvalidation() {
Assert.assertEquals('b', 'B');
	}
}
