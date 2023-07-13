package com.testng.concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	
	@Test
	@Parameters({"username", "password"}) 
	private void login(@Optional("kumar") String username,String password) {
System.out.println("enter the log in details");
System.out.println("username" + username);
System.out.println("password" + password);

	}

}
