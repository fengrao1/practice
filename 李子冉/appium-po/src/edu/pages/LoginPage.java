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

	//��¼�ֻ���
	public AndroidElement edit_userphone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_phone");
	}

	//��¼����
	public AndroidElement edit_password() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_pwd");
	}

	//��¼��ť
	public AndroidElement btn_submit() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/bt_login_lg");
	}
	//�۾�
	public AndroidElement btn_eye() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_login_eye");
	}

	//��������
	public AndroidElement btn_forget() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/tv_login_forget");
	}
	
	//����������ֻ���
	public AndroidElement et_forget_phone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_phone");
	}
	
	//�����������֤��
	public AndroidElement et_forget_code() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_code");
	}
	
	//�޸ĺ������
	public AndroidElement et_forget_pwd() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_forget_pwd");
	}
	
	//�޸����밴ť
	public AndroidElement btn_forget_changecode() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/btn_forget_changecode");
	}
	
	//��������������۾�
	public AndroidElement iv_forget_eye() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_forget_eye");
	}
	
	//��ҳ������ 
	public AndroidElement et_main_search() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_main_search");
	}
	
	//����
	public AndroidElement iv_main_serch() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_main_serch");
	}
	
	//�����˺������¼
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
	
	//����۾�
	public void loginEye() {
		action.click(btn_eye());
	} 
	
	//�����������
	public void forgetpsw() {
		action.click(btn_forget());
	}
	
	//�޸�����
	public void Changepsw(String name,String code,String password) {
			
		action.click(et_forget_phone() );
		action.type(et_forget_phone() , name);
		action.click(et_forget_code());
		action.type(et_forget_code(), code);
		action.click(et_forget_pwd());
		action.type(et_forget_pwd(), password);
		action.click(btn_forget_changecode());		
	}
	
	//����޸�������۾�
	public void forgetEye() {
		action.click(iv_forget_eye());
	}
	
	//��������
	public void Seatch(String content) {
		action.type(et_main_search(),content );
		action.click(iv_main_serch());
		
	}
	
}
