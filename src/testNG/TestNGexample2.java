package testNG;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
@BeforeSuite-1
@AfterSuite-9
@BeforeTest-2
@Test-5
@BeforeClass-3
@AfterClass-7
@BeforeMethod-4
@AfterMethod-6
@AfterTest-8
 *  
 * 
 */


public class TestNGexample2 {
	public static WebDriver driver;
	
     @BeforeMethod  //BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
     }
      
		
     //priority gives condition in which order@test will be executed
  // enable stops execution of the mentioned @test
     //always
	
		@Test(priority=3)
		public void test1() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(1000);
		}
		
		// enable stops execution of the mentioned @test
		@Test(priority=4)
		public void test2() throws InterruptedException {
		driver.get("https://www.genrocket.com/flight-school/software-tester-intermediate/");
		Thread.sleep(1000);
		}
		
		@Test(priority=1)
		public void testf() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		}
		
		@Test(priority=2)
		public void test3() {
		driver.get("https://inderpsingh.blogspot.com/2011/04/what-is-software-regression.html");
		}
		
		@AfterMethod  //AfterTest
		public void afterTest(){
			driver.close();
		}
		

	}



