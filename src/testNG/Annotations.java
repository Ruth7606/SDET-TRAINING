package testNG;

import org.testng.annotations.AfterClass;//you can just import one and use * just before it
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	//annotations have undefined execution order
	//every annotation is tied with a function
	//test are executed annotation after annotation
	@BeforeSuite
	
	public void beforeSuite(){
		System.out.println("@beforesuite");
		
	}	
	@AfterSuite
	public void afterSuite(){
		System.out.println("@aftersuite");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("@beforetest");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("@beforetest");
	}
	@Test
	public void test() {
		System.out.println("@test");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("@beforeclass");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("@afterclass");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@beforemethod");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("@aftermethod");
		
	}
	
	

}
