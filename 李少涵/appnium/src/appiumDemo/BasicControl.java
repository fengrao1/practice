package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicControl {
	AndroidDriver<AndroidElement> driver;
	Dimension dimension;
	@BeforeClass
	public void startup()throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		 
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "VED7N18907003573");//代表是夜神模拟器，若要更换模拟器，则需要对这个更改
	    //emulator -list-avds
	   // emulator.exe -netdelay none -netspeed full -avd Pixel_2_API_23---进行查找编号
	   
	    cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
	    cap.setCapability("appActivity","com.example.lenovo.Activity.LoginActivity");
	    cap.setCapability("noReset","true");
	    driver=new AndroidDriver<AndroidElement>
	    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //设置页面完全加载的超时时间，完全加载即页面全部渲染，异步同步脚本都执行完成。
	    //没有设置超时时间默认是等待页面全部加载完成才会进入下一步骤
	    dimension=driver.manage().window().getSize();
	    //获取当前测试手机的屏幕分辨率
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
