package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.NotePage;

public class NoteTest extends BaseTest{
	NotePage pages;
	@BeforeMethod
	public void beforeMethod() {
		pages=new NotePage(driver);
	}
	//1) 添加记录
	@Test(priority=0)
	public void testAddItem(){	
		pages.addItem("第1个记录");
		Assert.assertTrue(this.driver.getPageSource().contains("第1个记录"));
	}
	//2) 删除所有记录
	@Test(priority=3)
	public void testDeleteItem() {
		pages.deleteItem();
		int count=pages.list_count();
		Assert.assertTrue(count==0);
	}
	//3) 复制、粘贴一条记录
	@Test(priority=1)
	public void testCopyAndPasteItem() {
		pages.copyAndPasteItem();
		int count=pages.list_count();
		Assert.assertTrue(count>=2);
	}
	//4) 修改一条记录
	@Test(priority=2)
	public void testeditItem() {
		NotePage pages=new NotePage(driver);
		pages.editItem("修改后的标题","修改后的内容");
		Assert.assertTrue(this.driver.getPageSource().contains("修改后的标题"));

	}
}
