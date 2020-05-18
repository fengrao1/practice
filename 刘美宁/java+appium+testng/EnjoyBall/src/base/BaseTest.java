package base;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	URL url;
	public AndroidDriver<AndroidElement> driver;
	Dimension dim;
    @BeforeClass
	public void startUp() throws MalformedURLException, InterruptedException{
		 url = new URL("http://127.0.0.1:4723/wd/hub");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("deviceName", "8KE5T19B11004244");
		 capabilities.setCapability("appPackage", "com.example.lenovo.enjoyball");
		 capabilities.setCapability("appActivity", "com.example.lenovo.Activity.LoginActivity");
		 capabilities.setCapability("noReset",true);
		 driver = new AndroidDriver<AndroidElement>(
				 url,capabilities);
		 driver.manage().timeouts().
		 implicitlyWait(30, TimeUnit.SECONDS);
		 dim = driver.manage().window().getSize();

		
	}
    @AfterClass
    public void  teardown() {
    	// TODO Auto-generated method stub
    	driver.quit();
    }
   
}
