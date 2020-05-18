package enjoyball_test;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import dataprovider.ExcelDataProvider;
import io.appium.java_client.ios.IOSStartScreenRecordingOptions.VideoQuality;
import page.HomePageDemo;
import page.LoginPage;

public class HomePageTest extends BaseTest{
	HomePageDemo homePage;
	@DataProvider(name="invitation")
	public Object[][] sayword() throws IOException{
		ExcelDataProvider eDataProvider = new ExcelDataProvider();
		return eDataProvider.getTestDataByExcel("E:\\java\\ball.xlsx", "Sheet2");
	}
	@BeforeClass(description="登录")
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		 homePage=loginPage.loginSuccess("13165532297", "123456");
	}
	@Test(priority=1,description="显示足球页面")
	public void show_page_football() throws InterruptedException{
		Thread.sleep(3000);
		homePage.pageShow_football();
	}
	@Test(priority=2,description="显示羽毛球页面")
	public void show_page_badminton() throws InterruptedException{
		Thread.sleep(3000);
		homePage.pageShow_badminton();
	}
	@Test(priority=3,description="显示篮球页面")
	public void show_page_basketball() throws InterruptedException{
		Thread.sleep(3000);
		homePage.pageShow_basketball();
	}
	@Test(priority=4,description="显示乒乓球页面")
	public void show_page_table_tennis() throws InterruptedException{
		Thread.sleep(3000);
		homePage.pageShow_table_tennis();
	}
	@Test(priority=5,description="显示排球页面")
	public void show_page_volleyball() throws InterruptedException{
		Thread.sleep(3000);
		homePage.pageShow_volleyball();
	}
	@Test(priority=6,description="加入约球队伍")
	public void invitation_people() throws InterruptedException, IOException{
		homePage.addpeople_one_ok();
	}
	
	@Test(priority=7,description="搜索框的测试")
	public void search() throws InterruptedException, IOException{
		homePage.search_text("河南");
		homePage.new_one();
	}
	
	@Test(priority=8,description="不选择日期时间_足球")
	public void  personal_football() throws InterruptedException{
		homePage.add_balls();
		homePage.personal_football();
	}
	@Test(priority=9,description="不选择日期时间_篮球")
	public void  personal_basketball() throws InterruptedException{
		homePage.add_balls();
		homePage.personal_basketball();
	}
	
	@Test(priority=10,description="不选择日期时间_羽毛球")
	public void  personal_badminton() throws InterruptedException{
		homePage.add_balls();
		homePage.personal_badminton();
	}
	@Test(priority=11,description="不选择日期时间_排球")
	public void  personal_volleyball() throws InterruptedException{
		homePage.add_balls();
		homePage.personal_volleyball();
	}
	@Test(priority=12,description="不选择日期时间_乒乓球")
	public void  personal_table_tennis() throws InterruptedException{
		homePage.add_balls();
		homePage.personal_table_tennis();
	}
	
	@Test(priority=13,description="日期时间的测试——足球")
	public void  personal_date_football() throws InterruptedException{
		homePage.add_balls();
		homePage.date_football();
	}
	
	@Test(priority=14,description="日期时间的测试——篮球")
	public void  personal_date_basketball() throws InterruptedException{
		homePage.add_balls();
		homePage.date_basketball();
	}
	@Test(priority=15,description="日期时间的测试——羽毛球")
	public void  personal_date_badminton() throws InterruptedException{
		homePage.add_balls();
		homePage.date_badminton();
	}
	@Test(priority=16,description="日期时间的测试——乒乓球")
	public void  personal_date_tabletennis() throws InterruptedException{
		homePage.add_balls();
		homePage.date_table_tennis();
	}
	@Test(priority=17,description="日期时间的测试——排球")
	public void  personal_date_volleyball() throws InterruptedException{
		homePage.add_balls();
		homePage.date_volleyball();
	}
	@Test(priority=18,description="地点选择的测试")
	public void  personal_address() throws InterruptedException{
		homePage.add_balls();
		homePage.address_football();
	}
	
	@Test(priority=18,description="人数选择的测试")
	public void  personal_number() throws InterruptedException{
		homePage.add_balls();
		homePage.number_football();
	}
	
	@Test(priority=19,description="可见性的测试")
	public void  personal_visibility() throws InterruptedException{
		homePage.add_balls();
		homePage.visibility_football();
	}
	
	@Test(priority=20,description="我想说测试")
	public void  personal_say() throws InterruptedException{
		homePage.add_balls();
		homePage.say_football();
	}
	
	
	
	@Test(dataProvider="invitation",priority=21,description="邀请测试")
	public void  personal_invitation(String word) throws Exception{
		homePage.add_balls();
		homePage.invitation_text(word);
	}
	
	
}

