package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpencartScenarios  {


	
	static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\SDET001\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void actualTest() throws InterruptedException {
		
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.cssSelector("body > nav:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Kaluki");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("mwangangi");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Kaluki123@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("1234R");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div[id='content'] p a")).click();

		
		
		
		
		
		
		
		
//		Select account=new Select(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fas fa-caret-down']")));
//		account.selectByVisibleText("Register");
		
		
	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
