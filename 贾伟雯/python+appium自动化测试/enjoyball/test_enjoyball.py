from appium import webdriver
import time
class TestEnjoyBall():

    @classmethod
    def setup_class(self):
        print("初始化dirver")
        cap = {"platformName": "Android",
               "deviceName": "GBG5T19620003914",
               "appPackage": "com.example.lenovo.enjoyball",
               "appActivity": "com.example.lenovo.Activity.LoginActivity",
               "noReset": True
               }
        self.driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", cap)
        self.driver.implicitly_wait(10)
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("18330919107")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456")
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    @classmethod
    def teardown_class(self):
        print("退出dirver")
        self.driver.quit()

    # 1.修改用户名
    def test_change_name(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        mydata = self.driver.find_element_by_xpath("//*[@text='我的资料']")
        mydata.click()
        mydataname = self.driver.find_element_by_xpath("//*[@text='用户名']")
        mydataname.click()
        newname = self.driver.find_element_by_xpath("//*[@text='输入您的新用户名']")
        newname.send_keys("jiaweiwen")
        change = self.driver.find_element_by_xpath("//*[@text='修改']")
        change.click()
        time.sleep(10)

    # 2.修改性别
    def test_change_sex(self):
        sex = self.driver.find_element_by_xpath("//*[@text='性别']")
        sex.click()
        mansex = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_dialog_perinfo_man")
        mansex.click()

        time.sleep(10)

    # 3.修改年龄
    def test_change_age(self):
        age = self.driver.find_element_by_xpath("//*[@text='年龄']")
        age.click()
        agesecret = self.driver.find_element_by_xpath("//*[@text='保密']")
        agesecret.click()
        time.sleep(10)

    # 4.修改城市
    def test_change_city(self):
        city = self.driver.find_element_by_xpath("//*[@text='城市']")
        city.click()
        time.sleep(10)

    # 5.修改手机号
    def test_change_phone(self):
        phone = self.driver.find_element_by_xpath("//*[@text='手机号']")
        phone.click()
        time.sleep(10)

    # 6.修改邮箱
    def test_change_email(self):
        email = self.driver.find_element_by_xpath("//*[@text='邮箱']")
        email.click()
        newemail = self.driver.find_element_by_xpath("//*[@text='输入您的新邮箱']")
        newemail.send_keys("18731179963@163.com")
        change = self.driver.find_element_by_xpath("//*[@text='修改']")
        change.click()
        time.sleep(10)

    # 7.修改个性签名
    def test_change_note(self):
        note = self.driver.find_element_by_xpath("//*[@text='个性签名']")
        note.click()
        newnote = self.driver.find_element_by_xpath("//*[@text='编辑您的个人签名']")
        newnote.send_keys("18731179963@163.com")
        change = self.driver.find_element_by_xpath("//*[@text='修改']")
        change.click()
        time.sleep(10)

    # 8.会员
    def test_kaitong_vip(self):
        vip = self.driver.find_element_by_xpath("//*[@text='会员']")
        vip.click()
        time.sleep(10)

    # 9.约球
    def test_playball(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        playball = self.driver.find_element_by_xpath("//*[@text='约球']")
        playball.click()
        time.sleep(10)

    # 10.查看收藏
    def test_shoucang(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        shoucang = self.driver.find_element_by_xpath("//*[@text='收藏']")
        shoucang.click()
        time.sleep(10)

    # 11.查看会员
    def test_vip(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        vip = self.driver.find_element_by_xpath("//*[@text='会员']")
        vip.click()
        time.sleep(10)

    # 12.提交反馈
    def test_fankui(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        fankui = self.driver.find_element_by_xpath("//*[@text='反馈']")
        fankui.click()
        writeret =self.driver.find_element_by_xpath("//*[@text='请详尽描述要反馈的问题，方便帮您更快速的处理']")
        writeret.send_keys("hey")
        pull = self.driver.find_element_by_xpath("//*[@text='提交']")
        pull.click()
        time.sleep(10)

    # 13.注销账号
    def test_zhuxiao(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        zhuxiao = self.driver.find_element_by_xpath("//*[@text='注销']")
        zhuxiao.click()
        time.sleep(10)

    # 14.查看信息
    def test_CKxinxi(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        touxiang = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait")
        touxiang.click()
        xinxi = self.driver.find_element_by_xpath("//*[@text='信息']")
        xinxi.click()
        time.sleep(10)

    # 15.查看评论
    def test_CKcomment(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        touxiang = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait")
        touxiang.click()
        comment = self.driver.find_element_by_xpath("//*[@text='评论']")
        comment.click()
        time.sleep(10)

    # 16.查看关注
    def test_CKfollow(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        touxiang = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait")
        touxiang.click()
        follow = self.driver.find_element_by_xpath("//*[@text='关注']")
        follow.click()
        time.sleep(10)

    # 17.查看粉丝
    def test_CKfan(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        touxiang = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_portrait")
        touxiang.click()
        fan = self.driver.find_element_by_xpath("//*[@text='粉丝']")
        fan.click()
        time.sleep(10)

    # 18.查看积分
    def test_score(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        score = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_scores")
        score.click()
        time.sleep(10)

    # 19.查看评论2
    def test_comment(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        comment = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_comment")
        comment.click()
        time.sleep(10)

    # 20.查看关注2
    def test_follow(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        follow = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_follow")
        follow.click()
        time.sleep(10)

    # 21.查看粉丝2
    def test_fans(self):
        image = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_main_portrait")
        image.click()
        fans = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_personalcenter_fans")
        fans.click()
        time.sleep(10)
