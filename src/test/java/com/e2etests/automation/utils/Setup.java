package com.e2etests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	
	private static WebDriver driver;
@Before
	public void setWebDriver() {

		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";

			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				// WebDriverManager.chromedriver().setup();
				// WebDriverManager.chromedriver().clearDriverCache().setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				driver = new ChromeDriver(chromeOptions);
				driver.manage().window().maximize();
				
//			case "firefox":
//				System.setProperty("webdriver.http.factory", "jdk-http-client");
//				FirefoxProfile profile = new FirefoxProfile();
//				FirefoxOptions firefoxOptions = new FirefoxOptions();
//				WebDriverManager.firefoxdriver().setup();
//				firefoxOptions.setCapability("platform", Platform.WIN10);
//				firefoxOptions.setProfile(profile);
//				driver = new FirefoxDriver();
				break;
				default :
					throw new IllegalArgumentException("Browser\""+ browser + "is not supported");
			}
			
		

			
			}
		
		}
	/*GETTER*/
	public static WebDriver getDriver() {
		return driver;
	}

}
