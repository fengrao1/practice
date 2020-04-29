package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo2 {
	AndroidDriver<AndroidElement>driver;
	@BeforeClass
	public void startup()throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		 driver=new AndroidDriver<AndroidElement>
		    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "127.0.0.1:62001");
	    cap.setCapability("appPackage", "com.example.todolist");
	    cap.setCapability("appActivity", ".LoginActivity");
	    
	    
	    
	}
	@Test
	public void tes1() {
		AndroidElement el2=driver.findElementById("com.example.todolist:id/nameET");
		    el2.sendKeys("1");
		    AndroidElement el3=driver.findElementById("com.example.todolist:id/passwordET");
		    el3.sendKeys("1");
		    AndroidElement el4=driver.findElementById("com.example.todolist:id/loginBtn");
		    el4.click();
	}
}
