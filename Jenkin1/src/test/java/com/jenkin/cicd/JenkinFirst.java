package com.jenkin.cicd;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinFirst 
{
	@Test(groups = "Smoke")
	public void method1()
	{
		System.out.println("Hello!");
		Reporter.log("Hi!");
	}
}
