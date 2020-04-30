package edu.testcase;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.dataprovider.ExcelDataProvider;
import edu.pages.RegisterPage;
import edu.utils.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegisterTest extends BaseTest{

	@DataProvider(name="RegisterTestData")
	public Object[][] words0() throws Exception{
		ExcelDataProvider d = new ExcelDataProvider();

		return d.getTestDataByExcel("data/RegisterTestData.xlsx","Sheet1");
	}
	
	@BeforeClass
	public void clickRegister() {
		 System.out.println("测试用例开始");		 
	}
	
	//测试移动，联通，电信手机号时候否都能注册；
	//密码是否可以选用全数字，全英文，数字英文都有，特殊符号，标点符号，空格；
	//密码超过12位是否可以
	//共9条
	@Test(dataProvider="RegisterTestData",priority=1)
	public void test1(String name,String code,String password) {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.clickRegister();
		registerPage.RegisterSuccess(name,code,password);
		Assert.assertTrue(this.driver.getPageSource().contains("玩个球："));
	}
	
	//测试电话座机号是否可以注册
	@Test(priority=2)
	public void test2() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.clickRegister();
		registerPage.RegisterSuccess("89681150","1234","123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("玩个球：请检验您输入的手机号"));
	}
	
	//测试10086是否可以注册
	@Test(priority=3)
	public void test3() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.RegisterSuccess("10086","1234","123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("玩个球：请检验您输入的手机号"));
	}
	
	//注册时不隐藏密码
	@Test(priority=4)
	public void test4() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.RegisterEye();
		registerPage.RegisterSuccess("15567809999","1234","123456789");
	}
}
