package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BCTestBase {

	public static WebDriver driver;
	
	public static void initDriver() {	
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriverupdated.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static int randNum() { 
		Random rand = new Random();
		int randNum = rand.nextInt(99999999);
	    return randNum;
	}
	
	
	
	public static int randTitle() {
		Random rand2 = new Random();
		int randTitle = rand2.nextInt(999);
		return randTitle;		
		
		
		
		
		
	}
		
	public void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		try {
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		
	}
	
}
