package edu.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TreatyBallPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public TreatyBallPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	//点击约球按钮
	private AndroidElement treatyball(){
		return driver.findElementById("img_main_time");
	}
	
	//分类查找——全部
	private AndroidElement all(){
		return driver.findElementById("tv_main_topall");
	}
	
	//分类查找——足球
	private AndroidElement football(){
		return driver.findElementById("tv_main_football");
	}
	
	//分类查找——篮球
	private AndroidElement basketball(){
		return driver.findElementById("tv_main_basketball");
	}
	
	//分类查找——排球
	private AndroidElement volleyball(){
		return driver.findElementById("tv_main_volleyball");
	}
	
	//分类查找——羽毛球
	private AndroidElement badminton(){
		return driver.findElementById("tv_main_badminton");
	}
	
	//分类查找——乒乓球
	private AndroidElement tabletennis(){
		return driver.findElementById("tv_main_tabletennis");
	}
	
	//约球列表第一个
	private  MobileElement list_item() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/tab_content"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(0);
	}
	
	//申请加入
	private AndroidElement btn_join(){
		return driver.findElementByXPath("//*[@text='虚位以待']");
	}
	
	
	//申请加入
	private AndroidElement btn_join_ok(){
		return driver.findElementById("android:id/button1");
	}
	
	//加入后的提示
	public AndroidElement toast(){
		return driver.findElementByXPath("/hierarchy/android.widget.Toast");
		
	}
	
	//我的界面
	private AndroidElement my(){
		return driver.findElementById("iv_main_portrait");
	}
	
	//我的界面-约球
	private AndroidElement my_yueqiu(){
		return driver.findElementById("ll_personalcenter_yueqiu");
	}
	
	
	//约球列表
	private  MobileElement yueqiu_list1() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_treatyball_match"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(0);
	}
	
	//约球列表
	private  MobileElement yueqiu_list2() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_treatyball_match"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(10);
	}
	
	
	
	//按照球类查询约球信息
	public void search(){
		action.click(treatyball());
		action.click(football());
		action.click(basketball());
		action.click(volleyball());
		action.click(badminton());
		action.click(tabletennis());
		action.click(all());
	}
	
	//点击约球列表第一个
	public void list_first(){
		action.click(treatyball());
		action.click(list_item());
	}
	
	
	//点击约球列表第一个并申请加入
	public void join(){
		action.click(treatyball());
		action.click(list_item());
		action.click(btn_join());
		action.click(btn_join_ok());
	}
	
	//点击我的界面进入约球
	public void yueqiu(){
		action.click(my());
		action.click(my_yueqiu());
	}
	
	//点击自己创建的队伍并申请加入
	public void join_my(){
		action.click(treatyball());
		action.click(tabletennis());
		action.click(list_item());
		action.click(btn_join());
	}
	
	
	//返回
	public void goBack() throws InterruptedException, IOException{
		String cmdstr="adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmdstr).waitFor();
		Thread.sleep(5000);
	}
	
}
