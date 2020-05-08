package edu.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {

	URL url;
	public AndroidDriver<AndroidElement> driver;
	//Dimension dim;
	
	@BeforeClass
	public void startUp() throws MalformedURLException{
		//com.mobeta.android.demodslv/.TestBedDSLV
		url=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName","2GXDU19923010881");
				
		cap.setCapability("appPackage","com.example.lenovo.enjoyball");
		cap.setCapability("appActivity","com.example.lenovo.Activity.LoginActivity");
				
		cap.setCapability("noReset","true");
		driver=new AndroidDriver<AndroidElement>(url,cap);
		//ÒþÊ½µÈ´ý
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
	}

}
