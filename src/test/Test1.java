package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	
	@BeforeSuite
	public void beforSuite() {
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite");
	}
	

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test");
	}
	
	@BeforeClass
	public void beforeCLass() {
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void afterCLass() {
		System.out.println("This is after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after Test");
	}
	
	@Test
	public void Test() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}

}
