package sampleMiniProject;



import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class IRCTCAIR{
	
	static WebDriver driver;
	String act_url;
	String exp_url;
	public static ExtentSparkReporter ExReporter;
	public static ExtentReports extent;
	public static ExtentTest test; 
	
	public WebDriver browserSetup()
	{
		
		ExReporter=new ExtentSparkReporter("C:\\Users\\2318570\\eclipse-workspace\\project\\src\\main\\java\\ExtentReport\\Report.html");//specify location of the report
		
		ExReporter.config().setDocumentTitle("Extent Report"); // TiTle of report
		ExReporter.config().setReportName("Functional Testing"); // name of the report
		ExReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(ExReporter);

		driver=DriverSetup.webDriver();
		return driver;
	}
	
	public void excel() {
		
		ExcelDataFile.ExcelData();
	}
	
	//verify the title
	
	public void openUrl(WebDriver driver) throws Exception {
		
		ExtentTest t1=extent.createTest("Open the Url ");
		
		
		driver.get(" https://www.air.irctc.co.in/ ");
		
		act_url=driver.getTitle();
		
		exp_url="Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air";
		
		screenShots(driver,"home");
		
		t1.log(Status.INFO,"Flight Search Automation site is opened");
		
		
		
		
		ExcelDataFile.setExcelValue(exp_url, act_url);
		
		if(exp_url.equals(act_url)) {
			
			System.out.println("Site Opened properly.");
		}
		else {
			
			System.out.println("site is not opened. ");
		}
		
		t1.log(Status.PASS,"site is open successfully");
		
	}
	
	//maximize the window
	public void maximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	
	}
	
	public void EnterOrigin(WebDriver driver) throws Exception {
	
	//Enter "Hyd" in “From” city, in the auto listed results, select "HYDERABAD (HYD)"  
	
//	driver.findElement(By.cssSelector("input#stationFrom")).sendKeys(ExcelDataFile.orginFrom);
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//	WebElement origin=driver.findElement(By.xpath("//*[contains(text(),'Hyderabad (HYD)')]"));
//	
//	origin.click();
	
	WebElement enterfrom= driver.findElement(By.id("stationFrom"));
		  enterfrom.sendKeys(ExcelDataFile.orginFrom);
          Thread.sleep(5000);
		  List<WebElement> list1=driver.findElements(By.xpath("//*[contains(text(),'Hyderabad')]"));
		  for(WebElement lis:list1)
		  {
			  String text=lis.getText();
			  if(text.contains("HYD"))
			  {
				  lis.click();
			  }
		  }

	
	}
	
	//Enter "Pune" in "To" city, in the auto listed results, select "PUNE (PNQ)"
	
	public void EnterDestination(WebDriver driver) throws Exception {
	
//	driver.findElement(By.cssSelector("input#stationTo")).sendKeys(ExcelDataFile.destinationTo);
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//	WebElement destination=driver.findElement(By.cssSelector("ul#ui-id-2 li.ui-menu-item:nth-child(7)"));
//	
//	destination.click();
		
		WebElement Enterto= driver.findElement(By.id("stationTo"));
		  Enterto.sendKeys(ExcelDataFile.destinationTo);
		  Thread.sleep(1000);
		  List<WebElement> list2=driver.findElements(By.xpath("//*[contains(text(),'Pune')]"));
		  for(WebElement li:list2)
		  {
			  String text=li.getText();
			  if(text.contains("PNQ"))
			  {
				  li.click();
			  }
		  }
	
	}
	
	//Select today’s date from the date picker. 
	
	public void DataPicker(WebDriver driver) {
	
	WebElement date=driver.findElement(By.id("originDate"));
	
	date.click();
	
	WebElement today=date.findElement(By.xpath("//span[@class='act active-red']"));
	
	today.click();
	
	}
	
	//Select "Business" class, from “Choose class” dropdown box in Traveller details field. 
	
	public void EnterTraveller(WebDriver driver) {
	
	driver.findElement(By.xpath("//input[@id=\"noOfpaxEtc\"]")).click();
	
	driver.findElement(By.cssSelector("select#travelClass")).click();
	
	WebElement traveller=driver.findElement(By.xpath("//option[@value=\"Business\"]"));
	
	traveller.click();
	
	}
	
	//Click on "Search" button. 
	
	public void EnterSearch(WebDriver driver)throws Exception {
	
	WebElement search=driver.findElement(By.xpath("//button[contains(text(),\"Search\")]"));

	screenShots(driver,"viewdata");
	
	search.click();
	
	
	
	
	
	}
	
	//Verify the results shown are valid, by checking the city and date values are same as given in previous page. 
	
	public String verifyCityAndDate(WebDriver driver) throws InterruptedException {
	
	String 	verifyCity="";
	List<WebElement> city1=driver.findElements(By.xpath("//*[@class='right-searchbarbtm-in']/div[2]/span"));
	List<WebElement> city2=driver.findElements(By.xpath("//*[@class='right-searchbarbtm-in']/div[3]/span"));
	
    Thread.sleep(5000);
    
	WebElement dep_date=driver.findElement(By.xpath("//input[@id='originDate']"));
	
	Thread.sleep(5000);
	
	dep_date.click();
	
	Thread.sleep(5000);
	
	WebElement today1=driver.findElement(By.xpath("//span[@class='act active active-red']"));
	
	today1.click();
	
	Thread.sleep(5000);

	int noOfResults = city1.size();

	for(int i = 0; i < noOfResults; i++)
	{
		String c1=city1.get(i).getText();
		String c2=city2.get(i).getText();
		String departure_date=today1.getText();
		System.out.println(departure_date);
	
		if(c1.contains("Hyderabad") && c2.contains("Pune") && LocalDate.now().toString().split("-")[2].contains(departure_date))
		{
			boolean result = true;
			verifyCity= "Task verified";
			
			
		}
		else
		{
			boolean result = false;
			verifyCity= "Task failed";
			
			break;
			
		}
	}
		return verifyCity;
	}
	
	//Display the name and Number of available Flights on the console 
	
	
	public void ResultToBeDisplay(WebDriver driver) throws Exception{
	
	List<WebElement> details=driver.findElements(By.xpath("//*[@class='right-searchbarbtm-in']/div/div[2]"));
	
	//System.out.println(details.size());
	
	for(WebElement NameList:details) {
		
 		WebElement name=NameList.findElement(By.xpath("./b"));
    	WebElement NoFlight=NameList.findElement(By.xpath("./span"));
    	System.out.println("name :"+name.getText());
		System.out.println("No of flight :"+NoFlight.getText());
		
		System.out.println("============================================");
		
		screenShots(driver,"result");
		
	}
	
	}
	
	public void screenShots(WebDriver driver,String name) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File tar=new File("C:\\Users\\2318570\\eclipse-workspace\\project\\src\\main\\java\\screenshots\\"+name+".png");
		
		FileUtils.copyFile(src, tar);
		
		
	}
	
	
	
	
	

}

