package page;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class HomePageDemo {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePageDemo(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}

	private AndroidElement btn_ball() { //约球键
		//com.example.lenovo.enjoyball:id/img_main_time
		//	com.example.lenovo.enjoyball:id/tab_spec_main_time
		return driver.findElementById("tab_spec_main_time");
	}
	
	private AndroidElement btn_football() {//足球
		//com.example.lenovo.enjoyball:id/tv_main_football
		return driver.findElement(By.id("tv_main_football"));
	}
	private AndroidElement btn_basketball() {
		//com.example.lenovo.enjoyball:id/tv_main_basketball
		return driver.findElement(By.id("tv_main_basketball"));
	}
	private AndroidElement btn_volleyball() {
		//com.example.lenovo.enjoyball:id/tv_main_volleyball
		return driver.findElement(By.id("tv_main_volleyball"));
	}
	private AndroidElement btn_badminton() {
		//com.example.lenovo.enjoyball:id/tv_main_badminton
		return driver.findElement(By.id("tv_main_badminton"));
	}
	private AndroidElement btn_table_tennis() {
		return driver.findElement(By.id("tv_main_tabletennis"));
	}
	
	private AndroidElement btn_OK() {//确定键
		return driver.findElementByXPath("//*[@text='确定']");
	}
	
	private AndroidElement btn_ok() {//确认键
		return driver.findElementById("android:id/button1");
	}
	
	private AndroidElement btn_Edit(){//取消键
		return driver.findElementByXPath("//*[@text='取消']");
	}
	private AndroidElement btn_invitation(){//邀请
		return driver.findElementByXPath("//*[@text='邀请']");
	}
	private AndroidElement btn_search(){//搜索键
		//com.example.lenovo.enjoyball:id/iv_search_search
		return driver.findElementById("iv_search_search");
	}
	private AndroidElement btn_add(){//加入键
		return driver.findElementById("android:id/button1");
	}
	//点击添加按钮
	private AndroidElement btn_add_ball(){
		return driver.findElementById("fab_demand_add");
	}
	
	private AndroidElement btn_back(){  //页面上的返回键
//		com.example.lenovo.enjoyball:id/iv_search_back
		return driver.findElementById("iv_search_back");
	}
	private AndroidElement btn_type(){
		return driver.findElementById("sp_createagreement_type");
	}

	private AndroidElement btn_data(){
//		com.example.lenovo.enjoyball:id/tv_getData
		return driver.findElementById("tv_getData");
	}
	
	private AndroidElement btn_time(){
//		com.example.lenovo.enjoyball:id/tv_getTime
		return driver.findElementById("tv_getTime");
	}
	private AndroidElement btn_address(){//地点
//		com.example.lenovo.enjoyball:id/sp_createagreement_address
		return driver.findElementById("sp_createagreement_address");
	}
	

	private AndroidElement btn_number(){//人数
		return driver.findElementById("sp_createagreement_num");
	}

	private AndroidElement btn_visibility(){ //可见性
		//	com.example.lenovo.enjoyball:id/sp_createagreement_visiblity
		return driver.findElementById("sp_createagreement_visiblity");
	}

	private AndroidElement say_text(){ 
		//com.example.lenovo.enjoyball:id/et_createagreement_say
		return driver.findElementById("et_createagreement_say");
	}
	private AndroidElement invitation_text(){
//com.example.lenovo.enjoyball:id/et_invite_search
		return driver.findElementById("et_invite_search");
	}
	public void pageShow_football(){
		action.click(btn_ball());//点击约球
		action.click(btn_football());
	}
	
	public void pageShow_basketball(){
		action.click(btn_ball());//点击约球
		action.click(btn_basketball());
	}
	
	public void pageShow_badminton(){
		action.click(btn_ball());//点击约球
		action.click(btn_badminton());
	}
	public void pageShow_table_tennis(){
		action.click(btn_ball());//点击约球
		action.click(btn_table_tennis());
	}
	
	public void pageShow_volleyball(){
		action.click(btn_ball());//点击约球
		action.click(btn_volleyball());
	}

	public void addpeople_one_ok() throws InterruptedException, IOException{
		Thread.sleep(3000);
		action.click(btn_ball());//点击约球
		//点击第二个
		action.click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]"));
		Thread.sleep(3000);
		action.click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView"));
		Thread.sleep(3000);
		action.click(btn_add());//点击加入
		action.goBack();
		
	}


	
	public void search_text(String context){
		AndroidElement text = driver.findElement(By.id("et_main_search"));
		text.click();
		//com.example.lenovo.enjoyball:id/et_search_search
		AndroidElement text1 = driver.findElement(By.id("et_search_search"));
		text1.sendKeys(context);
		action.click(btn_search());
		
		//com.example.lenovo.enjoyball:id/iv_search_back
	}
	
	private  MobileElement list_item() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_search_news"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		int count = items.size();
		System.out.println(count);
		return items.get(0);
	}
	
	//点击查看其中一个赛事
	public  void new_one() throws InterruptedException, IOException{
		action.click(list_item());
		action.goBack();
		action.click(btn_back());
   }
	
	//添加约球
	public void add_balls(){
		action.click(btn_ball());//点击约球
		action.click(btn_add_ball());
		
	}
	
	public void personal_football() throws InterruptedException{
		//下拉框
		action.click(btn_type());
//		com.example.lenovo.enjoyball:id/sp_createagreement_type
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		System.out.println(action.getToast());

	}
	
	public void personal_basketball() throws InterruptedException{
		//下拉框
		action.click(btn_type());
//		com.example.lenovo.enjoyball:id/sp_createagreement_type
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='篮球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		System.out.println(action.getToast());

	}
	
	
	public void personal_badminton() throws InterruptedException{
		//下拉框
		action.click(btn_type());
//		com.example.lenovo.enjoyball:id/sp_createagreement_type
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='羽毛球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		System.out.println(action.getToast());

	}
	
	
	public void personal_table_tennis() throws InterruptedException{
		//下拉框
		action.click(btn_type());
//		com.example.lenovo.enjoyball:id/sp_createagreement_type
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='乒乓球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		System.out.println(action.getToast());

	}
	
	
	public void personal_volleyball() throws InterruptedException{
		//下拉框
		action.click(btn_type());
//		com.example.lenovo.enjoyball:id/sp_createagreement_type
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='排球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		System.out.println(action.getToast());

	}
	
	public void date_football() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	public void date_basketball() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='篮球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	public void date_badminton() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='羽毛球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	public void date_table_tennis() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='乒乓球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	public void date_volleyball() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='排球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	
	public void address_football() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_address());
		Thread.sleep(2000);
		action.click(By.xpath("//*[@text='白馆']"));
		Thread.sleep(2000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	public void number_football() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_number());
		Thread.sleep(2000);
		action.click(By.xpath("//*[@text='3']"));
		Thread.sleep(2000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	
	public void visibility_football() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_visibility());
		Thread.sleep(2000);
		action.click(By.xpath("//*[@text='我关注的可见']"));
		Thread.sleep(2000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	
	public void say_football() throws InterruptedException{
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.type(say_text(), "约个球");
		Thread.sleep(2000);
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_ok());
		System.out.println(action.getToast());
	}
	
	public void invitation_text(String invitation_text) throws Exception {
		action.click(btn_type());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='足球']"));
		Thread.sleep(3000);
		action.click(btn_data());
		action.click(By.xpath("//*[@text='2019']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(btn_time());
		action.click(By.xpath("//*[@text='上午']"));
		action.click(btn_OK());
		Thread.sleep(3000);
		action.click(By.xpath("//*[@text='邀请']"));
		Thread.sleep(2000);
		action.type(invitation_text(),invitation_text);
		Thread.sleep(2000);
		action.click(By.xpath("//*[@text='搜索']"));
		Thread.sleep(2000);
        action.goBack();
        action.goBack();
	}
	
}