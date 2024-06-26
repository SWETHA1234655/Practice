package simpleProject;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class CssSeletorUseCollection {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//List<WebElement> inputs=driver.findElements(By.cssSelector("a"));
		
		List<WebElement> inputs=driver.findElements(By.cssSelector("a.nav-a "));
		
		for(WebElement LinkTags:inputs) {
			
			String text=LinkTags.getText();
			
			if(!text.trim().isEmpty()) {
			
			System.out.println("Text By Link  :"+LinkTags.getText());
			
			System.out.println("Attribute name  :"+LinkTags.getAttribute("data-csa-c-type"));
			
			System.out.println("---------------------------------------------");
			
			}
				
				
		}
	}
	

}
