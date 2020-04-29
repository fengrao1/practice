package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.HomePage;
import edu.pages.LoginPage;
import edu.pages.PersonalCenterPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PresonalCenterTest extends BaseTest{
	
//	AndroidDriver<AndroidElement> driver;
//	HomePage homePage;
	
	@BeforeClass
	public void loginSucess() throws InterruptedException {
		Thread.sleep(2000);
		LoginPage loginPage=new LoginPage(driver);
		Thread.sleep(2000);
		loginPage.loginSuccess("18330919107", "123456");
		Thread.sleep(2000);
		Assert.assertEquals(this.driver.currentActivity(), "com.example.lenovo.Activity.MainActivity");
	}
	
	//1.修改用户名
	@Test
	public void change_name() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_name("hello");
	}
	
	//2.修改性别
	@Test
	public void change_sex() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_sex();
	}
	
	//3.修改年龄
	@Test
	public void change_age() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_age();
	}
	
	//4.修改城市
	@Test
	public void change_city() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_city();
	}
	
	//5.修改手机号
	@Test
	public void change_phone() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_phone();
	}
	
	//6.修改邮箱
	@Test
	public void change_Email() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_Email("18731179963@163.com");
	}
	
	//7.修改个性签名
	@Test
	public void change_note() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_note("你好");
	}
	
	//8.开通会员
	@Test
	public void hui_yuan() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.hui_yuan();
	}
	
	//9.约球
	@Test
	public void play_ball() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.play_ball();
	}
	
	//10.收藏
	@Test
	public void shoucnag() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.shoucang();
	}
	
	//11.会员
	@Test
	public void vip() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.vip();
	}
	
	//12.提交反馈
	@Test
	public void pull_fankui() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.pull_fankui("hey");
	}
	
	//13.注销
	@Test
	public void zhuxiao() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.zhuxiao();
	}
	
	//14.查看信息
	@Test
	public void CKxinxi() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.CKxinxi();
	}
	
	//15.查看评论1
	@Test
	public void comment1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.comment1();
	}
	
	//16.查看关注1
	@Test
	public void follow1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.follow1();
	}
	
	//17.查看粉丝1
	@Test
	public void fan1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.fan1();
	}
	
	//18.查看积分
	@Test
	public void score() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.score();
	}
	
	//19.查看评论2
	@Test
	public void comment2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.comment2();
	}
	
	//20.查看关注2
	@Test
	public void follow2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.follow2();
	}
	
	//21.查看粉丝2
	@Test
	public void fan2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.fan2();
	}
	
}
