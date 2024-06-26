package Handson;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class RightClickUsingAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
		WebElement edit=driver.findElement(By.xpath("//li[7]/span[1]"));
		
		edit.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		
	}

}
