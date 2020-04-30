package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	//登录手机号
	public AndroidElement edit_userphone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_phone");
	}

	//登录密码
	public AndroidElement edit_password() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_pwd");
	}

	//登录按钮
	public AndroidElement btn_submit() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/bt_login_lg");
	}
	//眼睛
	public AndroidElement btn_eye() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_login_eye");
	}

	//忘记密码
	public AndroidElement btn_forget() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/tv_login_forget");
	}
	
	//忘记密码的手机号
	public AndroidElement et_forget_phone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_phone");
	}
	
	//忘记密码的验证码
	public AndroidElement et_forget_code() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_code");
	}
	
	//修改后的密码
	public AndroidElement et_forget_pwd() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_pwd");
	}
	
	//修改密码按钮
	public AndroidElement btn_forget_changecode() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/btn_forget_changecode");
	}
	
	//忘记密码里面的眼睛
	public AndroidElement iv_forget_eye() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_forget_eye");
	}
	
	//主页的搜索 
	public AndroidElement et_main_search() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_main_search");
	}
	
	//搜索
	public AndroidElement iv_main_serch() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_main_serch");
	}
	
	//输入账号密码登录
	public HomePage loginSuccess(String name, String password) {

		action.type(edit_userphone(), name);
		action.type(edit_password(), password);
		action.click(btn_submit());

		return new HomePage(driver);
	}

	public String  loginFail(String name, String password) {

		action.type(edit_userphone(), name);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return action.getToast();
	}
	
	//点击眼睛
	public void loginEye() {
		action.click(btn_eye());
	} 
	
	//点击忘记密码
	public void forgetpsw() {
		action.click(btn_forget());
	}
	
	//修改密码
	public void Changepsw(String name,String code,String password) {
			
		action.click(et_forget_phone() );
		action.type(et_forget_phone() , name);
		action.click(et_forget_code());
		action.type(et_forget_code(), code);
		action.click(et_forget_pwd());
		action.type(et_forget_pwd(), password);
		action.click(btn_forget_changecode());		
	}
	
	//点击修改密码的眼睛
	public void forgetEye() {
		action.click(iv_forget_eye());
	}
	
	//搜索新闻
	public void Seatch(String content) {
		action.type(et_main_search(),content );
		action.click(iv_main_serch());
		
	}
	
}
