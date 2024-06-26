package simpleProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Access_by_Ws {
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("watch for girls");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("3 Hand Mechanism Analog Wrist Watch for Women Water Resistant with Classy Dial and Strap|Compliment Your Look|Ideal Gift for Female|Girl's|Ladies - A2057")).click();
		
		String productName=driver.findElement(By.partialLinkText("3 Hand Mechanism Analog Wrist Watch for Women Water Resistant with Classy Dial and Strap|Compliment Your Look|Ideal Gift for Female|Girl's|Ladies - A2057")).getText();
		
		String rate=driver.findElement(By.xpath("//span[normalize-space()='5,250']")).getText();
		
		System.out.println("ProductName :"+productName);
		
		System.out.println("Rate :"+rate);
	}

}
