package simpleProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Xpath_Example {
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("swe@gmail.com");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("swe@2002");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Swetha");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("shanmugam");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("swe_Ak");
		
		
		
		
		
	}

}
