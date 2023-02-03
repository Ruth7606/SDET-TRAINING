package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadlessBrowser {  //headless means whatever execution you doing it is on the browser
	
	//it is browser that is invisible created by selenium
	
public static WebDriver driver;
	
	@BeforeTest
	
	public void setUp(){
		
		//no need to call the path cause htmlunit is a jar on its own
		driver = new HtmlUnitDriver();	//download html unit driver based on your selenium version 	
		driver.manage().window().maximize();		
		
	}
	
	@Test
public void actualtest() {

		driver.get("https://the-internet.herokuapp.com");	
		System.out.println(driver.getTitle());		

	}
	
	
	@AfterTest
public void teardown(){
		//driver.close();
		
	}
}
	
	
	