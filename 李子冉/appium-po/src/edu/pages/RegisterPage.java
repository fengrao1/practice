package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegisterPage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public RegisterPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	//手机快速注册
	public AndroidElement tv_login_register() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/tv_login_register");
	}
	
	//注册手机号
	public AndroidElement et_register_phone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_register_phone");
	}
	
	//注册验证码
	public AndroidElement et_register_code() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_register_code");
	}
	
	//注册密码
	public AndroidElement et_register_pwd() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_register_pwd");
	}
	
	//注册按钮
	public AndroidElement btn_register_register() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/btn_register_register");
	}
	
	//注册页面的眼睛
	public AndroidElement iv_register_eye() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_register_eye");
	}

	//点击手机快速注册
	public void clickRegister(){	
		action.click(tv_login_register());
	}
	
	//注册用户
	public void RegisterSuccess(String name,String code,String password) {
		
		action.click(et_register_phone());
		//action.clear(et_register_phone());
		action.type(et_register_phone(), name);
		action.click(et_register_code());
		action.type(et_register_code(), code);
		action.click(et_register_pwd());
		action.type(et_register_pwd(), password);
		action.click(btn_register_register());
	}
	
	//注册时不隐藏注册密码
	public void RegisterEye(){	
		action.click(iv_register_eye());
	}

}
