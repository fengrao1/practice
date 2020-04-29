package appiumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HybirdDemo extends BasicControl {

	@Test
	public void text1() {
		
		Set<String>contexts=driver.getContextHandles();
		for(String context:contexts) {
			System.out.println(context);
//开发人员把webview的调试口打开，打印出NATIVE_APP\WEBVIEW则可以切换上下文，使用selenium定位
//未打开，上下文只打印出NATIVE_APP，只能用xpath进行定位
		}
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("厉害")));
	}
}
