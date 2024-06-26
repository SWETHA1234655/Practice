package Handson;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class keyBoardEvents {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://text-compare.com/");
		
//		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//textarea[@class='inputText'][1]")).sendKeys("Parameshwari");
		
		Actions act=new Actions(driver);
		
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		
//		Thread.sleep(2000);
//		
//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.TAB).build().perform();
//		
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		driver.get("https://text-compare.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://webapps.tekstac.com/Handling_Regular_Expression/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
	}

}
