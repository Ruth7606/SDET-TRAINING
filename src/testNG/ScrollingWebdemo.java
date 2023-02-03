package testNG;

import java.io.File;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollingWebdemo {

	public static WebDriver driver;
	private Object FileUtils;
	
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
		driver.get("https://www.browserstack.com/users/sign_up");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//js.executeScript("document.getElementById(\"user_submit\").click();");

		js.executeScript("document.getElementById(\"user_full_name\").value='kalukihhhyyy';");
		
		//click using executescript
		//js.executeScript("document.getElementByID(\"signupModalButton\").click();");
		
		}		

		
		@AfterTest
		public void afterTest(){
			//driver.close();
}
}