package edu.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	protected AndroidDriver<AndroidElement> driver;
//	Dimension dimension;
	
	@BeforeClass
	public void startup()throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "GBG5T19620003914");
		cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
		cap.setCapability("appActivity", "com.example.lenovo.Activity.LoginActivity");
//	    cap.setCapability("noReset","true");
	    driver=new AndroidDriver<AndroidElement>
	    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    Thread.sleep(2000);
	}
}
