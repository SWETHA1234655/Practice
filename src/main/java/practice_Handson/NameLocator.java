package practice_Handson;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	


	
	    //Use the declared variables for stroing required values
		static String fName;
		static WebDriver driver;
		
		public WebDriver setupDriver()           //DO NOT Change the method Signature
		{
		    /* Replace this comment by the code statement to create and return the driver */
		    /* Naviaget to the url 'http://webapps.tekstac.com/AddressBook/'  */
		    
		    driver= DriverSetup.getWebDriver();
		    
		    driver.navigate().to("http://webapps.tekstac.com/AddressBook/");
		    
		    return driver;
		    
			
//			WebDriver driver=new ChromeDriver();
//			
//			driver.navigate().to("http://webapps.tekstac.com/AddressBook/");
//			
//			return driver;
			
		    
		    
		}
		public String getNameLocator()              //DO NOT Change the method Signature
		{
		   /*Using the driver, Find the element ancestor and its text and assign the text to 'fName' */
	       /*Close the driver*/
	        WebElement element=driver.findElement(By.xpath("//input[@id='nickname']/ancestor::div[1]"));
	        
	        fName=element.getText();
	        
	        return fName;
	       
	       
	      
		}
		
		public static void main(String[] args)
		{
		    NameLocator namLocator=new NameLocator();
		    //Add required code here
		    
		    namLocator.setupDriver();
		   String name= namLocator.getNameLocator();
		   System.out.println(name);
		}

}




