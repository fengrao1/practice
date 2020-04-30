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

public class NewsPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public NewsPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
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

	private AndroidElement btn_concern() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/btn_news_attention");
	}

	private AndroidElement btn_comment() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/ed_news_commentContent");
	}

	private AndroidElement btn_publish_comment() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/iv_news_releaseComment");
	}

	private AndroidElement btn_collect_news() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/iv_news_collect");
	}

	private AndroidElement btn_remindWho_news() {
		return driver.findElementById("com.example.lenovo.enjoyball:id/iv_news_remindWho");
	}

	public int list_count() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_search_news"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		int count = items.size();
		return count;
	}

	private MobileElement list_item() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_home_news"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(1);
	}

	// 进入搜索框
	public void enterSearch() {
		action.click(btn_content());
	}

	// 根据ID或者关键字搜索新闻
	public void searchItem(String content) {
		action.clear(edit_content());
		action.type(edit_content(), content);
		action.click(btn_search());
	}

	// 退出搜索框
	public void exitSearch() {
		action.click(btn_people());
	}

	// 进入新闻详细界面
	public void enterNews() {
		action.click(list_item());
	}

	// 新闻界面的操作：关注
	public void concernNews() {
		action.click(btn_concern());
	}

	// 新闻界面的操作：发表评论
	public void publishComment(String content) {
		action.click(btn_comment());
		action.type(btn_comment(), content);
		action.click(btn_publish_comment());
	}

	// 新闻界面的操作：收藏
	public void collectNews() {
		action.click(btn_collect_news());
	}

	// 新闻界面的操作：@某一个用户
	public void remindWhoNews() {
		action.click(btn_remindWho_news());
	}

	public String getToast() {
		return action.getToast();
	}

}
