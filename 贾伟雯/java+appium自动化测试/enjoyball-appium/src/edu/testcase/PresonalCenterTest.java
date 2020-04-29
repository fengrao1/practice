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
	
	//1.�޸��û���
	@Test
	public void change_name() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_name("hello");
	}
	
	//2.�޸��Ա�
	@Test
	public void change_sex() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_sex();
	}
	
	//3.�޸�����
	@Test
	public void change_age() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_age();
	}
	
	//4.�޸ĳ���
	@Test
	public void change_city() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_city();
	}
	
	//5.�޸��ֻ���
	@Test
	public void change_phone() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_phone();
	}
	
	//6.�޸�����
	@Test
	public void change_Email() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_Email("18731179963@163.com");
	}
	
	//7.�޸ĸ���ǩ��
	@Test
	public void change_note() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.change_note("���");
	}
	
	//8.��ͨ��Ա
	@Test
	public void hui_yuan() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.hui_yuan();
	}
	
	//9.Լ��
	@Test
	public void play_ball() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.play_ball();
	}
	
	//10.�ղ�
	@Test
	public void shoucnag() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.shoucang();
	}
	
	//11.��Ա
	@Test
	public void vip() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.vip();
	}
	
	//12.�ύ����
	@Test
	public void pull_fankui() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.pull_fankui("hey");
	}
	
	//13.ע��
	@Test
	public void zhuxiao() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.zhuxiao();
	}
	
	//14.�鿴��Ϣ
	@Test
	public void CKxinxi() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.CKxinxi();
	}
	
	//15.�鿴����1
	@Test
	public void comment1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.comment1();
	}
	
	//16.�鿴��ע1
	@Test
	public void follow1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.follow1();
	}
	
	//17.�鿴��˿1
	@Test
	public void fan1() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.fan1();
	}
	
	//18.�鿴����
	@Test
	public void score() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.score();
	}
	
	//19.�鿴����2
	@Test
	public void comment2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.comment2();
	}
	
	//20.�鿴��ע2
	@Test
	public void follow2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.follow2();
	}
	
	//21.�鿴��˿2
	@Test
	public void fan2() throws InterruptedException {
		PersonalCenterPage personalCenterPage=new PersonalCenterPage(driver);
		personalCenterPage.fan2();
	}
	
}
