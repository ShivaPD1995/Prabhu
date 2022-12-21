package com.jenkin.cicd;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinSecondTest
{
	@Test(groups = "Sanity")
	public void method2()
	{
		System.out.println("Hello!!");
		Reporter.log("Hi!!");
	}
	
}
