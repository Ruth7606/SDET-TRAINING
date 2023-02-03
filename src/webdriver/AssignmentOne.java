package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {
	static WebDriver driver;

	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	
	driver.get("https://blazedemo.com");//open url
	
	//find element-finds an element on the page
	
	driver.findElement(By.xpath("//a[@href='home']")).click();//home
	
	driver.findElement(By.xpath("//a[@href='https://blazedemo.com/register']")).click();//register
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ruth");//input name
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Tezza Business Solution");//input company
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tezz@gmail.com");//input email
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");//input password
	driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("123456");//input confirm password
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//back to home page
	//driver.findElement(By.xpath("//a[@href='https://blazedemo.com']")).click();
	
	//logout dropmenu
	//use select
	//new Select(driver.findElement(By.xpath(""))).selectByIndex(0);
	
	//forgot password
	driver.findElement(By.xpath("//a[@href='home']")).click();//home
	driver.findElement(By.xpath("//a[@href='https://blazedemo.com/password/reset']")).click();//forgot password
	


	
	}

}
