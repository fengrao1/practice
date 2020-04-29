package appiumDemo;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;

public class Demo {
	@Test
	public void test1()throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "VED7N18907003573");
	    cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
	    cap.setCapability("appActivity","com.example.lenovo.Activity.LoginActivity");
	    
	    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>
	    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    
//	    WebElement el2=driver.findElementById("com.example.todolist:id/nameET");
//	    el2.sendKeys("1");
//	    
//	    WebElement el3=driver.findElementById("com.example.todolist:id/passwordET");
//	    el3.sendKeys("1");
//	    WebElement el4=driver.findElementById("com.example.todolist:id/loginBtn");
//	    el4.click();
	
	
	}
}
