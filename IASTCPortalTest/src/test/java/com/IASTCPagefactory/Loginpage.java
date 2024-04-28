package com.IASTCPagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.GenericLibrary.BaseClass;


public class Loginpage extends BaseClass{
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement username;

	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement PasswordBtn;
	
	@FindBy(xpath="//button[text()=\" Log In \"]")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//span[text()='Welcome to the Deloitte GlobalAdvantage Portal.']")
	private WebElement VerifyHomepagetitle;
	
	//

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasswordBtn() {
		return PasswordBtn;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getVerifyHomepagetitle() {
		return VerifyHomepagetitle;
	}



	
	

    
	
	
	
}
