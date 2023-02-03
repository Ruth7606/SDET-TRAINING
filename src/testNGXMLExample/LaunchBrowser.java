package testNGXMLExample;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.testng.annotations.Parameters;



public class LaunchBrowser {
	
	public static WebDriver driver;
	@Parameters("browser")
	
	 @BeforeTest  //BeforeTest
	
		
		public void setUp(String browser){
		 if(browser.equalsIgnoreCase("Edge")) {
			File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\edgedriver_win64\\msedgedriver.exe");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			
			driver = new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("Chrome")) {
			 File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				
				driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("Firefox")) {
			 File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\geckodriver-v0.32.0-win-aarch64.exe");
				System.getProperty("webdriver.gecko.driver", file.getAbsolutePath());
				driver = new FirefoxDriver();
		 }
		 else {
			 //you can also use system out print
			 Reporter.log("Invalid browser");
		 }
			
			driver.manage().window().maximize();
	     }    
	 
	 @AfterTest
		public void afterTest(){
			//driver.close();
		}

}
