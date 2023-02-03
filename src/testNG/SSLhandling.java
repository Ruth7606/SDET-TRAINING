package testNG;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SSLhandling {
	
public static WebDriver driver;
	
	@BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions ops= new ChromeOptions();
		ops.setAcceptInsecureCerts(false);		
		driver = new ChromeDriver(ops);		
		driver.manage().window().maximize();
		
		//you can also do for firefox
		
		
	}
	//iframe is a container in which you can contain multiple things.
	
	
	@Test
public void actualtest() throws InterruptedException{
		Thread.sleep(1000);
		driver.get("https://expired.badssl.com/");	
		System.out.println(driver.getTitle());
		
		
		

	}
	
	
	@AfterTest
public void teardown(){
		//driver.close();
		
	}
}
	
	
	