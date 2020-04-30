package edu.base;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
    protected AndroidDriver<AndroidElement> driver;
    Dimension dimension;
	URL url;
    @BeforeClass
    public void globalSetup () throws IOException {
    	url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "6a50ace1");
		cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
		cap.setCapability("appActivity", "com.example.lenovo.Activity.LoginActivity");
		
		cap.setCapability("noReset", "true");
		
		driver = new AndroidDriver<AndroidElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		dimension = driver.manage().window().getSize();
		
    }

//    @AfterSuite
//    public void globalTearDown () {
////        service.stop();
//    	this.driver.quit();
//    }

//    public URL getServiceUrl () {
//        return service.getUrl();
//    }

}
