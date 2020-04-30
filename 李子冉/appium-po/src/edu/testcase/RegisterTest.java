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
		 System.out.println("����������ʼ");		 
	}
	
	//�����ƶ�����ͨ�������ֻ���ʱ�����ע�᣻
	//�����Ƿ����ѡ��ȫ���֣�ȫӢ�ģ�����Ӣ�Ķ��У�������ţ������ţ��ո�
	//���볬��12λ�Ƿ����
	//��9��
	@Test(dataProvider="RegisterTestData",priority=1)
	public void test1(String name,String code,String password) {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.clickRegister();
		registerPage.RegisterSuccess(name,code,password);
		Assert.assertTrue(this.driver.getPageSource().contains("�����"));
	}
	
	//���Ե绰�������Ƿ����ע��
	@Test(priority=2)
	public void test2() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.clickRegister();
		registerPage.RegisterSuccess("89681150","1234","123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("������������������ֻ���"));
	}
	
	//����10086�Ƿ����ע��
	@Test(priority=3)
	public void test3() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.RegisterSuccess("10086","1234","123456789");
		Assert.assertTrue(this.driver.getPageSource().contains("������������������ֻ���"));
	}
	
	//ע��ʱ����������
	@Test(priority=4)
	public void test4() {
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.RegisterEye();
		registerPage.RegisterSuccess("15567809999","1234","123456789");
	}
}
