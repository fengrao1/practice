package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bsh.This;
import edu.base.BaseTest;
import edu.dataprovider.ExcelDataProvider;
import edu.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	
	@BeforeClass
	public void login() {
		 System.out.println("����������ʼ");	 
	}
	
	
	//1����¼�ƶ��ֻ���
	@Test(priority=1)
	public void loginSucess1() {		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("15227989218", "123456789");		
		Assert.assertTrue(this.driver.getPageSource().contains("ȫ��"));
	}
	
	//2����¼��ͨ�ֻ���
	@Test(priority=2)
	public void loginSucess2() {		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("15632112815", "123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("ȫ��"));
	}
	
	//3����¼�����ֻ���
	@Test(priority=3)
	public void loginSucess3() {		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("18033888690", "123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("ȫ��"));
	}
	
	//4����¼δע����ֻ���
	@Test(priority=4)
	public void loginSucess4() {		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("18022331144", "123456789");	
		Assert.assertTrue(this.driver.getPageSource().contains("������ֻ���δע��"));

	}
	
	//5����ʾ����
	@Test(priority=5)
	public void loginSucess5() {	
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginEye();
		loginPage.loginSuccess("15227989218", "123456789");		

	}
	
	//6����������
	@Test(priority=6)
	public void forgetPassword() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.forgetpsw();
		loginPage.Changepsw("15227989218","1234","123456");
		Assert.assertTrue(this.driver.getPageSource().contains("�޸�����ɹ�"));
	}

	//7����ʾ�޸ĺ������
	@Test(priority=7)
	public void forgetPassword1() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.forgetpsw();
		loginPage.forgetEye();
		loginPage.Changepsw("15227989218","1234","123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("�޸�����ɹ�"));
	}
	
	//8����ҳ����
	@Test(priority=8)
	public void search() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("15227989218", "123456789");
		loginPage.Seatch("hahaha");
	}
}
