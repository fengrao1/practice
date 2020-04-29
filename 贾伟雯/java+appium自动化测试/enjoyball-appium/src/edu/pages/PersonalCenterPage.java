package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PersonalCenterPage{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public PersonalCenterPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	//个人中心
	public AndroidElement image() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_main_portrait");
	}
	
	//我的资料
	public AndroidElement my_data() {
		return this.driver.findElementByXPath("//*[@text='我的资料']");
	}
	
	//用户名
	public AndroidElement my_data_name() {
		return this.driver.findElementByXPath("//*[@text='用户名']");
	}
	
	public AndroidElement new_name() {
		return this.driver.findElementByXPath("//*[@text='输入您的新用户名']");
	}
	
	public AndroidElement change() {
		return this.driver.findElementByXPath("//*[@text='修改']");
	}
	
	//性别
	public AndroidElement sex() {
		return this.driver.findElementByXPath("//*[@text='性别']");
	}
	
	//性别“男”
	public AndroidElement man_sex() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/tv_dialog_perinfo_man");
	}
	
	//年龄
	public AndroidElement age() {
		return this.driver.findElementByXPath("//*[@text='年龄']");
	}
	
	//年龄-保密
	public AndroidElement age_secret() {
		return this.driver.findElementByXPath("//*[@text='保密']");
	}
	
	//城市
	public AndroidElement city() {
		return this.driver.findElementByXPath("//*[@text='城市']");
	}
	
	//手机号
	public AndroidElement phone() {
		return this.driver.findElementByXPath("//*[@text='手机号']");
	}
	
	//邮箱
	public AndroidElement Email() {
		return this.driver.findElementByXPath("//*[@text='邮箱']");
	}
	
	//输入邮箱
	public AndroidElement new_Email() {
		return this.driver.findElementByXPath("//*[@text='输入您的新邮箱']");
	}
	
	//个性签名
	public AndroidElement personnote() {
		return this.driver.findElementByXPath("//*[@text='个性签名']");
	}
	
	//输入个性签名
	public AndroidElement new_note() {
		return this.driver.findElementByXPath("//*[@text='编辑您的个人签名']");
	}
	
	//开通会员
	public AndroidElement huiyuan() {
		return this.driver.findElementByXPath("//*[@text='开通会员']");
	}
	
	//约球
	public AndroidElement ball_play() {
		return this.driver.findElementByXPath("//*[@text='约球']");
	}

	//收藏
	public AndroidElement shou() {
		return this.driver.findElementByXPath("//*[@text='收藏']");
	}
	
	//会员
	public AndroidElement HY() {
		return this.driver.findElementByXPath("//*[@text='会员']");
	}

	//反馈
	public AndroidElement ret() {
		return this.driver.findElementByXPath("//*[@text='反馈']");
	}
	
	//写反馈
	public AndroidElement writeret() {
		return this.driver.findElementByXPath("//*[@text='请详尽描述要反馈的问题，方便帮您更快速的处理']");
	}
	
	//提交
	public AndroidElement pull() {
		return this.driver.findElementByXPath("//*[@text='提交']");
	}
	
	//注销
	public AndroidElement ZX() {
		return this.driver.findElementByXPath("//*[@text='注销']");
	}
	
	//头像
	public AndroidElement touxiang() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait");
	}
	
	//信息
	public AndroidElement XX() {
		return this.driver.findElementByXPath("//*[@text='信息']");
	}
	
	//评论1
	public AndroidElement PL() {
		return this.driver.findElementByXPath("//*[@text='评论']");
	}
	
	//关注1
	public AndroidElement GZ() {
		return this.driver.findElementByXPath("//*[@text='关注']");
	}
	
	//粉丝1
	public AndroidElement FS() {
		return this.driver.findElementByXPath("//*[@text='粉丝']");
	}
	
	//积分
	public AndroidElement JF() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_scores");
	}
	
	//评论2
	public AndroidElement PL2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_comment");
	}
	
	//关注2
	public AndroidElement GZ2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_follow");
	}
	
	//粉丝2
	public AndroidElement FS2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_fans");
	}
	
	//1.修改用户名
	public void change_name(String name) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(my_data_name());
		Thread.sleep(2000);
		action.type(new_name(), name);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//2.修改性别
	public void change_sex() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(sex());
		Thread.sleep(2000);
		action.click(man_sex());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//3.修改年龄
	public void change_age() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(age());
		Thread.sleep(2000);
		action.click(age_secret());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//4.修改城市
	public void change_city() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(city());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//5.修改手机号
	public void change_phone() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(phone());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//6.修改邮箱
	public void change_Email(String Email) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(Email());
		Thread.sleep(2000);
		action.type(new_Email(), Email);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//7.修改个性签名
	public void change_note(String note) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(personnote());
		Thread.sleep(2000);
		action.type(new_note(), note);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//8.开通会员
	public void hui_yuan() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(huiyuan());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//9.约球
	public void play_ball() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ball_play());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//10.收藏
	public void shoucang() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(shou());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	//11.会员
	public void vip() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(HY());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//12.提交反馈
	public void pull_fankui(String fankui) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ret());
		Thread.sleep(2000);
		action.type(writeret(), fankui);
		Thread.sleep(2000);
		action.click(pull());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//13.注销
	public void zhuxiao() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ZX());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//14.查看信息
	public void CKxinxi() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(XX());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//15.查看评论1
	public void comment1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(PL());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//16.查看关注1
	public void follow1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(GZ());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//17.查看粉丝1
	public void fan1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(FS());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//18.查看积分
	public void score() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(JF());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//19.查看评论2
	public void comment2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(PL2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//20.查看关注2
	public void follow2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(GZ2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//21.查看粉丝2
	public void fan2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(FS2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
