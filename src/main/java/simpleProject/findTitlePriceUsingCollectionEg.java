package simpleProject;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class findTitlePriceUsingCollectionEg {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/bsd-may-base24-store?fm=neo%2Fmerchandising&iid=M_e37518a6-44d0-40ea-ab2d-5677c523d74c_1_KUZ8W60OFFMO_MC.NT4YVV713W2Q&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Fashion_NT4YVV713W2Q&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L0_view-all&cid=NT4YVV713W2Q");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("zDPmFV")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("zDPmFV")).sendKeys("Asus tuf");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("MJG8Up")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> item=driver.findElements(By.cssSelector("div.tUxRFH"));
		
		//System.out.println(item.size());
		
		for(WebElement listitems:item) {
			
			String itemPrice=listitems.findElement(By.cssSelector("div.Nx9bqj._4b5DiR")).getText();
			
			String itemPrice1=itemPrice.replace("₹"," ").replace(",", "").replace(" ", "");
			
			Long itemPrice2=Long.parseLong(itemPrice1);
			
			if(itemPrice2 >60000) {
				WebElement productTitle=listitems.findElement(By.cssSelector("div.KzDlHZ"));
				System.out.println(productTitle.getText());
				System.out.println("Title"+productTitle.getAttribute("alt"));
				System.out.println("Price"+itemPrice2);
				System.out.println("---------------------------");
			}
			
			
			
		}
 	}

}
