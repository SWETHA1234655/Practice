package Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class DoubleClickUsingAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement w1=driver.findElement(By.xpath("//input[@id='field1']"));
		
		w1.clear();
		
		w1.sendKeys("Swetha");
		
		WebElement button=driver.findElement(By.xpath("//button[.='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform();
	}

}
