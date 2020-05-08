package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void loginsuccess(){
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login1("17370226893","123456");
		
	}
	

}
