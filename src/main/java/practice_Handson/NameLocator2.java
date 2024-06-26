package practice_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameLocator2{      //DO NOT change the class name
 
    public static String baseUrl;
    public static WebDriver driver;
	
	public WebDriver createDriver()
	{
	    //Create driver. Assign it to static variable 'driver' and return it
	    
	    return DriverSetup2.getWebDriver();
	    
	}
	
	public void navigate(WebDriver driver){
	     //Navigate to the baseUrl
		 baseUrl="http://webapps.tekstac.com/Handling_Regular_Expression/";
	     driver.navigate().to(baseUrl);
	}
	
   	public void setFormValues(WebDriver driver)
	{
	    //set the value for 'Shipment for user' and submit form
	    driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Shamili");
	    driver.findElement(By.xpath("//button[@id='track']")).click();
	}

    public WebElement getNameResultElement(WebDriver driver) {
        //Find the element of 'Shamili' and return it
        WebElement name=driver.findElement(By.xpath("//div[@id='result']/table[1]/tbody[1]/tr[1]/td[2]"));
       // name.getText();
        return name;
        
    }
    public WebElement getShipmentResultElement(WebDriver driver) {
         //Find the element of 'SHIP1236' and return it
         WebElement number=driver.findElement(By.cssSelector("div#shipment"));
        // number.getText();
         return number;
    }
    public WebElement getEmailResultElement(WebDriver driver) {
        
        //Find the element of 'shamili93@gamil.com' and return it
        
        WebElement mail=driver.findElement(By.xpath("//div[@id='e- mail']"));
        
        //mail.getText();
        
        return mail;
        
    }
    
    public boolean validateEmail(String eMailID) {
       //Validate email using regex. 
       
    //   Pattern p=Pattern.compile("\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b");
    //   return Matcher m=p.Matcher(eMailID);
    //   while(m.find()){
    //       System.out.println(m.group());
            return eMailID.matches("\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b");
    }
       
        
    
    public boolean validateShipmentId(String shipmentId) {
        //Validate shipmentId using regex
        
        // pattern p=Pattern.compile("[A-Z0-9]{8}");
        // return Matcher m=p.Matcher(shipmentId);
        //while(m.find)
        return shipmentId.matches("[A-Z0-9]{8}");
        
    }
        
      
        
     public static void main(String[] args)
	{
	    NameLocator2 reg=new NameLocator2();
	     //Add required code here
	     WebDriver driver=reg.createDriver();
	     reg. navigate(driver);
	     reg.setFormValues(driver);
	     WebElement name=reg.getNameResultElement(driver);
	     WebElement number=reg.getShipmentResultElement(driver);
	     WebElement mail=reg.getEmailResultElement(driver);
	     System.out.println(name.getText());
	     System.out.println(reg.validateEmail(mail.getText()));
	     System.out.println(reg.validateShipmentId(number.getText()));
	}

  
}
