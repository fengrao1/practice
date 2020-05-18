package enjoyball_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import bsh.This;
import page.LoginPage;



public class LoginTest  extends BaseTest{
	
	@Test
	public void loginSucess() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("13165532297", "123456");
		Assert.assertEquals(this.driver.currentActivity(), ".MainActivity");
	}

	
}
