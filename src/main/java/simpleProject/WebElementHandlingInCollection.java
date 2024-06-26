package simpleProject;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class WebElementHandlingInCollection {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imageName=driver.findElements(By.cssSelector("(img[alt][src])"));
		
		System.out.println(imageName.size()); 
		
		
		
		for(WebElement image:imageName) {
			
			String text=image.getAttribute("alt");
			
			if(!text.trim().isEmpty())
			
			System.out.println("Image Title :"+image.getAttribute("alt"));
			
			//System.out.println("-------------------------------");
			
			//System.out.println("Text Element  :: "+image.getText());
			
			System.out.println("************************************************************");
			
			
		}
	}

}
