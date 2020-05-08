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

	public AndroidElement edit_phone() {
		return this.driver.findElementById("et_login_phone");
	}

	public AndroidElement edit_password() {
		return this.driver.findElementById("et_login_pwd");
	}

	public AndroidElement btn_submit() {
		return this.driver.findElementById("bt_login_lg");
	}

	public TreatyBallPage login1(String phone, String password) {
		action.type(edit_phone(), phone);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return new TreatyBallPage(driver);
	}
	
	public AddPage login2(String phone, String password) {
		action.type(edit_phone(), phone);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return new AddPage(driver);
	}
	
}
