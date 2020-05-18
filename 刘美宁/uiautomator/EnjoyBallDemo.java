package com.example.myapplication0303;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

public class EnjoyBallDemo {
    //testng   测试用到断言  AndroidJUnit4
    static  Instrumentation instrumentation;
    static  UiDevice uiDevice;

    @BeforeClass   //登录
    public static void startAPP() throws RemoteException, InterruptedException {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        uiDevice = UiDevice.getInstance(instrumentation);
        //也可以利用键盘进行操作
//        uiDevice.pressKeyCode();
        boolean status = uiDevice.isScreenOn();//判断是否锁屏
        if(!status){
            uiDevice.wakeUp();
        }
        Thread.sleep(3000);
        uiDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(5000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("13165532297");//输入用户名
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");//输入密码
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click(); //点击登录
        Thread.sleep(3000);

    }
    @Test //显示足球页面
    public void TestShowFootballPage() throws InterruptedException {
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tab_spec_main_time")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_main_football")).click();
        Thread.sleep(3000);

    }
    @Test
    public void TestTypeBall_1() throws InterruptedException {

        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/fab_demand_add")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("足球")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();


    }

    @Test
    public void TestTypeBall_2() throws InterruptedException {

        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();

    }
    @Test
    public void TestTypeBall_3() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("android:id/button1")).click();

    }
    @Test
    public void TestTypeBall_4() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);

        //地点
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_address")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("红馆")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("android:id/button1")).click();
    }

    @Test
    public void TestTypeBall_5() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);

        //人数 3
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_num")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("3")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("android:id/button1")).click();
    }

    @Test
    public void TestTypeBall_6() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);

        //可见性 我关注的可见
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_visiblity")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("我关注的可见")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("android:id/button1")).click();
    }

    @Test
    public void TestTypeBall_7() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);

        //邀请  13165532297
        uiDevice.findObject(By.text("邀请")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_invite_search")).setText("13165532297");
        Thread.sleep(3000);
        uiDevice.findObject(By.text("搜索")).click();
        Thread.sleep(2000);
        uiDevice.pressBack();

    }
    @Test
    public void TestTypeBall_8() throws InterruptedException {
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_createagreement_type")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("篮球")).click();
        Thread.sleep(2000);
        //日期
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getData")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("2019")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
        //时间
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_getTime")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("上午")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.text("确定")).click();
        Thread.sleep(2000);

        //邀请  13165532297
        uiDevice.findObject(By.text("邀请")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_invite_search")).setText("1316553229700");
        Thread.sleep(2000);
        uiDevice.findObject(By.text("搜索")).click();
        Thread.sleep(2000);
        uiDevice.pressBack();
        uiDevice.pressBack();


    }

    @Test
    public void TestTypeBall_9() throws InterruptedException {
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tab_spec_main_time")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_main_football")).click();
        Thread.sleep(3000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_time_img")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_agreement_head")).click();
        Thread.sleep(2000);
        uiDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_homepage_follow")).click(); //点击关注
        uiDevice.pressBack();
        uiDevice.pressBack();
    }




}
