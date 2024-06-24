package test_Cases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import com.beust.jcommander.Parameter;

import utilities.Readconfig;

public class Base_class01 {
	
	Readconfig rd = new Readconfig();
	
public static WebDriver driver;
public String url = rd.get_url();
public String username=rd.get_username();
public String password = rd.get_password();

public Logger log;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser ) {
		
		if (browser.equals("chrome")) {
			

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
			
		}
		
		else if (browser.equals("firefox")) {
			

			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			
			
			driver = new FirefoxDriver();
			
			
		}
	
		
		
		
	}
	
	
	
	public void capture_Screenshot(String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
	  File src  =  ts.getScreenshotAs(OutputType.FILE);
	      File dest = new File("./Screenshots/"+tname+".jpg");
	      FileUtils.copyFile(src, dest);
		
		
		
		
	}
	
	@AfterClass
public void teardown() {
		
		
		driver.close();
		
		
	}
}
