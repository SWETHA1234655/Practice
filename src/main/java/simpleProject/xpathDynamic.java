package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class xpathDynamic {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" and @aria-label=\"Search Amazon.in\"]")).sendKeys("saree");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),\"Women's Printed Silk Saree \")]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='a-autoid-14-announce']/child::div/child::div[1]")).click();
		
		
		
		
		
		
	}

}
