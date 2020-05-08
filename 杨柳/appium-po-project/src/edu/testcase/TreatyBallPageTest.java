package edu.testcase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.TreatyBallPage;
import edu.pages.LoginPage;

public class TreatyBallPageTest  extends BaseTest{
	TreatyBallPage treatyBallPage;
	
	@BeforeClass
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		treatyBallPage=loginPage.login1("17370226893", "123456");
	}
	
	@Test(description="���������ѯԼ����Ϣ",priority=1)
	public void search(){
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.search();
	}
	
	
	@Test(description="�����һ��Լ����Ϣ",priority=2)
	public void list_first() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.list_first();
		treatyBallPage.goBack();
	}
	
	@Test(description="�����һ��Լ����Ϣ �������",priority=3)
	public void join1() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join();
		Assert.assertEquals("����ɹ�", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="�ٴε����һ��Լ����Ϣ �������",priority=4)
	public void join2() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join();
		Assert.assertEquals("�벻Ҫ�ظ��ύ����", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="����Լ�������Լ����Ϣ �������",priority=5)
	public void join3() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join_my();
		Assert.assertEquals("���ܼ����Լ��Ķ���", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="Լ����Ϣ",priority=6)
	public void my_yueqiu(){
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.yueqiu();
	}
	


}
