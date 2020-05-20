package com.example.myapplication2;

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

    @Before
    public void startUp() throws RemoteException, InterruptedException {
        instrumentation= InstrumentationRegistry.getInstrumentation();
        uiDevice=UiDevice.getInstance(instrumentation);

        uiDevice .pressHome();
        boolean status = uiDevice.isScreenOn();//判断是否锁屏
        if(!status){
            uiDevice.wakeUp();
        }
        Thread.sleep(3000);
    }

    //注册移动手机号的账号
    public void register1() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15227989218");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册联通手机号的账号
    public void register2() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15632112815");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册电信手机号的账号
    public void register3() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("18033888690");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //显示注册时的密码
    public void register() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15227989218");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_register_eye")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //座机号是否可以注册
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("89681150");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //10086是否可以注册
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("10086");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册时密码是否可以全英文
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15227989288");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("liziran");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册时密码是否可以包含特殊符号
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15227872288");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("$123456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册时密码是否可以包含标点符号
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15537872288");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123。456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //注册时密码是否可以包含空格
    public void register4() throws InterruptedException{
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_register")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_phone"))
                .setText("15327872288");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_register_pwd"))
                .setText("123 456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_register_register")).click();
        Thread.sleep(3000);
    }

    //登录移动手机号
    @Test
    public void longin1() throws InterruptedException{
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("15227989218");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }

    //登录电信手机号
    @Test
    public void longin2() throws InterruptedException{
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("18033888690");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }

    //登录联通手机号
    @Test
    public void longin3() throws InterruptedException{
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("15632112815");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }

    //登录未注册手机号
    @Test
    public void longin4() throws InterruptedException{
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("18022331144");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }

    //显示登录密码
    @Test
    public void longineye() throws InterruptedException {
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone"))
                .setText("18022331144");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd"))
                .setText("123456789");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_login_eye")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
    }

    //忘记密码
    @Test
    public void forget1() throws InterruptedException {

        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_forget")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_phone"))
                .setText("15227989218");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_pwd"))
                .setText("123456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_forget_changecode")).click();
        Thread.sleep(3000);

    }

    //显示修改后的密码
    public void forgetEye() throws InterruptedException {

        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_login_forget")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_phone"))
                .setText("15227989218");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_code"))
                .setText("1234");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_forget_pwd"))
                .setText("123456");
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_forget_eye")).click();
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_forget_changecode")).click();
        Thread.sleep(3000);
    }

    @Test //显示足球页面
    public void TestShowFootballPage() throws InterruptedException {
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tab_spec_main_time")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_main_football")).click();
        Thread.sleep(3000);
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
}

