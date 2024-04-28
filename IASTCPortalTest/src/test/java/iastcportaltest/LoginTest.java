package iastcportaltest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IASTCPagefactory.Loginpage;
import com.lib.GenericLibrary.BaseClass;
import com.lib.GenericLibrary.ReadProperty;

public class LoginTest extends BaseClass{
@Test
public void Login() throws IOException, InterruptedException {
	Loginpage lp =new Loginpage(driver);
	lp.getUsername().sendKeys(ReadProperty.readValue("username"));
	lp.getPasswordBtn().sendKeys(ReadProperty.readValue("password"));
	BaseClass.explicitWait(lp.getLoginBtn());
	BaseClass.javaScriptClick(lp.getLoginBtn());
	//lp.getLoginBtn().click();
	boolean title=lp.getVerifyHomepagetitle().isDisplayed();
	Assert.assertTrue(title);
}
}
