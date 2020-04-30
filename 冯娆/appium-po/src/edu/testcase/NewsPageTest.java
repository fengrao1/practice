package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.dataprovider.ExcelDataProvider;
import edu.pages.NewsPage;
import edu.pages.LoginPage;

public class NewsPageTest extends BaseTest {
	NewsPage pages;

	@DataProvider(name = "s1")
	public Object[][] words0() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("data/TestData1.xlsx", "Sheet1");
	}

	@DataProvider(name = "s2")
	public Object[][] words2() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("data/TestData1.xlsx", "Sheet2");
	}

	@DataProvider(name = "s3")
	public Object[][] words3() throws Exception {
		ExcelDataProvider d = new ExcelDataProvider();
		return d.getTestDataByExcel("data/TestData1.xlsx", "Sheet3");
	}

	@BeforeClass
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		pages = loginPage.loginSuccess("15231123391", "111111");
	}

	// 进入搜索框
	@Test(priority = 1)
	public void testEnterSearch() {
		pages.enterSearch();
		Assert.assertEquals(this.driver.getPageSource().contains("全部"), false);
	}

	// 根据ID或者关键字搜索新闻（存在符合搜索内容的新闻，3条）
	@Test(dataProvider = "s1", priority = 2)
	public void testSearchByIDOrWords1(String content) {
		pages.searchItem(content);
		Assert.assertTrue(pages.list_count() != 0);
	}

	// 根据ID或者关键字搜索新闻（不存在符合搜索内容的新闻，6条）
	@Test(dataProvider = "s2", priority = 3)
	public void testSearchByIDOrWords2(String content) {
		pages.searchItem(content);
		Assert.assertTrue(pages.list_count() == 0);
	}

	// 退出搜索框,返回首页
	@Test(priority = 4)
	public void testExitSearch() {
		pages.exitSearch();
		Assert.assertTrue(this.driver.getPageSource().contains("全部"));
	}

	// 进入新闻详细界面
	@Test(priority = 5)
	public void testEnterNews() {
		pages.enterNews();
		Assert.assertTrue(this.driver.getPageSource().contains("关注"));
	}

	// 新闻界面的操作：关注
	@Test(priority = 6)
	public void testConcernNews() {
		pages.concernNews();
		Assert.assertTrue(pages.getToast().contains("你已经关注了"));
	}

	// 新闻界面的操作：发表评论(5条，输入#%等符号系统会崩溃)
	@Test(dataProvider = "s3", priority = 7)
	public void testPublishComment(String content) {
		pages.publishComment(content);
	}

	// 新闻界面的操作：发表评论（不填写内容）
	@Test(priority = 8)
	public void testPublishComment1() {
		pages.publishComment("");
		Assert.assertTrue(pages.getToast().contains("啥也没写"));
	}

	// 新闻界面的操作：点击收藏
	@Test(priority = 9)
	public void testCollectNews() {
		pages.collectNews();
		Assert.assertTrue(pages.getToast().contains("已收藏"));
	}

	// 新闻界面的操作：@某一个用户
	@Test(priority = 10)
	public void testRemindWhoNews() {
		pages.remindWhoNews();
		Assert.assertTrue(this.driver.getPageSource().contains("@"));
	}

}
