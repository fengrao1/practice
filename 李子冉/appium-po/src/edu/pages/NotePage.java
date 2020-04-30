package edu.pages;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NotePage {
	public AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public NotePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;		
		this.action = new BaseAction(driver);
	}
	public AndroidElement add_item() {
		return driver.findElementByXPath("//*[@content-desc='New note']");		
	}

	public AndroidElement edit_itemDetail() {
		return driver.findElementById("note");
	}
	
	public AndroidElement btn_save() {
		return driver.findElementByXPath("//*[@content-desc='Save']");		
	}
	public AndroidElement btn_delete() {
		return driver.findElementByXPath("//*[@text='Delete']");
	}
	public AndroidElement btn_Open() {
		return driver.findElementByXPath("//*[@text='Open']");
	}
	public AndroidElement btn_OK() {
		return driver.findElementByXPath("//*[@text='OK']");
	}
	public AndroidElement btn_Copy() {
		return driver.findElementByXPath("//*[@text='Copy']");
	}
	public AndroidElement btn_More() {
		return driver.findElementByXPath("//*[@content-desc='更多选项']");		
	}
	public AndroidElement btn_Paste() {
		return driver.findElementByXPath("//*[@text='Paste']");		
	}
	public AndroidElement btn_EditTitle() {
		return driver.findElementByXPath("//*[@text='Edit title']");		
	}
	public AndroidElement WriteTitle() {
		return driver.findElement(By.id("com.example.android.notepad:id/title"));		
	}
	
	public  MobileElement list_item() {		
		AndroidElement list = driver.findElement(By.id("android:id/list"));
		List<MobileElement> items = list.findElements(By.className("android.widget.TextView"));
		return items.get(0);
	}
	public int list_count(){
		AndroidElement list = driver.findElement(By.id("android:id/list"));
		List<MobileElement> items = list.findElements(By.className("android.widget.TextView"));
		int count = items.size();
		return count;
		
	}
	
//	1) 添加记录
	public void addItem(String content) {
		action.click(add_item());
		action.type(edit_itemDetail(), content);
		action.click(btn_save());
	}

// 2) 删除所有记录
	public void deleteItem() {
		int sum = list_count();
		for (int i = 0; i < sum; i++) {
			action.longPress(list_item());
			action.click(btn_delete());
		}
	}
//	3) 复制、粘贴一条记录
	public void copyAndPasteItem(){
		action.longPress(list_item());
		action.click(btn_Copy());
		action.click(btn_More());
		action.click(btn_Paste());
		action.click(btn_save());
	}
//	4) 修改一条记录,修改标题
	public void editItem(String title,String content){
//		修改标题
		action.longPress(list_item());
		action.click(btn_EditTitle());
		action.clear(WriteTitle());
		action.type(WriteTitle(), title);
		action.click(btn_OK());
//		修改正文
		action.longPress(list_item());
		action.click(btn_Open());
		action.clear(edit_itemDetail());
		action.type(edit_itemDetail(), content);
		action.click(btn_save());
	}
	
}
