package com.IASTCPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.GenericLibrary.BaseClass;

public class CalculationsPage extends BaseClass {
	public CalculationsPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Calculations']")
	private WebElement Calculations;

	@FindBy(xpath="//span[text()='Transactions ']")
	private WebElement Transactions;
	
	@FindBy(xpath="//*[@id=\"mat-tab-nav-panel-0\"]/main/app-transactions-search-page/app-page/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/a")
	private WebElement ClickGuide;
	
	
	@FindBy(xpath="//button/span[@class=\"mat-mdc-button-persistent-ripple mdc-button__ripple\"]")
	private WebElement CloneBtn;
	
	@FindBy(css="td[title=\"fa2bdd2c-13d7-4e3f-93e0-d09b2adf2a3d\"]")
	private WebElement Run_Calcuation;

	public WebElement getCalculations() {
		return Calculations;
	}

	public WebElement getTransactions() {
		return Transactions;
	}

	public WebElement getClickGuide() {
		return ClickGuide;
	}

	public WebElement getCloneBtn() {
		return CloneBtn;
	}

	public WebElement getRun_Calcuation() {
		return Run_Calcuation;
	}
	
	
}
