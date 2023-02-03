package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
public void actualtest() throws InterruptedException{
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(5000);
		
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]")));
		act.build().perform();
		
		driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]")).click();
		Thread.sleep(1000);
		
	}
	
	
	@AfterTest
public void teardown(){
		driver.close();
		
	}
	
	
	

}
