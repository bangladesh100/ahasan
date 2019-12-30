package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactorylogin {
	
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	private WebElement account;
	

    @FindBy(xpath="(//*[@class='nav-action-inner'])[1]")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement userid;
	
	@FindBy(xpath="(//*[@id='continue'])[1]")
	private WebElement usercontinueButton;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement submitButton;

	
	private String url="https://www.amazon.com";
	private String username = "habib_mdahasan@yahoo.com";
	private String pwd = "qajob123";
	
	public WebElement getAccount() {
		return account;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getUserid() {
		return userid;
	}
	public WebElement getUsercontinueButton() {
		return usercontinueButton;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPwd() {
		return pwd;
	}
	
	

}
