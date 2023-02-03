package webdriver;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropmenuexamp {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com");
		/*
		 * for dropdown we have to use a class called Select
		 * we can select the dropdown in three ways :
		 1.select by index
		 2.select by value
		 3.select by visual text
		 * 
		 */
		
		new Select(driver.findElement(By.name("fromPort"))).selectByIndex(6);

		
		Thread.sleep(10000);
		//driver.close(); //to close the window
		
		//String airlinename =driver.findelement(By.xpath("//td(normalize-space()="lufnasa"]"))
		
		
//		driver.findElement(By.id("email")).sendKeys("ayaz@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("12345");
//        driver.findElement(By.name("remember")).click();
        

}
}