package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\textfile.txt");
		
		
	}

}
