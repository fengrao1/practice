package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void loginSucess() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("18330919107", "123456");
		Assert.assertEquals(this.driver.currentActivity(), "com.example.lenovo.Activity.MainActivity");
	}
}
