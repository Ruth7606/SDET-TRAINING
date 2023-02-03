package testNG;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandling {
	
public static WebDriver driver;
	
	@BeforeTest
	
	public void setUp(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	//iframe is a container in which you can contain multiple things.
	
	
	@Test
public void actualtest() throws InterruptedException{
		driver.get("https://demoqa.com/frames");		
		
		
		driver.switchTo().frame("frame1");//iframe
		String s=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();//go out of the frame


	}
	
	
	@AfterTest
public void teardown(){
		//driver.close();
		
	}
}
	
	
	