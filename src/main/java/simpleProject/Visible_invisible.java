package simpleProject;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class Visible_invisible {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
//		driver.get("https://www.quora.com/");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//input[@aria-describedby=\"form-field-error:1 form-field-warning:2\"]")).sendKeys("swetha@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("swetha@123");
//		
//		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		
		
		
		
		
		List<WebElement> link=driver.findElements(By.cssSelector("a,link[rel]"));
		
		System.out.println(link.size());
		
		for(WebElement litag:link) {
			
			if(litag.isDisplayed()) {
				System.out.println(litag.isDisplayed());
				System.out.println(litag.getAttribute("href"));
			
			System.out.println("--------------------------------------------");
			}
			
		
		}
		
	}

}
