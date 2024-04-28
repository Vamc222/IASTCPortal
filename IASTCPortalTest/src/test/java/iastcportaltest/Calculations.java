package iastcportaltest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IASTCPagefactory.CalculationsPage;
import com.IASTCPagefactory.HomePage;
import com.lib.GenericLibrary.BaseClass;

public class Calculations extends BaseClass{
	@Test
public void runCaiculations() throws IOException, InterruptedException {
		
			HomePage hp =new HomePage(driver);
			LoginTest lt =new LoginTest();
			CalculationsPage cp=new CalculationsPage(driver);
			lt.Login();
			BaseClass.explicitWait(hp.getGaindropdown());
			BaseClass.javaScriptClick(hp.getGaindropdown());//click gain dropdown 
			BaseClass.explicitWait(hp.getGainQA()); 
			hp.getGainQA().click();//click gain QA
			BaseClass.explicitWait(hp.getSearchClients()); // search clients
			hp.getSearchClients().sendKeys("default testing"); // enter default testing
			Assert.assertTrue(hp.getDefaultsTesting().isDisplayed());
			BaseClass.javaScriptClick(hp.getDefaultsTesting());//click default testing
			Assert.assertTrue(cp.getCalculations().isDisplayed());
			//BaseClass.explicitWait(cp.getCalculations());
			
			cp.getCalculations().click();
			Assert.assertTrue(cp.getTransactions().isDisplayed());
			cp.getTransactions().click();
			Assert.assertTrue(cp.getClickGuide().isDisplayed());
			BaseClass.explicitWait_and_click(cp.getClickGuide());
			Assert.assertTrue(cp.getCloneBtn().isDisplayed());
			BaseClass.explicitWait(cp.getCloneBtn());
			BaseClass.javaScriptClick(cp.getCloneBtn());
			Assert.assertTrue(cp.getRun_Calcuation().isDisplayed());
			BaseClass.explicitWait_and_click(cp.getRun_Calcuation());

}
}
