package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BlazeDemo {
	
	public static WebDriver driver;
	public static String s;

	public static void main(String[] args) {
		
		File file= new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\geckodriver-v0.32.0-win-aarch64");
		
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());	//path for your selenium driver browser
		
		driver=new  FirefoxDriver();//open firefox
		
		driver.manage().window().maximize();//maximize the url
		
		driver.get("https://the-internet.herokuapp.com/login");//open url
		
		driver.findElement(By.id("user")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		//driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
	}

}
