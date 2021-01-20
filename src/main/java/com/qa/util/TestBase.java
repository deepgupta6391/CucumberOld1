package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public static Properties config;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	

	public TestBase() {
		config = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			log.debug("Config property file is loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

	public static void initialization() {
		if (config.getProperty("browser").equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\jars\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (config.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\jars\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome Launched !!!");
		}

		driver.get(config.getProperty("testsiteurl"));
		log.debug("Navigated to : " + config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);


	}
	
	


}
