package com.example.application;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class NewsDemo {
    Instrumentation mInstrumentation;
    UiDevice mDevice;

    @Before
    public void starUp() throws RemoteException, InterruptedException {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        // 判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        // 按键home
        mDevice.pressHome();
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(2000);
        //登录
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("15231123391");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("111111");
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
        Thread.sleep(2000);
    }

    //进入搜索框
    @Test
    public void testEnterSearch() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
    }

    //根据ID搜索新闻（存在符合搜索内容的新闻）
    @Test
    public void testSearchByID() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_search_search")).setText("1");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_search_search")).click();
    }

    // 根据ID搜索新闻（不存在符合搜索内容的新闻）
    @Test
    public void testSearchByID2() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_search_search")).setText("100");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_search_search")).click();
    }

    //根据关键字搜索新闻（存在符合搜索内容的新闻）
    @Test
    public void testSearchByWords1() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_search_search")).setText("排超");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_search_search")).click();
    }

    //根据关键字搜索新闻（不存在符合搜索内容的新闻）
    @Test
    public void testSearchByWords2() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_search_search")).setText("呀呀呀");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_search_search")).click();
    }

    // 进入后退出搜索框,返回首页
    @Test
    public void testExitSearch() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_main_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_search_back")).click();
    }

    // 滑动列表到最底部，点击进入新闻详细页面
    @Test
    public void testEnterNews() throws InterruptedException, UiObjectNotFoundException {
        UiScrollable scrollable1 = new UiScrollable(new UiSelector().className("android.widget.LinearLayout"));
        scrollable1.flingToEnd(10);
        mDevice.findObject(By.text("排超天津女排首秀3-0河南9")).click();
    }

    // 新闻界面的操作：发表评论
    @Test
    public void testPublishComment() throws InterruptedException, UiObjectNotFoundException {
        UiScrollable scrollable1 = new UiScrollable(new UiSelector().className("android.widget.LinearLayout"));
        scrollable1.flingToEnd(10);
        mDevice.findObject(By.text("排超天津女排首秀3-0河南9")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/ed_news_commentContent")).setText("好");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_news_releaseComment")).click();
    }

    // 新闻界面的操作：@某一个用户
    @Test
    public void testRemindWhoNews() {
        mDevice.findObject(By.text("排超天津女排首秀3-0河南2")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_news_remindWho")).click();
    }

    // 新闻界面的操作：关注
    @Test
    public void testConcernNews() {
        mDevice.findObject(By.text("排超天津女排首秀3-0河南1")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_news_attention")).click();
    }
}
