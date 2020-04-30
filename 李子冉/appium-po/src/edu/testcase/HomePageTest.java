package edu.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.dataprovider.ExcelDataProvider;
import edu.pages.HomePage;
import edu.pages.LoginPage;

public class HomePageTest  extends BaseTest{
	HomePage homePage;
	@DataProvider(name="TestData1")
	public Object[][] words0() throws Exception{
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("data/TestData1.xlsx","Sheet1");
	}
	@DataProvider(name="TestData2")
	public Object[][] words2() throws Exception{
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("data/TestData1.xlsx","Sheet2");
	}
	
	@BeforeClass
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		homePage =loginPage.loginSuccess("15227989218", "123456789");
		homePage.enterSearch();
	}
//	@Test(priority=1)
//	public void testEnterSearch(){
//		homePage.enterSearch();
//	}
	//����ID���߹ؼ����������ţ����ڷ����������ݵ����ţ�3����
	@Test(dataProvider="TestData1",priority=2)
	public void testSearchByIDOrWords1(String content) {
		homePage.searchItem(content);	
		Assert.assertTrue(homePage.list_count()!=0);
	}
//	//����ID���߹ؼ����������ţ������ڷ����������ݵ����ţ�6����
//	@Test(dataProvider="TestData2",priority=3)
//	public void testSearchByIDOrWords2(String content) {
//		homePage.searchItem(content);	
//		Assert.assertTrue(homePage.list_count()==0);
//	}
//	@Test(priority=4)
//	public void testExitSearch(){
//		homePage.exitSearch();
//	}
	
//	@Test(priority=5)
//	public void testNews(){
//		
//		homePage.exitSearch();
//	}

}
