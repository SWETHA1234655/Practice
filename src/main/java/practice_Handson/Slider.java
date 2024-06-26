package practice_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;

public class Slider{  //DO NOT Change the class Name
		
		static String baseUrl="http://webapps.tekstac.com/OnlineShopping/fashion.html"; 
		public static WebDriver driver;
		public static String productInfo;
	    public static String quantityInfo;
	    public static String priceInfo;
	    
		
		public WebDriver createDriver(){       //DO NOT change the method signature
		   // Implement code to create Driver from DriverSetup and return it
		   // Get the Web Driver and assign it to the driver variable
		   // navigate to the baseUrl
	       // return driver
	       driver=DriverSetup.getWebDriver();
	       driver.navigate().to(baseUrl);
	       return driver;
		}
		
		public void implDragnDrop(){   //DO NOT change the method signature
		
	        // Locate the source web element that needs to be dragged.

	        // Locate the target web element that needs to be dropped.      

	        // Creating object of Actions class to build composite actions

	        // Performing the drag and drop action
	        
	        WebElement source=driver.findElement(By.xpath("//p[@id='Shirts']"));
	        
	        WebElement target=driver.findElement(By.xpath("//p[text()='Drop the Dress Names into this basket']"));
	        
	        Actions act=new Actions(driver);
	        
	        act.dragAndDrop(source,target).build().perform();
	        
	       // act.perform();
			

		}
		
		public void implMoveSlider(){   //DO NOT change the method signature
		    // Creating object of Actions class to build composite actions
			
			Actions act=new Actions(driver);

	        // Locate the slider web element
			
			//int silde=5;
			
			WebElement initial=driver.findElement(By.xpath("//input[@id='myRange']"));
			
			//System.out.println(initial.getLocation());
			
			//WebElement target=driver.fin

	        // Move the slider to '5'

	        // For Example

	            // You can use the below methods to move the slider

	            // * moveToElement(WebElement target)

	            // * dragAndDropBy(WebElement source, int xOffset, int yOffset)

	            // xOffset value is chosen as given below
	                
	                // a. If the 'kg' value is 5 the xOffset is "-10"
	                // b. If the 'kg' value is 4 the xOffset is "-20"

	                // c. If the 'kg' value is 3 the xOffset is "-40"

	                // d. If the 'kg' value is 6 the xOffset is "10"

	                // e. If the 'kg' value is 7 the xOffset is "20"

	            // yOffset value is default ‘0’
			
			act.click(initial).build().perform();
			act.moveToElement(initial).dragAndDropBy(initial, -10, 0).build().perform();
			
			
		}
		
		public String getProductDetail(){ //DO NOT change the method signature
	    
	        // Locate the text displaying the product name. 
			
			// Assign the displaying text to the static variable 'productInfo'

	        // Return the text using getText() method.
			
			return productInfo=driver.findElement(By.cssSelector("span#product")).getText();
			

	    }
	    
	    
	    public String getQuantityDetail(){ //DO NOT change the method signature

	        // Locate the text displaying the product quantity(No). 
	    	
	    	// Assign the displaying text to the static variable 'quantityInfo'

	        // Return the text using getText() method.
	    	
	    	return quantityInfo  =driver.findElement(By.cssSelector("span#No")).getText();
	    	
	    }
	   
	   
	    public String getPriceDetail(){  //DO NOT change the method signature
	        // Locate the text displaying the product price. 
	         
	        // Assign the displaying text to the static variable 'priceInfo'

	        // Return the text using getText() method.
	    	
	    	return priceInfo=driver.findElement(By.cssSelector("span#price")).getText();

	         
	    }

		public static void main(String[] args){          //DO NOT change the method signature
		    Slider ex =new Slider();
		    
		    //Implement the required code
		    //Close the driver
		    ex.createDriver();
		    ex.implDragnDrop();
		    ex.implMoveSlider();
		    ex.getProductDetail();
		    ex.getQuantityDetail();
		    ex.getPriceDetail();
		    
		}
}




