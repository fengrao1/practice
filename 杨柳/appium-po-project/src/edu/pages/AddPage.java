package edu.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public AddPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	//点击约球按钮
	private AndroidElement treatyball(){
		return driver.findElementById("img_main_time");
	}
	
	//点击添加按钮
	private AndroidElement add_treatyball(){
		return driver.findElementById("fab_demand_add");
	}
	
	
	//添加信息-类别
	private AndroidElement type(){
		return driver.findElementById("sp_createagreement_type");
	}
	
	//球类别为足球
	private AndroidElement ball_type_football(){
		return driver.findElementByXPath("//*[@text='足球']");
	}
	
	//球类别为排球
	private AndroidElement ball_type_volleyball(){
		return driver.findElementByXPath("//*[@text='排球']");
	}
	
	//日期
	private AndroidElement ball_data(){
		return driver.findElementById("tv_getData");
	}
	
	//月 上面
	private MobileElement month_up(){
		AndroidElement list = driver.findElement(By.id("android:id/pickers"));
		List<MobileElement> items = list.findElements(By.className("android.widget.NumberPicker"));
		return items.get(1).findElement(By.className("android.widget.Button"));
	}
	
	//月 下面
	private AndroidElement month_four(){
		return driver.findElementByXPath("//*[@text='4']");
	}
	
	private AndroidElement month_five(){
		return driver.findElementByXPath("//*[@text='5']");
	}
	
	private AndroidElement month_six(){
		return driver.findElementByXPath("//*[@text='6']");
	}
	
	private AndroidElement btn_OK(){
		return driver.findElementById("btn_bottomsheetdialog_OK");
	}
	
	//时间
	private AndroidElement ball_time(){
		return driver.findElementById("tv_getTime");
	}
	
	private MobileElement hour(){
		AndroidElement list = driver.findElement(By.id("android:id/timePickerLayout"));
		List<MobileElement> items = list.findElements(By.className("android.widget.NumberPicker"));
		return items.get(1).findElement(By.className("android.widget.Button"));
	}
	
	//确定添加约球
	private AndroidElement btn_create(){
		return driver.findElementById("btn_createagreement_OK");
	}
	
	
	private AndroidElement btn_create_ok(){
		return driver.findElementById("android:id/button1");
	}
	
	
	//地点
	private AndroidElement place(){
		return driver.findElementById("sp_createagreement_address");
	}
	
	//地点-红馆
	private AndroidElement place_red(){
		return driver.findElementByXPath("//*[@text='红馆']");
	}
	
	//地点-白馆
	private AndroidElement place_white(){
		return driver.findElementByXPath("//*[@text='白馆']");
	}
	
	//每队人数
	private AndroidElement number(){
		return driver.findElementById("sp_createagreement_num");
	}
	
	//每队人数-3
	private AndroidElement number_three(){
		return driver.findElementByXPath("//*[@text='3']");
	}
	
	//每队人数-4
	private AndroidElement number_four(){
		return driver.findElementByXPath("//*[@text='4']");
	}
	
	//我想说
	private AndroidElement say(){
		return driver.findElementById("et_createagreement_say");
	}
	
	//邀请
	private AndroidElement btn_invite(){
		return driver.findElementById("btn_createagreement_invite");
	}
	
	//搜索框
	private AndroidElement search(){
		return driver.findElementById("et_invite_search");
	}
	
	//搜索按钮
	private AndroidElement tv_search(){
		return driver.findElementById("tv_invite_search");
	}
	
	
	//搜索到的
	public int result_name(){
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_invite"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		int count=items.size();
		return count;
		
	}
	
	//邀请
	private AndroidElement result_invite(){
		return driver.findElementById("tv_searchresult_invite");
	}
	
	//确认邀请
	private AndroidElement btn_invite_ok(){
		return driver.findElementById("android:id/button1");
	}
	
	//新建队伍的提示
	public AndroidElement toast(){
		return driver.findElementByXPath("/hierarchy/android.widget.Toast");
	}
	
	//队伍约战
	private AndroidElement group(){
		return driver.findElementByXPath("//*[@text='队伍约战']");
	}
	
	
	
	
	public void start_add(){
		action.click(treatyball());
		action.click(add_treatyball());
	}
	
	public void start_add2(){
		action.click(treatyball());
		action.click(add_treatyball());
		action.click(group());
	}
	
	public void add_type_football(){
		action.click(type());
		action.click(ball_type_football());
	}
	
	public void add_type_volleyball(){
		action.click(type());
		action.click(ball_type_volleyball());
	}
	
	
	//添加约球类型现在 日期
	public void add_data_now() throws InterruptedException, IOException{
		action.click(ball_data());
		action.click(month_up());
		action.click(month_five());
		action.click(btn_OK());
	}
	
	//添加约球类型现在 日期之前
	public void add_data_before() throws InterruptedException, IOException{
		action.click(type());
		action.click(ball_type_football());
		
		action.click(ball_data());
		action.click(month_up());
		action.click(btn_OK());
	}
	
	//添加约球类型现在 日期之后
	public void add_data_after() throws InterruptedException, IOException{
		action.click(type());
		action.click(ball_type_football());
			
		action.click(ball_data());
		action.click(month_six());
		action.click(btn_OK());
	}
	
	//时刻
	public void add_time() throws InterruptedException, IOException{
		action.click(ball_time());
		action.click(hour());
		action.click(btn_OK());
	}
	
	//完成添加
	public void btn_finish(){
		action.click(btn_create());
		action.click(btn_create_ok());
	}
	
	//添加地点-红馆
	public void place1(){
		action.click(place());
		action.click(place_red());
	}
	
	//添加地点-白馆
	public void place2(){
		action.click(place());
		action.click(place_white());
	}
	
	//人数-3
	public void number3(){
		action.click(number());
		action.click(number_three());
	}
	
	//人数-4
	public void number4(){
		action.click(number());
		action.click(number_four());
	}
	
	//我想说
	public void want_say(String content){
		action.click(say());
		action.type(say(),content);
	}
	
	//邀请人加入队伍
	public void invite(String content){
		action.click(btn_invite());
		action.click(search());
		action.type(search(),content);
		action.click(tv_search());
		action.click(result_invite());
		action.click(btn_invite_ok());
	}
	
	//邀请人加入队伍
	public void invite2(String content){
		action.click(btn_invite());
		action.click(search());
		action.type(search(),content);
		action.click(tv_search());
	}
	
	
	//返回
	public void goBack() throws InterruptedException, IOException{
		String cmdstr="adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmdstr).waitFor();
		Thread.sleep(5000);
	}

}
