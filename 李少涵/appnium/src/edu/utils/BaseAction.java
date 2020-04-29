package edu.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BaseAction {
	public AndroidDriver<AndroidElement> driver;
	public AndroidTouchAction action;

	public BaseAction(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		action = new AndroidTouchAction(driver);

	}

	/**
	 * @param by
	 */
	public void click(By by) {
		driver.findElement(by).click();
	}

	public void click(WebElement elemnet){
		elemnet.click();
	}
	public void sleep(long times) throws InterruptedException {
		Thread.sleep(times);
	}

	/**
	 * 输入
	 * 
	 * @param element
	 * @param context
	 */
	public void type1(By by, String value) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);
		 
	}
	public void type2(WebElement elemnet, String value) {
		elemnet.clear();
		elemnet.sendKeys(value);

	}
	public void file(WebElement elemnet, String value) {
		elemnet.sendKeys(value);
		

	}

	public void type(WebElement element, String context) {
		element.sendKeys(context);
	}

	// 长按
	public void longPress(WebElement element) {
		LongPressOptions longPressOptions = LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));
		action.longPress(longPressOptions).release().perform();
	}

	// 坐标点的滑动
	public void swip(PointOption fromOption, PointOption toOption) {
		action.press(fromOption).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(toOption)
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}

	// 元素间的滑动
	public void swip(WebElement fromEle, WebElement toEle) {

		PointOption fromOption = PointOption.point(fromEle.getLocation().getX(), fromEle.getLocation().getY());
		PointOption toOption = PointOption.point(toEle.getLocation().getX(), toEle.getLocation().getY());
		swip(fromOption, toOption);
	}
	//按着元素拖动
	public void DragAndSwip(AndroidElement element) {

		LongPressOptions longPressOptions = LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));

		action.longPress(longPressOptions).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(100, element.getLocation().getY()))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}

	//多点点击
	public void multiTouch(int x1, int y1, int x2, int y2, int x3, int y3) {
		MultiTouchAction multiAction = new MultiTouchAction(driver);
		AndroidTouchAction action1 = new AndroidTouchAction(driver);
		AndroidTouchAction action2 = new AndroidTouchAction(driver);
		AndroidTouchAction action3 = new AndroidTouchAction(driver);
		AndroidTouchAction action4 = new AndroidTouchAction(driver);
		AndroidTouchAction action5 = new AndroidTouchAction(driver);

		action1.longPress(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();
		action2.longPress(PointOption.point(x2, y2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();
		action3.longPress(PointOption.point(x3, y3)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();

		multiAction.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
	}
	//单点点击
	public void oneTouch(int x1, int y1) {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(PointOption.point(x1, y1)).perform();

	}
	
	public String getToast() {
		return driver.findElementByXPath("//*[@class='android.widget.Toast']").getText();
	}
	
	public static int getRandNumber(int MAX,int MIN) {
		Random rand = new Random();
		int randNumber =rand.nextInt(MAX - MIN + 1) + MIN;
		return randNumber;
	}
	public void back() {
		 driver.navigate().back();
	}
}
