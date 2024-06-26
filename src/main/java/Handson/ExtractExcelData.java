package Handson;

import java.io.FileInputStream;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ExtractExcelData {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement dep=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement l= driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement rate= driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement choose=driver.findElement(By.xpath("//div[@id='mat-select-value-1']"));
		
		
		String file="C:\\Users\\2318570\\eclipse-workspace\\Practice\\dataFile.xlsx";
				
		int row=ExcelUtilities.getRowCount(file, "sheet1");
		
		for(int i=1;i<row;i++) {
			
			String dep_amt=ExcelUtilities.getCellData(file, "sheet1", i, 0);
			String len=ExcelUtilities.getCellData(file, "sheet1", i, 1);
			String int_rate=ExcelUtilities.getCellData(file, "sheet1", i, 2);
			String com=ExcelUtilities.getCellData(file, "sheet1", i, 3);
			String Exp=ExcelUtilities.getCellData(file, "sheet1", i, 4);
			//ExcelUtilities.getCellData(file, "sheet1", i, 0);
			
			Thread.sleep(1000);
			dep.clear();
			l.clear();
			rate.clear();
			dep.sendKeys(dep_amt);
			l.sendKeys(len);
			rate.sendKeys(int_rate);
			WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));   //select class object compounddrp will find elelment by id
			compoundrp.click();
			
			Thread.sleep(1000);
			List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			
			for(WebElement option:options)
			{
				if(option.getText().equals(com))
					option.click();
			}
			
			
			
			
			driver.findElement(By.xpath("(//div[@class='mdc-button__ripple'])[8]")).click();
			String act=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			//act=act.replace("$", "");
			
			if(Exp.equals(act) ) {
				ExcelUtilities.setCellData(file, "sheet1", i, 6, "passed");
				ExcelUtilities.fillGreenColor(file, "sheet1", i, 6);
			}
			else {
				
				ExcelUtilities.setCellData(file, "sheet1", i, 6, "failed");
				ExcelUtilities.fillRedColor(file, "sheet1", i, 6);
				
			}
			
			
			
			
		}
		System.out.println("completed");
		driver.close();
		
	}
	
	

}
