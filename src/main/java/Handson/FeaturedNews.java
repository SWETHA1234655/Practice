package Handson;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class FeaturedNews {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://be.cognizant.com");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		//public void userInfo() throws Exception {
			
			WebElement user=driver.findElement(By.xpath("//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']"));
			user.click();
			Thread.sleep(3000);
			WebElement name=driver.findElement(By.xpath("//div[@class='mectrl_accountDetails']/div[1]"));
			System.out.println("User name :"+name.getText());
			Thread.sleep(3000);
			WebElement mail=driver.findElement(By.xpath("//div[@class='mectrl_accountDetails']/div[2]"));
			System.out.println("Email id :"+mail.getText());
			
		//}
		
//		WebElement scroll=driver.findElement(By.xpath("//*[@data-automation-id=\"contentScrollRegion\"]"));//(//*[@data-automation-id='CanvasSection'])[4]
		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollTop += 2000;",scroll);//arguments[0].scrollIntoView();",scroll
//		Thread.sleep(5000);

		List<WebElement> news=driver.findElements(By.xpath("//div[@data-automation-id='Tiles']/div"));
		System.out.println(news.size());
//		for(WebElement valitool:news) {
//			List<WebElement> News=driver.findElements(By.xpath("//div[@data-automation-id='Tiles']/div"));
//		System.out.println();
//			
//			WebElement title=driver.findElement(By.xpath("//div[@id='title_text']"));
//			String tooltip=title.getAttribute("title");
//			if(tooltip.equals(title.getText())) {
//				System.out.println("Both are same");
//			}
//			
//			
//		}

		for(int i=0;i<=news.size()-1; i++)
		{
			List<WebElement> News=driver.findElements(By.xpath("//div[@data-automation-id='Tiles']/div"));
			News.get(i).click();
			Thread.sleep(5000);
			WebElement newsTitle=driver.findElement(By.xpath("//div[@id='title_text']"));
			String tooltip=newsTitle.getAttribute("title");
			if(tooltip.equals(newsTitle.getText())){
				System.out.println("Title and tooltip are same");
			}
			else {
				System.out.println("Title and tooltip are not same");
			}
			System.out.println("News Title :"+newsTitle.getText());
			System.out.println("News Data :"+driver.findElement(By.xpath("//div[@data-automation-id=\"textBox\"]/p[1]")).getText());
			WebElement author=driver.findElement(By.xpath("//div[@class='ly_ag_9f38462c']"));
			if(author.isDisplayed()) {
				author.click();
				Thread.sleep(3000);
			}
			else {
				System.out.println("Author is not displayed");
			}

			List<WebElement> link=driver.findElements(By.xpath("//p//a"));
			for(WebElement li:link) {
				System.out.println("NewsLetter Links  :"+li.getAttribute("href"));
			}
			WebElement share=driver.findElement(By.xpath("//span[text()='Share']"));
			if(share.isDisplayed()) {
				share.click();
				System.out.println("Share options :"+driver.findElement(By.xpath("//ul[@role='presentation']")).getText());
			}
			else {
				System.out.println("share is not displayed");
			}
			Thread.sleep(5000);
			WebElement scroll=driver.findElement(By.xpath("//*[@data-automation-id=\"contentScrollRegion\"]"));
			jse.executeScript("arguments[0].scrollTop += 9500;",scroll);
			Thread.sleep(5000);
			WebElement views=driver.findElement(By.xpath("//span[contains(text(),'Views')]"));
			System.out.println("Views :"+views.getText());
			Thread.sleep(5000);
			WebElement like=driver.findElement(By.xpath("//span[contains(text(),'people liked this')]"));
			System.out.println("Likes :"+like.getText());
			System.out.println("=================================================");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}
	}
}






