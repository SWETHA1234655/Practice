package sampleMiniProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Main {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://www.air.irctc.co.in/ ");
		
		
		
		//Thread.sleep(2000);
		
		String exp_url="Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air ";
		
		String act_url=driver.getTitle();
		
		if(exp_url.equals(act_url)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		driver.manage().window().maximize();
		
		
//		if(driver.toString().contains("null")) {
//			System.out.println("Brower is not opened");
//		}
//		else {
//			System.out.println("Brower is opened");
//		}
		
//		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#stationFrom")).sendKeys("Hyd");
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),\"Hyderabad (HYD)\")]")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#stationTo")).sendKeys("Pune");
		
//		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("ul#ui-id-2 li.ui-menu-item:nth-child(7)")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#originDate")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown datepicker-left datepicker-bottom rdeparturedate no-border']//tr[@class='active']//td")).click();
		
		driver.findElement(By.cssSelector("span.act.active-red")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"noOfpaxEtc\"]")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("select#travelClass")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[@value=\"Business\"]")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),\"Search\")]")).click();
		
//		Thread.sleep(5000);
		
//		String ExpRes=driver.findElement(By.xpath("//input[@id=\"originDate\"]")).getText();
//		
//		String ActRes=driver.findElement(By.xpath("//div[@role='listbox']//div[1]//a[1]/span[1]")).getText();
//		
//		if(ActRes.equals(ExpRes)) {
//			System.out.println("date is correct");
//		}
//		else {
//			System.out.println("Not Correct");
//		}
		
		List<WebElement> details=driver.findElements(By.xpath("//*[@class='right-searchbarbtm-in']/div/div[2]"));
		
		System.out.println(details.size());
		
		for(WebElement NameList:details) {
			
			
     		WebElement name=NameList.findElement(By.xpath("./b"));
	    	WebElement NoFlight=NameList.findElement(By.xpath("./span"));
		
			
			
//			List<WebElement> flightName=NameList.findElements(By.xpath("//div[@class=\"right-searchbarbtm-in\"]/div//b"));
//			List<WebElement> number=NameList.findElements(By.xpath("//div[@class=\"right-searchbarbtm-in\"]/div[1]//span"));
			
			System.out.println("name :"+name.getText());
			System.out.println("No of flight :"+NoFlight.getText());
			
			System.out.println("============================================");
			
			
		}
		
		
		
		
	}

}
