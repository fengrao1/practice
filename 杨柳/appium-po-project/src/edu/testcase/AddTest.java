package edu.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.AddPage;
import edu.pages.LoginPage;
import edu.pages.TreatyBallPage;

public class AddTest extends BaseTest{
	
	AddPage addPage;
	@BeforeClass
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		addPage=loginPage.login2("17370226893", "123456");
	}
	
	//���Լ����Ϣ-��ǰʱ��
	@Test(description="���Լ����Ϣ-��ǰʱ��",priority=1)
	public void add1() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��֮ǰ
	@Test(description="���Լ����Ϣ-��ǰʱ��֮ǰ",priority=2)
	public void add2() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_before();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��֮��
	@Test(description="���Լ����Ϣ-��ǰʱ��֮��",priority=3)
	public void add3() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.add_data_after();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
		
	//���Լ����Ϣ-��ǰʱ�� ����
	@Test(description="���Լ����Ϣ-��ǰʱ�� ����",priority=4)
	public void add4() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-���
	@Test(description="���Լ����Ϣ-��ǰʱ��-���",priority=5)
	public void add5() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_football();
		addPage.place1();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-�׹�
	@Test(description="���Լ����Ϣ-��ǰʱ��-�׹�",priority=6)
	public void add6() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-����Ϊ3
	@Test(description="���Լ����Ϣ-��ǰʱ��-����Ϊ3",priority=7)
	public void add7() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number3();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-����Ϊ4
	@Test(description="���Լ����Ϣ-��ǰʱ��-����Ϊ4",priority=8)
	public void add8() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		addPage.goBack();
	}
	
	
	//���Լ����Ϣ-��ǰʱ��-����˵
	@Test(description="���Լ����Ϣ-��ǰʱ��-����˵",priority=9)
	public void add9() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.want_say("���ͣ���");
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-����˵
	@Test(description="���Լ����Ϣ-��ǰʱ��-����˵",priority=10)
	public void add10() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_type_volleyball();
		addPage.place2();
		addPage.number4();
		addPage.add_data_now();
		addPage.add_time();
		addPage.want_say("  ");
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	
	//���Լ����Ϣ-��ǰʱ��-�����˼������
	@Test(description="���Լ����Ϣ-��ǰʱ��-�����˼������",priority=11)
	public void add11() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_data_now();
		addPage.add_time();
		addPage.invite("15833552353");
		Thread.sleep(3000);
		Assert.assertTrue(addPage.result_name()!=0);
		addPage.goBack();
		addPage.goBack();
		addPage.btn_finish();
		Assert.assertEquals("���յ���һ���µ�Լ������", addPage.toast().getText());
		addPage.goBack();
	}
	
	//���Լ����Ϣ-��ǰʱ��-�����˼������
	@Test(description="���Լ����Ϣ-��ǰʱ��-�����˼������",priority=12)
	public void add12() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add();
		addPage.add_data_now();
		addPage.add_time();
		addPage.invite2("123456789");
		addPage.goBack();
		addPage.goBack();
		addPage.goBack();
	}
	
	@Test(description="����Լս",priority=13)
	public void add13() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add2();
		addPage.add_type_football();
		addPage.add_data_now();
		addPage.add_time();
		addPage.btn_finish();
		Assert.assertEquals("Լ����鴴���ɹ�", addPage.toast().getText());
		addPage.goBack();
	}
	
	@Test(description="����Լս-δ�齨���������",priority=14)
	public void add14() throws InterruptedException, IOException{
		AddPage addPage=new AddPage(driver);
		addPage.start_add2();
		addPage.add_type_volleyball();
		Assert.assertEquals("��û�д��������͵���ӣ��޷��������Լս", addPage.toast().getText());
		addPage.goBack();
	}

}
