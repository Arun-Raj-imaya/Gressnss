package org.very;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Greens {
public static WebDriver driver;
	
	@BeforeClass
	public void browselanuch() {
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in");

	}
	
	@Test(priority=-1)
	public void Searchprodut() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
      
      
	}
	
	@Test
	public void selectproduct() {
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();
	}
	@AfterClass
	public void clean() {
		driver.close();
		

	}
	

}
