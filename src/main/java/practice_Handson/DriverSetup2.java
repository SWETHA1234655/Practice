package practice_Handson;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup2 {
	
	
	private static WebDriver driver;

		public static WebDriver getWebDriver(){
			
			driver=new ChromeDriver();
			String baseUrl = "https://webapps.tekstac.com/Agent_Registration/";
			driver.get(baseUrl);
		    return driver;
			
		}
												

}
