package iastcportaltest;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.IASTCPagefactory.HomePage;
import com.lib.GenericLibrary.BaseClass;

public class HomeTest extends BaseClass{
	@Test
public void uploadFile() throws IOException, InterruptedException {
HomePage hp =new HomePage(driver);
LoginTest lt =new LoginTest();
lt.Login();
BaseClass.explicitWait(hp.getGaindropdown());
BaseClass.javaScriptClick(hp.getGaindropdown());//click gain dropdown 
BaseClass.explicitWait(hp.getGainQA()); 
hp.getGainQA().click();//click gain QA
BaseClass.explicitWait(hp.getSearchClients()); // search clients
hp.getSearchClients().sendKeys("default testing"); // enter default testing
Assert.assertTrue(hp.getDefaultsTesting().isDisplayed());
//BaseClass.explicitWait(hp.getDefaultsTesting());
BaseClass.javaScriptClick(hp.getDefaultsTesting());//click default testing
BaseClass.explicitWait(hp.getClickBatchFile());
hp.getClickBatchFile().click();
BaseClass.explicitWait(hp.getClickStandardBatchFile());
hp.getClickStandardBatchFile().click();
hp.getFileUploadBtn().click();

}
}
