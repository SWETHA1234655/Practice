package Handson;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class DragAndDropUsingAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement osla=driver.findElement(By.cssSelector("#box1"));
		
		WebElement italy=driver.findElement(By.cssSelector("#box106"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(osla, italy).perform();
		
		WebElement b1=driver.findElement(By.cssSelector("#box2"));
		
		WebElement s1=driver.findElement(By.cssSelector("#box104"));
		
		Actions act1=new Actions(driver);
		
		act1.dragAndDrop(b1, s1).perform();
	}

}
