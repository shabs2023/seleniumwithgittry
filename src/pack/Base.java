package pack;



import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver=null;

	public static Base testBase;
	public static Base getInstance() throws Exception {
		try {
			
			if (testBase == null) {
				testBase  = new Base();
			}

		} catch (Exception e) {
			throw new Exception("Exception while Initializing TestBase.", e);
		}
  	return testBase;

	}
	
	@BeforeSuite

	public void initialize() throws Exception  {
		System.out.println("driver initialised");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\aeonf\\Downloads\\selenium libraries\\geckodriver-v0.32.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	
	
	}
	@AfterSuite
	public void tearDown() throws AWTException {
}}
	


