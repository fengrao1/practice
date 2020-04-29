package edu.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import edu.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	protected AndroidDriver<AndroidElement> driver;
//	Dimension dimension;
	
	@BeforeClass
	public void startup()throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "VED7N18907003573");
	    cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
	    cap.setCapability("appActivity", "com.example.lenovo.Activity.LoginActivity");
	    cap.setCapability("noReset","true");
	    driver=new AndroidDriver<AndroidElement>
	    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	  //����ҳ����ȫ���صĳ�ʱʱ�䣬��ȫ���ؼ�ҳ��ȫ����Ⱦ���첽ͬ���ű���ִ����ɡ�
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //��¼  
	    LoginPage loginPage=new LoginPage(driver);
		loginPage.loginSuccess("17731026303", "123456");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Assert.assertEquals(this.driver.currentActivity(), "com.example.lenovo.Activity.LoginActivity");
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
