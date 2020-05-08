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
	
	//���Լ��ť
	private AndroidElement treatyball(){
		return driver.findElementById("img_main_time");
	}
	
	//������ҡ���ȫ��
	private AndroidElement all(){
		return driver.findElementById("tv_main_topall");
	}
	
	//������ҡ�������
	private AndroidElement football(){
		return driver.findElementById("tv_main_football");
	}
	
	//������ҡ�������
	private AndroidElement basketball(){
		return driver.findElementById("tv_main_basketball");
	}
	
	//������ҡ�������
	private AndroidElement volleyball(){
		return driver.findElementById("tv_main_volleyball");
	}
	
	//������ҡ�����ë��
	private AndroidElement badminton(){
		return driver.findElementById("tv_main_badminton");
	}
	
	//������ҡ���ƹ����
	private AndroidElement tabletennis(){
		return driver.findElementById("tv_main_tabletennis");
	}
	
	//Լ���б��һ��
	private  MobileElement list_item() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/tab_content"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(0);
	}
	
	//�������
	private AndroidElement btn_join(){
		return driver.findElementByXPath("//*[@text='��λ�Դ�']");
	}
	
	
	//�������
	private AndroidElement btn_join_ok(){
		return driver.findElementById("android:id/button1");
	}
	
	//��������ʾ
	public AndroidElement toast(){
		return driver.findElementByXPath("/hierarchy/android.widget.Toast");
		
	}
	
	//�ҵĽ���
	private AndroidElement my(){
		return driver.findElementById("iv_main_portrait");
	}
	
	//�ҵĽ���-Լ��
	private AndroidElement my_yueqiu(){
		return driver.findElementById("ll_personalcenter_yueqiu");
	}
	
	
	//Լ���б�
	private  MobileElement yueqiu_list1() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_treatyball_match"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(0);
	}
	
	//Լ���б�
	private  MobileElement yueqiu_list2() {
		AndroidElement list = driver.findElement(By.id("com.example.lenovo.enjoyball:id/lv_treatyball_match"));
		List<MobileElement> items = list.findElements(By.className("android.widget.LinearLayout"));
		return items.get(10);
	}
	
	
	
	//���������ѯԼ����Ϣ
	public void search(){
		action.click(treatyball());
		action.click(football());
		action.click(basketball());
		action.click(volleyball());
		action.click(badminton());
		action.click(tabletennis());
		action.click(all());
	}
	
	//���Լ���б��һ��
	public void list_first(){
		action.click(treatyball());
		action.click(list_item());
	}
	
	
	//���Լ���б��һ�����������
	public void join(){
		action.click(treatyball());
		action.click(list_item());
		action.click(btn_join());
		action.click(btn_join_ok());
	}
	
	//����ҵĽ������Լ��
	public void yueqiu(){
		action.click(my());
		action.click(my_yueqiu());
	}
	
	//����Լ������Ķ��鲢�������
	public void join_my(){
		action.click(treatyball());
		action.click(tabletennis());
		action.click(list_item());
		action.click(btn_join());
	}
	
	
	//����
	public void goBack() throws InterruptedException, IOException{
		String cmdstr="adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmdstr).waitFor();
		Thread.sleep(5000);
	}
	
}
