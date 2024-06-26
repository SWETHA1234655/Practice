package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class frameEx {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//select 1 frame
		
		WebElement f1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		
		driver.switchTo().frame(f1);
		
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("frame one");
		
		driver.switchTo().defaultContent();
		
		//select 2 frame
		
		WebElement f2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		
		driver.switchTo().frame(f2);
		
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("frame two");
		
		driver.switchTo().defaultContent();
		
		//select 3 frame
		
		WebElement f3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		driver.switchTo().frame(f3);
		
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("frame 3");
		
		//inner iframe
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.vd3tt")).click();
		
		
		
		

	}

}
