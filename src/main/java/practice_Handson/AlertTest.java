package practice_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;

public class AlertTest {
	


	   //DO NOT Change the class Name
	
		public static WebDriver driver;
		
		public WebDriver createDriver(){  //DO NOT change the method signature
		
		   //Implement code to create Driver from DriverSetup, assign it to 'static' variable and return it
		   
		  return driver = DriverSetup1.getWebDriver();
		   
		   

		}
		
		public Alert getAlertElement(WebDriver driver){   //DO NOT change the method signature
		
		    //Find the 'click' buttton and click it.
		    //Locate the 'Alert' element and return it
		    driver.findElement(By.name("submit")).click();
		    Alert rt=driver.switchTo().alert();
		    rt.accept();
		    return rt;
		    
		}

		public static void main(String[] args)  throws InterruptedException{  //DO NOT change the method signature
		      
		    AlertTest at=new AlertTest();
		    //Implement code here
		    WebDriver driver=at.createDriver();
		    System.out.println(at.getAlertElement(driver));
		    //at.getAlertElement(driver);
		    

		}

	}




