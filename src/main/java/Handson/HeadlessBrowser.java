package Handson;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowser {
	
	public static void main(String[] args) {
		
		ChromeOptions op=new ChromeOptions();
	//	op.setHeadless(true);
		op.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(op);
		
		
		driver.get("http:/www.deadlinkcity.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		
	}

}
