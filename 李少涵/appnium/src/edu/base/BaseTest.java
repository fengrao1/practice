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
	  //设置页面完全加载的超时时间，完全加载即页面全部渲染，异步同步脚本都执行完成。
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //登录  
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
