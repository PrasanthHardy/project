package com.testng.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Provider {
	
	//to execute mutlipe set of data in a single test case
	@Test(dataProvider ="LogInData")
	private void logIn(String username,String password) {
System.out.println("enter the log in details");
System.out.println("username:" + username);
System.out.println("password:" + password);
	}
	
	
	@DataProvider
private Object[][] LogInData() {
	return new Object[][] {
		{"AAA","111"},
		{"BBB","222"},
		{"CCC","333"}

};
	}
}

