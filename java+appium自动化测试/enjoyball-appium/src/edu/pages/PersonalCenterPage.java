package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PersonalCenterPage{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public PersonalCenterPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	//��������
	public AndroidElement image() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_main_portrait");
	}
	
	//�ҵ�����
	public AndroidElement my_data() {
		return this.driver.findElementByXPath("//*[@text='�ҵ�����']");
	}
	
	//�û���
	public AndroidElement my_data_name() {
		return this.driver.findElementByXPath("//*[@text='�û���']");
	}
	
	public AndroidElement new_name() {
		return this.driver.findElementByXPath("//*[@text='�����������û���']");
	}
	
	public AndroidElement change() {
		return this.driver.findElementByXPath("//*[@text='�޸�']");
	}
	
	//�Ա�
	public AndroidElement sex() {
		return this.driver.findElementByXPath("//*[@text='�Ա�']");
	}
	
	//�Ա��С�
	public AndroidElement man_sex() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/tv_dialog_perinfo_man");
	}
	
	//����
	public AndroidElement age() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//����-����
	public AndroidElement age_secret() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//����
	public AndroidElement city() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//�ֻ���
	public AndroidElement phone() {
		return this.driver.findElementByXPath("//*[@text='�ֻ���']");
	}
	
	//����
	public AndroidElement Email() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//��������
	public AndroidElement new_Email() {
		return this.driver.findElementByXPath("//*[@text='��������������']");
	}
	
	//����ǩ��
	public AndroidElement personnote() {
		return this.driver.findElementByXPath("//*[@text='����ǩ��']");
	}
	
	//�������ǩ��
	public AndroidElement new_note() {
		return this.driver.findElementByXPath("//*[@text='�༭���ĸ���ǩ��']");
	}
	
	//��ͨ��Ա
	public AndroidElement huiyuan() {
		return this.driver.findElementByXPath("//*[@text='��ͨ��Ա']");
	}
	
	//Լ��
	public AndroidElement ball_play() {
		return this.driver.findElementByXPath("//*[@text='Լ��']");
	}

	//�ղ�
	public AndroidElement shou() {
		return this.driver.findElementByXPath("//*[@text='�ղ�']");
	}
	
	//��Ա
	public AndroidElement HY() {
		return this.driver.findElementByXPath("//*[@text='��Ա']");
	}

	//����
	public AndroidElement ret() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//д����
	public AndroidElement writeret() {
		return this.driver.findElementByXPath("//*[@text='���꾡����Ҫ���������⣬������������ٵĴ���']");
	}
	
	//�ύ
	public AndroidElement pull() {
		return this.driver.findElementByXPath("//*[@text='�ύ']");
	}
	
	//ע��
	public AndroidElement ZX() {
		return this.driver.findElementByXPath("//*[@text='ע��']");
	}
	
	//ͷ��
	public AndroidElement touxiang() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait");
	}
	
	//��Ϣ
	public AndroidElement XX() {
		return this.driver.findElementByXPath("//*[@text='��Ϣ']");
	}
	
	//����1
	public AndroidElement PL() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	
	//��ע1
	public AndroidElement GZ() {
		return this.driver.findElementByXPath("//*[@text='��ע']");
	}
	
	//��˿1
	public AndroidElement FS() {
		return this.driver.findElementByXPath("//*[@text='��˿']");
	}
	
	//����
	public AndroidElement JF() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_scores");
	}
	
	//����2
	public AndroidElement PL2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_comment");
	}
	
	//��ע2
	public AndroidElement GZ2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_follow");
	}
	
	//��˿2
	public AndroidElement FS2() {
		return this.driver.findElementById("com.example.lenovo.enjoyball:id/iv_personalcenter_fans");
	}
	
	//1.�޸��û���
	public void change_name(String name) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(my_data_name());
		Thread.sleep(2000);
		action.type(new_name(), name);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//2.�޸��Ա�
	public void change_sex() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(sex());
		Thread.sleep(2000);
		action.click(man_sex());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//3.�޸�����
	public void change_age() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(age());
		Thread.sleep(2000);
		action.click(age_secret());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//4.�޸ĳ���
	public void change_city() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(city());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//5.�޸��ֻ���
	public void change_phone() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(phone());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//6.�޸�����
	public void change_Email(String Email) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(Email());
		Thread.sleep(2000);
		action.type(new_Email(), Email);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//7.�޸ĸ���ǩ��
	public void change_note(String note) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(personnote());
		Thread.sleep(2000);
		action.type(new_note(), note);
		Thread.sleep(2000);
		action.click(change());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//8.��ͨ��Ա
	public void hui_yuan() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(my_data());
		Thread.sleep(2000);
		action.click(huiyuan());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//9.Լ��
	public void play_ball() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ball_play());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//10.�ղ�
	public void shoucang() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(shou());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	//11.��Ա
	public void vip() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(HY());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//12.�ύ����
	public void pull_fankui(String fankui) throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ret());
		Thread.sleep(2000);
		action.type(writeret(), fankui);
		Thread.sleep(2000);
		action.click(pull());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//13.ע��
	public void zhuxiao() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(ZX());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//14.�鿴��Ϣ
	public void CKxinxi() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(XX());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//15.�鿴����1
	public void comment1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(PL());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//16.�鿴��ע1
	public void follow1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(GZ());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//17.�鿴��˿1
	public void fan1() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(touxiang());
		Thread.sleep(2000);
		action.click(FS());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//18.�鿴����
	public void score() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(JF());
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//19.�鿴����2
	public void comment2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(PL2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//20.�鿴��ע2
	public void follow2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(GZ2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	//21.�鿴��˿2
	public void fan2() throws InterruptedException {
		action.click(image());
		Thread.sleep(2000);
		action.click(FS2());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
