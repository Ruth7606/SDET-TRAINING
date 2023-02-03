package testNGXMLExample;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Bing extends LaunchBrowser {
	//public static WebDriver driver;
//	
//     @BeforeTest  //BeforeTest
//	
//	public void setUp(){
//		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\edgedriver_win64\\msedgedriver.exe");
//		System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
//		
//		driver = new EdgeDriver();
//		
//		driver.manage().window().maximize();
//     }      

				
		@Test
		public void actualTest() {
		driver.get("https://www.bing.com/");
		}
		
//		@AfterTest
//		public void afterTest(){
//			//driver.close();
//		}
		

	}



