package simpleProject;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class MultipleCollectionData {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Aues tuf");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> item=driver.findElements(By.cssSelector("div.rush-component.s-featured-result-item , div.puisg-col.puisg-col-4-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right"));
		
		for(WebElement data:item) {
			String price=data.findElement(By.cssSelector("span.a-price-whole")).getText();
			
			String price1=price.replace(",", "");
			
			Long price2=Long.parseLong(price1);
			
			if(price2>60000) {
				WebElement productTitle=data.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
				System.out.println(productTitle.getText());
				System.out.println(price2);
				System.out.println("======================================================");
			}
			
		}
		
	}

}
//div.rush-component.s-featured-result-item , div.puisg-col.puisg-col-4-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right
