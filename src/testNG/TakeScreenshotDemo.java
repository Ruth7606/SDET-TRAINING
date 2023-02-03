package testNG;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshotDemo {


	
public static WebDriver driver;
@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\SDET001\\\\jar\\\\chromedriver_win32\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
// capture section of page 

	@Test(priority=1)
	public void actualTest() throws Exception {
		
		driver.get("https://www.browserstack.com/");
		System.out.println(driver.getTitle());		
		
		// typecast driver to access TakesScreenshot method
		TakesScreenshot screen = (TakesScreenshot)driver;	
		// take the screenshot as output type file
		File file = screen.getScreenshotAs(OutputType.FILE);	
//		// save the screenshot taken in destination path
    	FileUtils.copyFile(file, new File("C:\\Users\\User\\Desktop\\SDET Training\\SDETBatch007\\ScreenShots\\ruth.png"));

		
		//FULL PAGE SCREENSHOT
	}
	@Test(priority=2)
	public void fullScreenShot() throws IOException {
		  driver.get("https://www.browserstack.com/");
		  Screenshot screenshot = new AShot().takeScreenshot(driver);
			
			Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			ImageIO.write(s.getImage(),"PNG",new File("C:\\\\Users\\\\User\\\\Desktop\\\\SDET Training\\\\SDETBatch007\\\\ScreenShots\\\\full.png"));
			
		  
		 
	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
