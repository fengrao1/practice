package edu.pages;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class teamPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public teamPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	public AndroidElement person() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_main_portrait");
	}
	public AndroidElement team() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement create() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/btn_team_create");
	}
	//�ӻ�
	public AndroidElement logo() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_team_create_logo");
	}
	//�˶���Ŀ
	public AndroidElement sp_team() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/sp_team_create_fixture");
	}
	//ѡ����Ŀ
	public AndroidElement teamball() {
		List<String> t_name =new ArrayList<>();
		t_name.add("'����'");
		t_name.add("'����'");
		t_name.add("'����'");
		t_name.add("'��ë��'");
		t_name.add("'ƹ����'");
		int index =BaseAction.getRandNumber(4, 0);
		return this.driver.findElementByXPath("//*[@text="+t_name.get(index)+"]");
//		return this.driver.findElementByXPath("//*[@text='����']");
	}
	//����
	public AndroidElement team_name() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_team_create_name");
	}
	public AndroidElement team_slogan() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/et_team_create_slogan");
	}
	//ȷ������
	public AndroidElement save_team() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/btn_team_create_save");
	}
	
	
	public void team_page() throws InterruptedException {
		action.click(person());
		action.sleep(2000);
		action.click(team());
	}
	public String create_team(String x,String y,String tname,String tsl) throws InterruptedException {
		action.click(create());
		action.sleep(2000);
		String result;
		if (x.isEmpty()) {
			action.click(sp_team());
			action.click(teamball());
			action.type2(team_name(), tname);
			action.sleep(2000);
			action.type2(team_slogan(), tsl);
			action.click(save_team());
			result= action.getToast();
			action.back();
			action.back();
			action.back();
		}
		else {
			action.click(logo());
			action.sleep(2000);
			action.oneTouch(418, 409);//���
			action.sleep(2000);
			action.oneTouch(Integer.parseInt(x), Integer.parseInt(y));
			action.sleep(2000);
			action.oneTouch(963, 165);//ȷ��ѡ��
			action.sleep(2000);
			action.click(sp_team());
			action.click(teamball());
			action.type2(team_name(), tname);
			action.sleep(2000);
			action.type2(team_slogan(), tsl);
			action.click(save_team());
			result= action.getToast();
		}
		return result;
	}
}
