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
//������Ա��webview�ĵ��Կڴ򿪣���ӡ��NATIVE_APP\WEBVIEW������л������ģ�ʹ��selenium��λ
//δ�򿪣�������ֻ��ӡ��NATIVE_APP��ֻ����xpath���ж�λ
		}
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("����")));
	}
}
