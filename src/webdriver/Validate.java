package webdriver;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		String s= driver.getTitle();
		System.out.println(s);
		
		String n= driver.getPageSource();
		System.out.println(n);
		
		driver.close();// close current tab
		driver.quit();//close all tabs
		
		
	}

}
