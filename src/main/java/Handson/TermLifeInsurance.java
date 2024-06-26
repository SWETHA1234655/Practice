package Handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TermLifeInsurance {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		
		WebElement tI=driver.findElement(By.xpath("//div[@class='prd-block mrtop20 mobile'][2]"));
		tI.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Fullname']")).sendKeys("swe");
		
		driver.findElement(By.xpath("//input[@name='MobileNo']")).sendKeys("9876543342");
		
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='Mumbai']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='StructureValue']")).sendKeys("4000000");
		driver.findElement(By.xpath("//input[@id='ContentValue']")).sendKeys("100000");
		
		driver.findElement(By.xpath("//button[@class='prequote-btn']")).click();
		
//		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='insurer-plan-list']"));
		WebElement li=driver.findElement(By.xpath("//div[@class='plan-quotes']//div[@class=' insurers-plan']//div//div//ul//li//p"));
		
		System.out.println(li.getText());
/*		for(WebElement plans:li) {
			
			String planName=plans.findElement(By.xpath("//div[@class='plan-quotes']//div[@class=' insurers-plan']//div//div//ul//li//p")).getText();
			System.out.println("Plan name:"+planName);
			System.out.println("**********************************");
		}*/
	}

}
