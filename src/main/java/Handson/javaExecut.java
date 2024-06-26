package Handson;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class javaExecut {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=driver;
		
	//	WebElement fname=driver.findElement(By.cssSelector("input#name"));
		
//		js.executeScript("arguments[0].setAttribute('value','swetha')", fname);
		
		//js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement view=driver.findElement(By.xpath("//label[normalize-space()='Country:']"));
		
		js.executeScript("arguments[0].scrollIntoView();", view);
		
		
	}

}
