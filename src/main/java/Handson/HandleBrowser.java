package Handson;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class HandleBrowser {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://webapps.tekstac.com/MultipleWindow/");
		
		String st = driver.getWindowHandle();
		
		System.out.println(st);
		
		driver.findElement(By.xpath("//a[normalize-space()='Click to calculate EMI']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		ArrayList<String> ids=new ArrayList<String>(windows);
		
		System.out.println(ids.get(1));
//		String p=ids.get(0);
//		String c=ids.get(1);
		
		
//		driver.switchTo().window(c);
//		driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Solutions']")).click();
		
	}

}
