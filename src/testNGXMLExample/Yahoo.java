package testNGXMLExample;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Yahoo extends LaunchBrowser {
//	public static WebDriver driver;
//	
//     @BeforeTest
//	
//	public void setUp(){
//		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//     }      

				
		@Test
		public void actualTest() {
		driver.get("https://www.yahoo.com/");
		}
		
//		@AfterTest
//		public void afterTest(){
//			//driver.close();
//		}
		

	}



