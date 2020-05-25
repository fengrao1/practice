package com.example.test_enjoyball;


import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseTest {
    Instrumentation instrumentation;
    UiDevice mDevice;

    @Before
    public void startup() throws RemoteException, InterruptedException {
        instrumentation= InstrumentationRegistry.getInstrumentation();
        //获得连接设备
        mDevice=UiDevice.getInstance(instrumentation);
        //按键home
        mDevice.pressHome();

        //判断是否锁屏
        boolean status=mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }

    }


    public boolean createTeam(String pic,String tname,String tsl,String ball) throws InterruptedException {
        Thread.sleep(3000);
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("17731026303");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/bt_login_lg")).click();
        Thread.sleep(6000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        Thread.sleep(6000);
        mDevice.findObject(By.text("队伍")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_create")).click();
        Thread.sleep(2000);
        if (pic.equals("none")) {
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_team_create_fixture")).click();
            Thread.sleep(2000);
            mDevice.findObject(By.text(ball)).click();
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_team_create_name")).setText(tname);
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_team_create_slogan")).setText(tsl);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_create_save")).click();
            Thread.sleep(2000);



        }
        else {
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_team_create_logo")).click();
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.android.gallery3d:id/ic_public_arrow_right")).click();//相机
            Thread.sleep(2000);
            mDevice.findObject(By.desc(pic)).click();
            Thread.sleep(2000);
            mDevice.findObject(By.desc("确定")).click();
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/sp_team_create_fixture")).click();
            Thread.sleep(2000);
            mDevice.findObject(By.text(ball)).click();
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_team_create_name")).setText(tname);
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_team_create_slogan")).setText(tsl);
            Thread.sleep(2000);
            mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_create_save")).click();
            Thread.sleep(2000);
        }
        if (mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_create_save")).isEnabled()){
            return  false;
        }
        else {
            return true;
        }

   }

   @Test
    public void testCreate1()throws InterruptedException{
        boolean result=createTeam("图片1, 2020年5月5日下午12:30","OK1","go","足球");
       Assert.assertTrue(result);
   }
    @Test
    public void testCreate2()throws InterruptedException{
        boolean result=createTeam("none","OK2","go","足球");
        Assert.assertTrue(result);
    }

    @Test
    public void testCreate3()throws InterruptedException{
        boolean result=createTeam("图片1, 2020年5月5日下午12:30","OK3","go","篮球");
        Assert.assertTrue(result);
    }
    @Test
    public void testCreate4()throws InterruptedException{
        boolean result=createTeam("图片5, 2020年3月21日下午8:11","OK4","go","足球");
        Assert.assertTrue(result);
    }
    @Test
    public void testCreate5()throws InterruptedException{
        boolean result=createTeam("图片1, 2020年5月5日下午12:30","","go","足球");
        Assert.assertTrue(result);
    }

    @Test
    public boolean edit1() throws InterruptedException {
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_team_setting")).click();
        Thread.sleep(3000);
        if (mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_create_save")).isEnabled()){
            return  false;
        }
        else {
            return true;
        }
    }

    @Test
    public void edit2(){
        mDevice.findObject(By)
    }
    public boolean dissolve(String tname) throws InterruptedException {
        mDevice.findObject(By.text(tname)).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/btn_team_detail_dissolve")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("android:id/button1")).click();
        Thread.sleep(6000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        Thread.sleep(6000);
        mDevice.findObject(By.text("队伍")).click();
        Thread.sleep(2000);
        if ( mDevice.findObject(By.text(tname)).isEnabled()){
            return false;
        }
        return true;
    }
    @Test
    public void dissolveTeam()throws InterruptedException {
        boolean result=dissolve("OK1");
        Assert.assertTrue(result);
    }

}
