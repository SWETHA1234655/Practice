package simpleProject;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;



public class CssSelectorUseAttr {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Mobiles, Computers")).click();
		
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Tablets']")).click();
		
		driver.findElement(By.xpath("//ul[@class=\"hmenu hmenu-visible hmenu-translateX\"]/child::li[9]/a[@href='/gp/browse.html?node=1375458031&ref_=nav_em_sbc_mobcomp_tablets_0_2_8_8']")).click();
		
	/*	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@src=\"https://images-eu.ssl-images-amazon.com/images/G/31/img24/Tablet/Mar/tile/1.png\"]")).click();
		
		Thread.sleep(1000);
		
		String title=driver.findElement(By.cssSelector("h1.a-size-large.a-spacing-none")).getText();
		
		System.out.println("Title :"+title);
		
		*/
		
		
		
	}
	
	

}
