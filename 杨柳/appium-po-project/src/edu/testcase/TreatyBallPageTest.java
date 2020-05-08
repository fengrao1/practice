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
	
	@Test(description="按照球类查询约球信息",priority=1)
	public void search(){
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.search();
	}
	
	
	@Test(description="点击第一个约球信息",priority=2)
	public void list_first() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.list_first();
		treatyBallPage.goBack();
	}
	
	@Test(description="点击第一个约球信息 申请加入",priority=3)
	public void join1() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join();
		Assert.assertEquals("申请成功", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="再次点击第一个约球信息 申请加入",priority=4)
	public void join2() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join();
		Assert.assertEquals("请不要重复提交申请", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="点击自己创建的约球信息 申请加入",priority=5)
	public void join3() throws InterruptedException, IOException{
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.join_my();
		Assert.assertEquals("不能加入自己的队伍", treatyBallPage.toast().getText());
		treatyBallPage.goBack();
	}
	
	@Test(description="约球信息",priority=6)
	public void my_yueqiu(){
		TreatyBallPage treatyBallPage=new TreatyBallPage(driver);
		treatyBallPage.yueqiu();
	}
	


}
