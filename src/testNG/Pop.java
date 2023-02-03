package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop {
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\geckodriver-v0.32.0-win-aarch64");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();

	}

}


