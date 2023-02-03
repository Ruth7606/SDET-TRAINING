package testNG;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlessExampledDemo {

	public static WebDriver driver;
	
    @BeforeTest  //BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		ChromeOptions ops= new ChromeOptions();
		ops.setHeadless(true);
		driver = new ChromeDriver(ops);		
		driver.manage().window().maximize();
    }      

				
		@Test
		public void actualTest() {
		driver.get("https://www.browserstack.com/");
		System.out.println(driver.getTitle());
		
		
		}
		
		@AfterTest
		public void afterTest(){
			//driver.close();
}
}