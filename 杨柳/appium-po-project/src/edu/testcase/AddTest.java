package edu.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.AddPage;
import edu.pages.LoginPage;
import edu.pages.TreatyBallPage;

public class AddTest extends BaseTest{
	
	AddPage addPage;
	@BeforeClass
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		addPage=loginPage.login2("17370226893", "123456");
	}
	
	//添加约球信息-当前时间
	@Test(description="添加约球信息-当前时间",priority=1)
	public void add1() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间之前
	@Test(description="添加约球信息-当前时间之前",priority=2)
	public void add2() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_before();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间之后
	@Test(description="添加约球信息-当前时间之后",priority=3)
	public void add3() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_after();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
		
	//添加约球信息-当前时间 排球
	@Test(description="添加约球信息-当前时间 排球",priority=4)
	public void add4() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-红馆
	@Test(description="添加约球信息-当前时间-红馆",priority=5)
	public void add5() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.place1();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-白馆
	@Test(description="添加约球信息-当前时间-白馆",priority=6)
	public void add6() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-人数为3
	@Test(description="添加约球信息-当前时间-人数为3",priority=7)
	public void add7() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number3();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-人数为4
	@Test(description="添加约球信息-当前时间-人数为4",priority=8)
	public void add8() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		addPage.goBack();
	}
	
	
	//添加约球信息-当前时间-我想说
	@Test(description="添加约球信息-当前时间-我想说",priority=9)
	public void add9() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.want_say("加油！！");
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-我想说
	@Test(description="添加约球信息-当前时间-我想说",priority=10)
	public void add10() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.want_say("  ");
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	
	//添加约球信息-当前时间-邀请人加入队伍
	@Test(description="添加约球信息-当前时间-邀请人加入队伍",priority=11)
	public void add11() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_data_now();
		addPage.add_time();
		addPage.invite("15833552353");
		Thread.sleep(3000);
		Assert.assertTrue(addPage.result_name()!=0);
		addPage.goBack();
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("你收到了一个新的约球邀请", addPage.toast().getText());
		addPage.goBack();
	}
	
	//添加约球信息-当前时间-邀请人加入队伍
	@Test(description="添加约球信息-当前时间-邀请人加入队伍",priority=12)
	public void add12() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_data_now();
		addPage.add_time();
		addPage.invite2("123456789");
		addPage.goBack();
		addPage.goBack();
		addPage.goBack();
	}
	
	@Test(description="队伍约战",priority=13)
	public void add13() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add2();
		addPage.add_type_football();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("约球队伍创建成功", addPage.toast().getText());
		addPage.goBack();
	}
	
	@Test(description="队伍约战-未组建该类型球队",priority=14)
	public void add14() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add2();
		addPage.add_type_volleyball();
		Assert.assertEquals("您没有创建该类型的球队，无法创建组队约战", addPage.toast().getText());
		addPage.goBack();
	}

}
