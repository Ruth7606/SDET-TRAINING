package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirstwebdrivertest {
	static WebDriver driver;

	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	//open url
	driver.get("https://the-internet.herokuapp.com/login");
	
	//find element-finds an element on the page

	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
