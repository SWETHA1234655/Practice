package Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class AlertExanmple {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts\r\n");
		
		
/*		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert jsalert=driver.switchTo().alert();
		jsalert.accept();*/
		
		

		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Alert jscon=driver.switchTo().alert();
//		jscon.accept();
		jscon.dismiss();
		
/*		WebElement check=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		check.click();
		Alert jspro=driver.switchTo().alert();
		jspro.sendKeys("Hi swetha");
		jspro.accept();
	//	System.out.println(jspro.getText());
		
		String actRes=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expRes="You entered: Hi swetha";
		if(actRes.equals(expRes)) {
			System.out.println("Result verified");
			
		}
		else {
			System.out.println("Wrong");
		}
		
		*/
	}
	

}
