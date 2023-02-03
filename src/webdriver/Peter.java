
package webdriver;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Peter {
	public static WebDriver driver;
	
	//@BeforeTest //The browser will be opening the 3 Websites one after another on the same window and same tab
	@BeforeMethod //The browser will close after opening each website on a separate window.
	public void setUp() {
		File file = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\SDET001\\\\jar\\\\chromedriver_win32\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest1() throws InterruptedException {
		driver.get("https://amazon.in");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
		//span[@class='a-size-base a-color-base a-text-bold'][normalize-space()='Leather']
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
		//driver.findElement(By.xpath("//span[@class='a-size-base a-color-base a-text-bold'][normalize-space()='Leather']")).click();
	    driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
	   // driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
	    driver.findElement(By.xpath("//img[@alt=\"Titan Braille Analog Silver White Dial Men's Watch-NB1854SL01 / NB1854SL01\"]")).click();
	  //span[contains(text(),'25% Off or more')]
	}
	@AfterTest
	public void teardown(){
		//driver.close();
		
	}
		
}
		

