package webdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment2 {
	static WebDriver driver;
	@BeforeMethod 
	public void start(){
		File file =new File("C:\\Users\\User\\eclipse-workspace\\SDET001\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}

		@Test
		public void test() {
			 driver.get("https://www.amazon.in/");
				
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
				
				
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				
				driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				
				driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				//span[@class='a-size-base a-color-base'][normalize-space()='Titan']
				driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		    	driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
		    	driver.findElement(By.xpath("//img[@alt=\"Titan Braille Analog Silver White Dial Men's Watch-NB1854SL01 / NB1854SL01\"]")).click();
		}
	@AfterTest
	public void end() {
		driver.close();
	}
		}





//public static void main(String[] args) {
//File file =new File("C:\\Users\\User\\eclipse-workspace\\SDET001\\jar\\chromedriver_win32\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//driver =new ChromeDriver();
//driver.manage().window().maximize();
//        driver.get("https://www.amazon.in/");
//		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		
//		
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
//		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//		
//		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//	
//		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']\r\n"
//				+ "")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//    	driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
////		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		
//		
		//driver.findElement(By.xpath("//img[@alt=\"Titan Braille Analog Silver White Dial Men's Watch-NB1854SL01 / NB1854SL01\"]")).click();
		
		//span[contains(text(),"Braille Analog Silver White Dial Men's Watch-NB185")]
		
		//driver.quit();
		
	//}
//
//}
