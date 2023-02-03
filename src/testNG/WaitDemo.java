package testNG;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitDemo {
	
	public static WebDriver driver;
	
	 @BeforeTest  //BeforeTest
	
		
		public void setUp(){
		 File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());			
			driver = new ChromeDriver();
			/*
			 * waits  in selenium
			 * implicit wait-it is applied when driver interact with an  element it waits , it is applied on driver level to apply every time before the driver performs any action
			 * Explicit wait-we load on element level
			 * fluent wait-reduce waiting time applied on an element in explicit
			 * 
			 */
		 
	 }
	
	@Test
		public void actualTest() throws InterruptedException {
		//implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		//Thread.sleep(6000);
		
		//explicit wait
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[normalize-space()='Hello World!']")));
		//fluents wait, i dont have to wait for every time to load the text
		wait1.pollingEvery(Duration.ofSeconds(1));
		wait1.ignoring(NoSuchElementException.class);
		String text=driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).getText();
		Assert.assertEquals(text, "Hello World!");
		System.out.println(text);
		Reporter.log(text);
		
		}
	 
	 @AfterTest
		public void afterTest(){
			//driver.close();
		}
		
			

}
