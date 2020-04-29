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
	    cap.setCapability("deviceName", "VED7N18907003573");//������ҹ��ģ��������Ҫ����ģ����������Ҫ���������
	    //emulator -list-avds
	   // emulator.exe -netdelay none -netspeed full -avd Pixel_2_API_23---���в��ұ��
	   
	    cap.setCapability("appPackage", "com.example.lenovo.enjoyball");
	    cap.setCapability("appActivity","com.example.lenovo.Activity.LoginActivity");
	    cap.setCapability("noReset","true");
	    driver=new AndroidDriver<AndroidElement>
	    (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //����ҳ����ȫ���صĳ�ʱʱ�䣬��ȫ���ؼ�ҳ��ȫ����Ⱦ���첽ͬ���ű���ִ����ɡ�
	    //û�����ó�ʱʱ��Ĭ���ǵȴ�ҳ��ȫ��������ɲŻ������һ����
	    dimension=driver.manage().window().getSize();
	    //��ȡ��ǰ�����ֻ�����Ļ�ֱ���
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
