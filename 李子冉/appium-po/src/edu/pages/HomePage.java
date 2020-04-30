package edu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class HomePage{
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}

	private AndroidElement btn_content() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/et_main_search");
	}
	private AndroidElement edit_content() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/et_search_search");
	}
	private AndroidElement btn_search() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/iv_search_search");
	}
	private AndroidElement btn_people() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/iv_search_back");
	}
	
	public int list_count(){
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_search_news"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		int count = items.size();
		return count;
	}
	
	public void enterSearch(){
		action.click(btn_content());
	}
	public void searchItem(String content) {
		action.clear(edit_content());
		action.type(edit_content(), content);
		action.click(btn_search());
	}
	public void exitSearch(){
		action.click(btn_people());
	}

//	private  MobileElement list_item() {
//				
//		AndroidElement list = driver.findElement(By.id("com.example.todolist:id/todoListView"));
//		List<MobileElement> items = list.findElements(By.className("android.widget.RelativeLayout"));
////		int count = items.size();
//		return items.get(0);
//	}
	
}
