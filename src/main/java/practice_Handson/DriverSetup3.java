package practice_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup3 {
	private static WebDriver driver;

	public static WebDriver getWebDriver(){
		
		driver=new ChromeDriver();
		String baseUrl ="http://webapps.tekstac.com/Handling_Regular_Expression/";
		driver.get(baseUrl);
	    return driver;
		
	}

}
