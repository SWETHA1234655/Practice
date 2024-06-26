package Handson;

import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class handleBrokenLinks {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement element:links) {
			
			String hrefvalue=element.getAttribute("href");
			
			if(hrefvalue =="null"|| hrefvalue.isEmpty()) {
				System.out.println("link is empty");
				continue;
			}
			
			URL linkToUrl=new URL(hrefvalue);
			
			HttpURLConnection con=(HttpURLConnection)linkToUrl.openConnection();
			
			con.connect();
			
			if(con.getResponseCode() >= 400) {
				
				System.out.println("Broken link");
				
			}
			else {
				System.out.println("normal link");
			}
		}
	}

}
