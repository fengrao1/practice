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

	public AndroidElement edit_userphone() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_phone");
	}

	public AndroidElement edit_password() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_login_pwd");
	}

	public AndroidElement btn_submit() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/bt_login_lg");
	}

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
}
