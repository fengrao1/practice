package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.LoginPage;


public class LoginTest  extends BaseTest{
	
	@Test
	public void loginSucess() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("17731026303", "123456");
		Assert.assertEquals(this.driver.currentActivity(), "com.example.lenovo.Activity.MainActivity");
	}

	@Test
	public void loginFail() {
		LoginPage loginPage=new LoginPage(driver);
		String actResult=loginPage.loginFail("1", "2");
		Assert.assertEquals(actResult, "用户名或者密码错误！");
	}
}
