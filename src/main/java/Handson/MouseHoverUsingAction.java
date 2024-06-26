package Handson;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class MouseHoverUsingAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement all=driver.findElement(By.cssSelector("a#nav-hamburger-menu"));
		
		WebElement bestSeller=driver.findElement(By.linkText("Best Sellers"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(all).moveToElement(bestSeller).build().perform();
	}
	
	

}
