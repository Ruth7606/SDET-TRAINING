package testNG;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Cookies {

	public static WebDriver driver;
	
    @BeforeTest  //BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		ChromeOptions ops= new ChromeOptions();
		ops.setHeadless(false);
		driver = new ChromeDriver(ops);		
		driver.manage().window().maximize();
    }      

				
		@Test
		public void actualTest() {
		driver.get("https://www.browserstack.com/");
		System.out.println(driver.getTitle());
		
		Cookie coks = new Cookie("mycookie", "Kaluki");
		driver.manage().addCookie(coks);
		
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
		
//		driver.manage().deleteCookie(arg0); // Deletes the specific cookie
//		driver.manage().deleteCookieNamed(arg0); // Deletes the specific cookie according to the Name
//		driver.manage().deleteAllCookies(); // Deletes all the cookies
		
		
		}
		
		@AfterTest
		public void afterTest(){
			//driver.close();
}
}