package Handson;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class captureScreenShots {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		//whole page screenshot
		
//		TakesScreenshot t=(TakesScreenshot)driver;
//		
//		File src=t.getScreenshotAs(OutputType.FILE);
//		
//		File tar=new File("C:\\Users\\2318570\\eclipse-workspace\\Practice\\src\\main\\java\\screenshots\\sample.png");
//		
//		FileUtils.copyFile(src, tar);
		
		
		//particular field
		
		WebElement photo=driver.findElement(By.xpath("//div[@id='topbar']"));
		
		File src=photo.getScreenshotAs(OutputType.FILE);
		
		File tag=new File("C:\\Users\\2318570\\eclipse-workspace\\Practice\\src\\main\\java\\screenshots\\specific_field.png");
		
		FileUtils.copyFile(src, tag);
		
		
		
		
		
	}
	
	

}
