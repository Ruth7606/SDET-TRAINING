package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simplelearn {
	
	WebDriver driver;
	
	public void start() {
	File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\geckodriver-v0.32.0-win-aarch64.exe");
	System.getProperty("webdriver.gecko.driver", file.getAbsolutePath());
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.simplilearn.com/");
	}
	
	public void middle() throws InterruptedException {
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='search']")).click();
		
		
	}
	
	public void end(){
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Simplelearn obj = new Simplelearn();
		obj.start();
		obj.middle();
		obj.end();
		

	}

}
