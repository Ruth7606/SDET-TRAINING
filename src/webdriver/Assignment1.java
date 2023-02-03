package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHfngBVw3l6tylsPMZR8K5XtFemfaOaVmW0ekXnkqB29sfJ6K6jSXhAiyDZZlFoFS7gBd9Gw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("ruthkaluki99@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("37277090");
		//driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b VfPpkd-ksKsZd-mWPk3d-OWXEXe-AHe6Kc-XpnDCe']//div[@class='VfPpkd-RLmnJb']")).click();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
