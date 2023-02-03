package webdriver;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(5000);
		
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]")));
		act.build().perform();
		
		driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().refresh();
		driver.navigate().back();
		
		
		
	}

}
