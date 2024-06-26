package practice_Handson;

//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutor{    //Do not change the class name
	
	//Use the below declarations
	public static WebDriver driver;
	public static Object jsfname,jslname, jsuname, jspwd, jsphone, jsemail, jssubmit, jsreset;
	
	public WebDriver createDriver()
	{
		//Create the driver using the class DriverSetup. Assign it to the variable 'driver' and return it.
		driver=DriverSetup2.getWebDriver();
		return driver;
	}
 
 
  public void submitForm(String fname,String lname, String uname, String pwd, String phone, String email) 
  {
	    JavascriptExecutor jse = ((JavascriptExecutor)driver);
	    
	    //Using javascript executor, locate the elements of 'firstname','lastname','username','password'
	    //'phonenumber','email' and send the received values.
	    //Submit the form
	    
//	    jsfname=jse.executeScript("return document.getElementsByName('firstname')[0].value=argument[0];",fname);
////	    jsfname.sendkeys(fname);
//	    jslname=jse.executeScript("return document.getElementsByName('lastname')[0].value(lname)");
////	    jse.executeScript(lname);
//	    jsuname=jse.executeScript("return document.getElementsByName('username')[0].value(uname)");
////	    jse.executeScript(uname);
//	    jspwd=jse.executeScript("return document.getElementsByName('password')[0].value(pwd)");
////	    jse.executeScript(pwd);
//	    jsphone=jse.executeScript("return document.getElementsByName('phonenumber')[0].value(phone)");
////	    jse.executeScript(phone);
//	    jsemail=jse.executeScript("return document.getElementsByName('email')[0].value(email)");
////	    jse.executeScript(email);
//	    
//	    jssubmit=jse.executeScript("return document.getElementById('submit').click();");
////	    jssubmit=jse.executeScript("argument.click()");
	    
	    jsfname=jse.executeScript("return document.getElementsByName('firstname')[0].value=arguments[0];",fname);
	    jslname=jse.executeScript("return document.getElementsByName('lastname')[0].value=arguments[0];",lname);
	    jsuname=jse.executeScript("return document.getElementsByName('username')[0].value=arguments[0];",uname);
	    jspwd=jse.executeScript("return document.getElementsByName('password')[0].value=arguments[0];",pwd);
	    jsphone=jse.executeScript("return document.getElementsByName('phonenumber')[0].value=arguments[0];",phone);
	    jsemail=jse.executeScript("return document.getElementsByName('email')[0].value=arguments[0];",email);
	    
	    jssubmit=jse.executeScript("return document.getElementById('submit').click();");
	    
	    
        
        
                
  }
  
  
  public void reset()
  {
	  JavascriptExecutor jse = ((JavascriptExecutor)driver);
	  //Using javascript executor, locate the element reset and click it.
	  jsreset=jse.executeScript("return document.getElementById('reset').click();");
  }
  
  
  public static void main(String[] args) {
	  JavaScriptExecutor at=new JavaScriptExecutor();
		at.createDriver();
		at.reset();
		//Use this values to submit the form
		at.submitForm("Rahul","Dravid","Rahul","rahul@123","6232126711","rahultest@gmail.com");
		
		 
	}
  
}
