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
	//1) ��Ӽ�¼
	@Test(priority=0)
	public void testAddItem(){	
		pages.addItem("��1����¼");
		Assert.assertTrue(this.driver.getPageSource().contains("��1����¼"));
	}
	//2) ɾ�����м�¼
	@Test(priority=3)
	public void testDeleteItem() {
		pages.deleteItem();
		int count=pages.list_count();
		Assert.assertTrue(count==0);
	}
	//3) ���ơ�ճ��һ����¼
	@Test(priority=1)
	public void testCopyAndPasteItem() {
		pages.copyAndPasteItem();
		int count=pages.list_count();
		Assert.assertTrue(count>=2);
	}
	//4) �޸�һ����¼
	@Test(priority=2)
	public void testeditItem() {
		NotePage pages=new NotePage(driver);
		pages.editItem("�޸ĺ�ı���","�޸ĺ������");
		Assert.assertTrue(this.driver.getPageSource().contains("�޸ĺ�ı���"));

	}
}
