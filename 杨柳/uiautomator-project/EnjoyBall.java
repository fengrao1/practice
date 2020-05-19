package com.example.app4;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.Test;

public class EnjoyBall {
    Instrumentation instrumentation;
    UiDevice uiDevice;

    //登录
    @Before
    public void startUp() throws RemoteException, InterruptedException {
        instrumentation= InstrumentationRegistry.getInstrumentation();
        uiDevice=UiDevice.getInstance(instrumentation);
        uiDevice .pressHome();
        boolean status = uiDevice.isScreenOn();
        if(!status){
            uiDevice.wakeUp();
        }
        Thread.sleep(3000);
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("17370226893");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }


    //按照球类查询约球信息
    @Test
    public void testSearch() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();
        uiDevice.findObject(By.text("足球")).click();
        uiDevice.findObject(By.text("篮球")).click();
        uiDevice.findObject(By.text("排球")).click();
        uiDevice.findObject(By.text("羽毛球")).click();
        uiDevice.findObject(By.text("乒乓球")).click();
        uiDevice.findObject(By.text("全部")).click();
    }

    //点击约球列表第一个
    @Test
    public void testFirst() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();
        UiObject2 list=uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/lv_time_demand"));
        UiObject2 item=list.findObject(By.clazz("android.widget.LinearLayout"));
        item.click();
    }

    //点击约球列表第一个 并申请加入
    @Test
    public void testJoin1() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/lv_time_demand"));
        UiObject2 item=list.findObject(By.clazz("android.widget.LinearLayout"));
        item.click();

        uiDevice.findObject(By.text("虚位以待")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //点击自己创建的队伍并申请加入
    @Test
    public void testJoin2() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();
        uiDevice.findObject(By.text("乒乓球")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/lv_time_demand"));
        UiObject2 item=list.findObject(By.clazz("android.widget.LinearLayout"));
        item.click();

        uiDevice.findObject(By.text("虚位以待")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //添加当前时间的约球
    @Test
    public void testAdd_now() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();

        //添加
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        //类型
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("足球")).click();
        //日期
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("android:id/pickers"));
        Thread.sleep(3000);
        list.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("5")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //时间
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(3000);
        UiObject2 list1=uiDevice.findObject(By.res("android:id/timePickerLayout"));
        Thread.sleep(3000);
        list1.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //确定
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_createagreement_OK")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //添加当前时间之前的约球
    @Test
    public void testAdd_before() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();

        //添加
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        //类型
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("排球")).click();
        //日期
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("android:id/pickers"));
        Thread.sleep(3000);
        list.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //时间
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(3000);
        UiObject2 list1=uiDevice.findObject(By.res("android:id/timePickerLayout"));
        Thread.sleep(3000);
        list1.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //确定
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_createagreement_OK")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //添加当前时间之后的约球
    @Test
    public void testAdd_after() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();

        //添加
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        //类型
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("足球")).click();
        //日期
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("6")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //时间
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(3000);
        UiObject2 list1=uiDevice.findObject(By.res("android:id/timePickerLayout"));
        Thread.sleep(3000);
        list1.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //确定
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_createagreement_OK")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //添加当前时间 地点 人数的约球
    @Test
    public void testAdd_place() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();

        //添加
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        //类型
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("足球")).click();
        //日期
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("android:id/pickers"));
        Thread.sleep(3000);
        list.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("5")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //时间
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(3000);
        UiObject2 list1=uiDevice.findObject(By.res("android:id/timePickerLayout"));
        Thread.sleep(3000);
        list1.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //地点
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_address")).click();
        uiDevice.findObject(By.text("白馆")).click();

        //人数
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_num")).click();
        uiDevice.findObject(By.text("4")).click();

        //确定
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_createagreement_OK")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

    //添加当前时间 地点 人数 我想说的约球
    @Test
    public void testAdd_say() throws InterruptedException {
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/img_main_time")).click();

        //添加
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        //类型
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("乒乓球")).click();
        //日期
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(3000);
        UiObject2 list=uiDevice.findObject(By.res("android:id/pickers"));
        Thread.sleep(3000);
        list.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("5")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //时间
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(3000);
        UiObject2 list1=uiDevice.findObject(By.res("android:id/timePickerLayout"));
        Thread.sleep(3000);
        list1.getChildren().get(1).findObject(By.clazz("android.widget.Button")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_bottomsheetdialog_OK")).click();

        //地点
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_address")).click();
        uiDevice.findObject(By.text("白馆")).click();

        //人数
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_num")).click();
        uiDevice.findObject(By.text("2")).click();

        //我想说
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_createagreement_say")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_createagreement_say")).setText("加油");
        uiDevice.pressBack();

        //确定
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_createagreement_OK")).click();
        uiDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(3000);
        uiDevice.pressBack();
    }

}
