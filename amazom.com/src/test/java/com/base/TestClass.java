package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {
	
	//WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://www.amazon.com");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
     
    /* driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
 
      
    WebDriverWait wait = new WebDriverWait(driver,180);//that is 
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='nav-action-inner'])[1]")));
    
     driver.findElement(By.xpath("(//*[@class='nav-action-inner'])[1]")).click();
     
   String username="habib_mdahasan@yahoo.com";//that
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ap_email']")));
     driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("habib_mdahasan@yahoo.com");
  driver.findElement(By.xpath("(//*[@id='continue'])[1]")).click();
     
     driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("qajob123");
     driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
   
     driver.findElement(By.xpath("//*[@type='submit']")).click();
		/*
		 * driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys(
		 * "uddin12"); driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(
		 * "habib_mdahasan@yahoo.com");
		 * driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys(
		 * "qajob123");
		 * driver.findElement(By.xpath("//*[@id='ap_password_check']")).sendKeys(
		 * "qajob123");
		 */	}

	
	
}
