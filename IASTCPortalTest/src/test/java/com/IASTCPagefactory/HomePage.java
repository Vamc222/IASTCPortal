package com.IASTCPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.GenericLibrary.BaseClass;

public class HomePage extends BaseClass{
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='GAIN']")
	private WebElement Gaindropdown;

	@FindBy(xpath="//div[text()='GAIN (QA)']")
	private WebElement GainQA;
	
	@FindBy(xpath="//input[@placeholder=\"Search clients\"]")
	private WebElement searchClients;
	
	@FindBy(xpath="//a[text()=\"Defaults Testing\"]")
	private WebElement DefaultsTesting;
	
	@FindBy(xpath="//span[text()=' Run from batch File ']")
	private WebElement ClickBatchFile;
	
	@FindBy(xpath="//span[text()=' Standard batch file ']")
	private WebElement ClickStandardBatchFile;
	

	@FindBy(xpath="//div[@class=\"file-upload-icon\"]")
	private WebElement fileUploadBtn;
	@FindBy(id="mat-select-value-13")
	private WebElement page;
	
	
	

	public WebElement getGaindropdown() {
		return Gaindropdown;
	}

	public WebElement getGainQA() {
		return GainQA;
	}

	public WebElement getSearchClients() {
		return searchClients;
	}

	public WebElement getDefaultsTesting() {
		return DefaultsTesting;
	}

	public WebElement getClickBatchFile() {
		return ClickBatchFile;
	}

	public WebElement getClickStandardBatchFile() {
		return ClickStandardBatchFile;
	}

	public WebElement getFileUploadBtn() {
		return fileUploadBtn;
	}

	public WebElement getPage() {
		return page;
	}
	
	//
    
	

}

