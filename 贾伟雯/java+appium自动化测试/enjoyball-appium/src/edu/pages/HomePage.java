package edu.pages;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement add_item() {
		return driver.findElementByXPath("//*[@content-desc='新建待办事项']");
	}

	

	private AndroidElement edit_itemDetail() {
		return driver.findElementById("toDoItemDetailET");
	}


	private AndroidElement btn_save() {
		return driver.findElementByXPath("//*[@text='保存']");
	}
	private AndroidElement btn_delete() {
		return driver.findElementByXPath("//*[@text='删除']");
	}
	
	private AndroidElement btn_OK() {
		return driver.findElementByXPath("//*[@text='确认']");
	}
	private  MobileElement list_item() {
				
		AndroidElement list = driver.findElement(By.id("com.example.todolist:id/todoListView"));
		List<MobileElement> items = list.findElements(By.className("android.widget.RelativeLayout"));
//		int count = items.size();
		return items.get(0);
	}
	
	
	public void addItem(String content) {
		action.click(add_item());
		action.type(edit_itemDetail(), content);
		action.click(btn_save());
		
	}
	
	

	public void deleteItem() {

		
		action.longPress(list_item());
		action.click(btn_delete());
		action.click(btn_OK());
		
		
	}
}
