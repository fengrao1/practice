package com.example.lenovo.enjoyball;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

public class Enjoyball {
    Instrumentation instrumentation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException {
        instrumentation= InstrumentationRegistry.getInstrumentation();
        //获得连接设备
        mDevice=UiDevice.getInstance(instrumentation);
        //按键home
        mDevice.pressHome();

        //判断是否锁屏
        boolean status=mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
            //也可以用滑动方法解锁
            //  mDevice.swipe()
        }
    }

    @Test
    public void enjoyballLogin() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
//            UiObject2 obj=mDevice.findObject(By.desc("新建待办事项"));
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        // mDevice.findObject(new UiSelector().resourceId()).setText("1");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    //  1.修改用户名
    @Test
    public void change_name() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(6000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("用户名")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_perinfo_nickname")).setText("jiaweiwen");
        mDevice.findObject(By.text("修改")).click();
        Thread.sleep(3000);
    }

    //  2.修改性别
    @Test
    public void change_sex() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("性别")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_dialog_perinfo_man")).click();
        Thread.sleep(3000);
    }

    //  3.修改年龄
    @Test
    public void change_age() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("年龄")).click();
        mDevice.findObject(By.text("保密")).click();
        Thread.sleep(3000);
    }

    //  4.修改城市
    @Test
    public void change_city() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("城市")).click();
        Thread.sleep(3000);
    }

    //  5.修改手机号
    @Test
    public void change_phone() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("手机号")).click();
        Thread.sleep(3000);
    }

    //  6.修改邮箱
    @Test
    public void change_Email() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("年龄")).click();
        mDevice.findObject(By.text("输入您的新邮箱")).setText("18330919107@163.com");
        mDevice.findObject(By.text("修改")).click();
        Thread.sleep(3000);
    }

    //  7.修改个性签名
    @Test
    public void change_note() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("个性签名")).click();
        mDevice.findObject(By.text("编辑您的个人签名")).setText("hi");
        mDevice.findObject(By.text("修改")).click();
        Thread.sleep(3000);
    }

    //  8.开通会员
    @Test
    public void change_VIP() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("我的资料")).click();
        mDevice.findObject(By.text("开通会员")).click();
        Thread.sleep(3000);
    }

    //  9.约球
    @Test
    public void play_ball() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("约球")).click();
        Thread.sleep(3000);
    }

    //  10.收藏
    @Test
    public void shoucang() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
    }

    //  11.会员
    @Test
    public void VIP() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("会员")).click();
    }

    //  12.反馈
    @Test
    public void feedback() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("反馈")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_feedback_write")).setText("jiaweiwen");
        mDevice.findObject(By.text("提交")).click();
        Thread.sleep(3000);
    }

    //  13.注销
    @Test
    public void zhuxiao() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(3000);
    }

    //  14.积分
    @Test
    public void score() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_personalcenter_scores")).click();
        Thread.sleep(3000);
    }

    //  15.评论
    @Test
    public void comment() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_personalcenter_comment")).click();
        Thread.sleep(3000);
        mDevice.pressBack();
    }

    //  16.关注
    @Test
    public void follow() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_personalcenter_follow")).click();
        Thread.sleep(3000);
        mDevice.pressBack();
    }

    //  17.粉丝
    @Test
    public void fan() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_personalcenter_fans")).click();
        Thread.sleep(3000);
    }

    //  18.查看信息
    @Test
    public void perinfo() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_homepage_perinfo")).click();
        Thread.sleep(3000);
    }
    //  19.查看评论
    @Test
    public void comment2() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_homepage_comment")).click();
        Thread.sleep(3000);
    }

    //  20.查看关注
    @Test
    public void follow2() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_homepage_follow")).click();
        Thread.sleep(3000);
    }

    //  21.查看粉丝
    @Test
    public void fan2() throws InterruptedException {
        mDevice.findObject(By.text("玩个球")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_phone")).setText("18330919107");
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/et_login_pwd")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/iv_main_portrait")).click();
        mDevice.findObject(By.res("com.example.lenovo.enjoyball:id/tv_homepage_fans")).click();
        Thread.sleep(3000);
    }
}
