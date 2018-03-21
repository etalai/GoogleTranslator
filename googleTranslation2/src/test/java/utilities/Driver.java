package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
//		driver==null --> means it was not opened before
		if(driver==null){
			switch (Config.getProperty("browser")) {
			case "chrome":
				System.setProperty(Config.getProperty("driverType"),
						Config.getProperty("driverPath"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "firefox":
				System.setProperty(Config.getProperty("driverType"), 	
						Config.getProperty("driverPath"));
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", 	
						"/the/location/of/ie/driver");	
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			}
		}
		return driver;
	}
	
	public static void closeDriver(){
		if(driver != null){
			driver.quit();
		}
	}
	
}