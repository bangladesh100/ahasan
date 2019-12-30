package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.PageFactorylogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	WebDriverWait wait;
	PageFactorylogin pf;
	
	@Given("^As user i want to open browser$")
	public void as_user_i_want_to_open_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\md200\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	     
	      driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     pf=PageFactory.initElements(driver,PageFactorylogin.class); //i want to know this
	     
	    //driver.get("https://www.amazon.com")
	    driver.get(pf.getUrl());//that is
	     
	}

	@When("^As user i want click login button$")
	public void as_user_i_want_click_login_button() throws Throwable {
		 wait = new WebDriverWait(driver,180);
		//driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		 pf.getAccount().click();
		      Thread.sleep(3000);
		     
		   //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='nav-action-inner'])[1]")));
		      //wait.until(ExpectedConditions.visibilityOfElementLocated(pf.getSignin());
		     //driver.findElement(By.xpath("(//*[@class='nav-action-inner'])[1]")).click();
		      
		    wait.until(ExpectedConditions.elementToBeClickable(pf.getSignin()));
		      pf.getSignin().click();
	}

	@When("^I put valid user name$")
	public void i_put_valid_user_name() throws Throwable {
		
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ap_email']")));
		 wait.until(ExpectedConditions.elementToBeClickable(pf.getUserid()));
	   // driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("habib_mdahasan@yahoo.com");
		 pf.getUserid().sendKeys(pf.getUsername());
	
	     //driver.findElement(By.xpath("(//*[@id='continue'])[1]")).click();
	    pf.getUsercontinueButton().click();
	}

	@When("^I put valid password$")
	public void i_put_valid_password() throws Throwable {
		//driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("qajob123");
		pf.getPassword().sendKeys(pf.getPwd());
		//driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		pf.getSubmitButton().click();
	}

	@Then("^As user i login successfully$")
	public void as_user_i_login_successfully() throws Throwable {
	   
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		pf.getSubmitButton().click();
	}


}
