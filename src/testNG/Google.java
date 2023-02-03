package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void test1() {
		System.out.println("@test1");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("@aftermethod");
		
	}
	@Test
	public void test2() {
		System.out.println("@test2");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@beforemethod");
	}
	@Test
	public void test3() {
		System.out.println("@test3");
	}

}


