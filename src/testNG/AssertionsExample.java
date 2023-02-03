package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsExample {

	public static WebDriver driver;
	
    @BeforeTest  //BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
    }      

				
		@Test
		public void actualTest() {
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		String s=driver.findElement(By.xpath("//a[normalize-space()='Click here']")).getText();
	
		System.out.println(s.equals("Click here"));
		Assert.assertEquals(s, "Click here");
		
		
		}
		
		@AfterTest
		public void afterTest(){
			//driver.close();
}
}