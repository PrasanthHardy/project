package com.testng.concepts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class My_Transform implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		//mela antha trasform type panni c+space kudutha 4th vartha select pananum 1st kediaythu
		annotation.setRetryAnalyzer(Myretry_Test.class);
	}

}
