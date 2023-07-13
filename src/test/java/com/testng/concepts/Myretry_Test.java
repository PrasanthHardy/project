package com.testng.concepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Myretry_Test implements IRetryAnalyzer {
	int count=0;
	int limit=4;

	public boolean retry(ITestResult result) {
		if(count<limit) {
			count++;
			return true;
		}
		
		return false;
	}

}
