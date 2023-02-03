package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/login");
		
		driver.findElement(By.id("email")).sendKeys("ayaz@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        //driver.close();
       
	}

}
