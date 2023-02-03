package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
		
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	
	driver.get("https://blazedemo.com");//open url
	
	
	new Select(driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByIndex(5);
	new Select(driver.findElement(By.xpath("//select[@name='toPort']"))).selectByIndex(4);
	
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	
	String expectedAirLineName= driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
	System.out.println(expectedAirLineName);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@value='Choose This Flight']")).click();
	
	
	String actualAirLineName = driver.findElement(By.xpath("//p[normalize-space()='Airline: United']")).getText();
	
	System.out.println(actualAirLineName);
	
	expectedAirLineName.compareTo(actualAirLineName);
	System.out.println(expectedAirLineName);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ruth");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("1235 Kitui");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Mexico City");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("1234");
	
	
	
	new Select(driver.findElement(By.xpath("//select[@id='cardType']"))).selectByIndex(1);
	driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
	driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2023");
	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Mwangangi");
	
	driver.findElement(By.className("checkbox")).click();
	
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	Thread.sleep(5000);
	
	
	
	
	driver.findElement(By.xpath("//p[normalize-space()='Airline: United']")).click();
//	Thread.sleep(5000);
//	driver.close();
	
	
	String s= driver.getTitle();
	System.out.println(s);	
	
	}

}
