package Handson;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurance {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	
		WebElement travel=driver.findElement(By.xpath("(//div[@class='prd-icon add shadowHandler short']//div/i)[7]"));
		wait.until(ExpectedConditions.visibilityOf(travel));
		js.executeScript("arguments[0].click();",travel);
		
		Thread.sleep(3000);
		WebElement selDis=driver.findElement(By.xpath("//ul[@id='favourite-country']//li[4]"));
		wait.until(ExpectedConditions.visibilityOf(selDis));
		js.executeScript("arguments[0].click();",selDis);
		
		WebElement next=driver.findElement(By.xpath("//button[@class='travel_main_cta']"));
		wait.until(ExpectedConditions.visibilityOf(next));
		
		js.executeScript("arguments[0].click();",next);
		
		Thread.sleep(3000);
		WebElement startD=driver.findElement(By.xpath("//div[@class='MuiPickersDateRangePickerInput-root']//div[1]//div[1]//div[1]"));
		wait.until(ExpectedConditions.visibilityOf(startD));
		startD.click();
		
		WebElement s_date=driver.findElement(By.xpath("(//div[@class='MuiPickersDesktopDateRangeCalendar-root']/div[1]//div[@class='MuiPickersCalendar-week'])[5]/div[5]"));
		wait.until(ExpectedConditions.visibilityOf(s_date));
		s_date.click();
		
		WebElement e_date=driver.findElement(By.xpath("(//div[@class='MuiPickersDesktopDateRangeCalendar-root']/div[2]//div[@class='MuiPickersCalendar-week'])[4]/div[6]"));
		wait.until(ExpectedConditions.visibilityOf(e_date));
		e_date.click();
		
		WebElement next1=driver.findElement(By.xpath("//button[@class='travel_main_cta']"));
		next1.click();
		
		WebElement person=driver.findElement(By.xpath("(//div[@class='memSelectRadioWrapper__radio'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(person));
		person.click();
		
		WebElement selectAge1=driver.findElement(By.xpath("//div[contains(text(),'Select age of traveller 1')]"));
		selectAge1.click();
		WebElement age1=driver.findElement(By.xpath("(//input[@name='inputSelectList_undefined'])[22]"));
		js.executeScript("arguments[0].click();", age1);
		
		WebElement selectAge2=driver.findElement(By.xpath("//div[contains(text(),'Select age of traveller 2')]"));
		selectAge2.click();
		WebElement age2=driver.findElement(By.xpath("(//input[@name='inputSelectList_undefined'])[23]"));
		js.executeScript("arguments[0].click();", age2);
		
		WebElement next2=driver.findElement(By.xpath("//button[@class='travel_main_cta']"));
		wait.until(ExpectedConditions.visibilityOf(next2));
		next2.click();
		
		WebElement pDisable=driver.findElement(By.xpath("//input[@id='ped_no']"));
		wait.until(ExpectedConditions.visibilityOf(pDisable));
		pDisable.click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		WebElement sort=driver.findElement(By.xpath("//p[@class='filter_name_heading']"));
		wait.until(ExpectedConditions.visibilityOf(sort));
		sort.click();
		
		WebElement chooseLTH=driver.findElement(By.xpath("//input[@value='Premium low to high']"));
		wait.until(ExpectedConditions.visibilityOf(chooseLTH));
		chooseLTH.click();
		
		WebElement plan=driver.findElement(By.xpath("(//div[@class='cardWrapper__showMore '])[1]"));
		wait.until(ExpectedConditions.visibilityOf(plan));
		plan.click();
		
		//(//div[@class='quotesCard__quotesListWrap'])[1]//div[@class='quotesCard__quoteWrap   ']
		List<WebElement> plans=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/section/article/div/div/div/div/div"));
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='quotesCard__cta familyPlanPriceContainer']//span"));
		
		for(int i=0;i<3;i++) {
			System.out.println("Name :"+plans.get(i).getText());
			System.out.println("Price :"+price.get(i).getText());
			
		}
		
		driver.navigate().to("https://www.policybazaar.com/"); 
		
		//Car Insurance
		
		WebElement car=driver.findElement(By.xpath("(//div[@class='prd-icon add shadowHandler short']//div/i)[4]"));
		wait.until(ExpectedConditions.visibilityOf(car));
		js.executeScript("arguments[0].click();",car);
		
		Thread.sleep(3000);
		WebElement newCar=driver.findElement(By.xpath("//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']"));
		wait.until(ExpectedConditions.visibilityOf(newCar));
		newCar.click();
		
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.xpath("//ul//li[3]"));
		wait.until(ExpectedConditions.visibilityOf(city));
		city.click();
		
		Thread.sleep(3000);
		WebElement cityRTO=driver.findElement(By.xpath("//ul[@class='CityRTO_rtoList__Plo2H']//li[3]"));
		wait.until(ExpectedConditions.visibilityOf(cityRTO));
		cityRTO.click();
		
		Thread.sleep(3000);
		WebElement carBrand=driver.findElement(By.xpath("//div[@class='animationWrap']//ul//li[8]"));
		wait.until(ExpectedConditions.visibilityOf(carBrand));
		carBrand.click();
		
		Thread.sleep(3000);
		WebElement carModel=driver.findElement(By.xpath("//div[@class='animationWrap']//ul//li[6]"));
		wait.until(ExpectedConditions.visibilityOf(carModel));
		carModel.click();
		
		Thread.sleep(3000);
		WebElement carVarient=driver.findElement(By.xpath("//div[@class='animationWrap']//ul//li[3]"));
		wait.until(ExpectedConditions.visibilityOf(carVarient));
		carVarient.click();
		
		Thread.sleep(3000);
		WebElement f_name=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		wait.until(ExpectedConditions.visibilityOf(f_name));
		f_name.sendKeys("swetha");
		
		WebElement mail=driver.findElement(By.xpath("//input[@placeholder='Your email']"));
		wait.until(ExpectedConditions.visibilityOf(mail));
		mail.sendKeys("ArSwe@gmail.com");
		
		WebElement phone=driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		wait.until(ExpectedConditions.visibilityOf(phone));
		phone.sendKeys("197652345");
		
		WebElement errormsg=driver.findElement(By.xpath("//div[@class='errorMsg']"));
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		System.out.println(errormsg.getText());
		
		driver.navigate().to("https://www.policybazaar.com/");
		
		//Health Insurance
		
		WebElement insProducts=driver.findElement(By.xpath("//li[@class='ruby-menu-mega shade mr']/a"));
		act.moveToElement(insProducts).perform();
		
		WebElement healthInsurance=driver.findElement(By.xpath("(//a[@class='headlink'])[5]"));
		wait.until(ExpectedConditions.visibilityOf(healthInsurance));
		healthInsurance.click();
		
		WebElement healthMenu=driver.findElement(By.xpath("//div[@class='hide-nav hide-mobile-link onlydesktop']"));
		wait.until(ExpectedConditions.visibilityOf(healthMenu));
		act.moveToElement(healthMenu).perform();
		
		List<WebElement> variousHealthIns=driver.findElements(By.xpath("(//ul[@class='dropdown-menu min'])[3]//li"));
		System.out.println(variousHealthIns.size());
		
		for(WebElement li:variousHealthIns) {
			System.out.println(li.getText());
		}
		
		
		
	}

}		
		
		
		
		






		
		
		
		
		
		
		
