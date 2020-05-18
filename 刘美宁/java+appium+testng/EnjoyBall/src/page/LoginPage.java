package page;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	public AndroidElement edit_phone() {
		//com.example.lenovo.enjoyball:id/et_login_phone
		return this.driver.findElementById("et_login_phone");
	
	}

	public AndroidElement edit_password() {
		//com.example.lenovo.enjoyball:id/et_login_pwd
		return this.driver.findElementById("et_login_pwd");
//		return this.driver.findElementByXPath("//*[@text='请输入手机号']");
	}

	public AndroidElement btn_login() {
		//com.example.lenovo.enjoyball:id/bt_login_lg
		return this.driver.findElementById("bt_login_lg");
	
	}

	public HomePageDemo loginSuccess(String phone, String password) {
		action.type(edit_phone(), phone);
		action.type(edit_password(), password);
		action.click(btn_login());
		return new HomePageDemo(driver);
	}

}
