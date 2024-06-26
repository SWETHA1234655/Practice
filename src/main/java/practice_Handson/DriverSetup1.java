package practice_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup1 {
	
	private static WebDriver webDriver;
    public static WebDriver getWebDriver()
	{
		//System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
//	    FirefoxProfile profile=new FirefoxProfile();
//	    //profile.setPreference("marionette.logging", "TRACE");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.setBinary(firefoxBinary);
//		firefoxOptions.setProfile(profile);
//	    webDriver =new FirefoxDriver(firefoxOptions);
    	webDriver=new ChromeDriver();
	    String baseUrl = "http://webapps.tekstac.com/MultipleWindow/";
	    webDriver.get(baseUrl);
	    return webDriver;
	}
}
