package com.inetbanking.TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://demo.guru99.com/v4/";
	public String userName = "mngr415723";
	public String passWord = "pYjupAr";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
//		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
