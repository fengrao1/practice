package edu.pages;

import java.util.List;

import javax.lang.model.element.Element;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ByIdOrName;

import com.google.common.io.Resources;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EditPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public EditPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	// 新建note
	private AndroidElement newNote() {
		return driver.findElementById("com.example.android.notepad:id/menu_add");
	}

	// note文本框
	private AndroidElement note() {
		return driver.findElementById("com.example.android.notepad:id/note");
	}

	// 保存note
	private AndroidElement save() {
		return driver.findElementById("com.example.android.notepad:id/menu_save");
	}

	// listView个数
	private int listNum() {
		List<AndroidElement> elements = driver.findElementsById("android:id/text1");
		return elements.size();
	}

	// 第一条note
	private AndroidElement text() {
		return driver.findElementById("android:id/text1");
	}

	// 长按后的删除键
	private AndroidElement textDelete() {
		return driver.findElementByXPath("//*[@text='Delete']");
	}

	// 长按后的复制键
	private AndroidElement textCopy() {
		return driver.findElementByXPath("//*[@text='Copy']");
	}

	// 长按后的编辑键
	private AndroidElement textEdit() {
		return driver.findElementByXPath("//*[@text='Edit title']");
	}

	// 更多选项
	private AndroidElement textMore() {
		return driver.findElementByAccessibilityId("更多选项");

	}

	// 粘贴
	private AndroidElement textPaste() {
		return driver.findElementByXPath("//*[@text='Paste']");
	}

	// 编辑文本框
	private AndroidElement editNew() {
		return driver.findElementById("com.example.android.notepad:id/title");
	}

	// 编辑确认键
	private AndroidElement editOk() {
		return driver.findElementByXPath("//*[@text='OK']");
	}

	public void add(String StringNote) throws InterruptedException {
		action.click(newNote());
		action.sleep(2000);
		action.type2(note(), StringNote);
		action.sleep(2000);
		action.click(save());
		action.sleep(3000);
	}

	public void deleteAllText() throws InterruptedException {
		int num = listNum();
		System.out.println(num);
		for (int i = 0; i < num; i++) {
			action.longPress(text());
			action.click(textDelete());
			action.sleep(3000);
		}
	}

	public void copyAndPaste() throws InterruptedException {
		action.longPress(text());
		action.sleep(2000);
		action.click(textCopy());
		action.sleep(2000);
		action.click(textMore());
		action.sleep(2000);
		action.click(textPaste());
		action.sleep(2000);
		action.click(save());

	}

	public void editText(String newWords) throws InterruptedException {
		action.longPress(text());
		action.sleep(2000);
		action.click(textEdit());
		action.sleep(2000);
		action.type2(editNew(), newWords);
		action.sleep(2000);
		action.click(editOk());

	}
}
