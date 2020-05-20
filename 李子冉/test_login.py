from appium import webdriver
import time

class TestEnjoyBallLogin():

    @classmethod
    def setup_class(self):
        print("初始化dirver")
        cap = {"platformName": "Android",
               "deviceName": "2db4e0f9",
               "appPackage": "com.example.lenovo.enjoyball",
               "appActivity": "com.example.lenovo.Activity.LoginActivity",
               "noReset": True
               }
        self.driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", cap)
        self.driver.implicitly_wait(10)

    @classmethod
    def teardown_class(self):
        print("退出dirver")
        self.driver.quit()

    #1、登录移动手机账号
    def test_login1(self):
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("15227989218")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456789")
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    # 2.登录联通手机账号
    def test_login2(self):
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("15632112815")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456789")
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    # 3.登录电信手机号码
    def test_login3(self):
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("18033888690")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456789")
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    # 4.登录未注册的手机号码
    def test_login4(self):
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("18022331144")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456789")
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    # 5.显示密码
    def test_login5(self):
        passname = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_phone")
        passname.send_keys("15227989218")
        password = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_login_pwd")
        password.send_keys("123456789")
        eyes=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_login_eye")
        eyes.click()
        btn = self.driver.find_element_by_xpath("//*[@text='登录']")
        btn.click()
        time.sleep(10)

    # 6.注册账号
    def test_register1(self):
        register = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_register")
        register.click()
        register_phone= self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_phone")
        register_phone.send_keys("15034064893")
        register_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_code")
        register_code.send_keys("1234")
        register_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_pwd")
        register_pwd.send_keys("123456789")
        register_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_register_register")
        register_btn.click()
        time.sleep(10)

    # 7.注册账号时密码是否可以全英文
    def test_register2(self):
        register = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_register")
        register.click()
        register_phone = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_phone")
        register_phone.send_keys("18988992233")
        register_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_code")
        register_code.send_keys("1234")
        register_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_pwd")
        register_pwd.send_keys("liziran")
        register_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_register_register")
        register_btn.click()
        time.sleep(10)

        # 8.注册账号时密码是否可以全英文
        def test_register2(self):
            register = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_register")
            register.click()
            register_phone = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_phone")
            register_phone.send_keys("18988992233")
            register_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_code")
            register_code.send_keys("1234")
            register_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_pwd")
            register_pwd.send_keys("liziran")
            register_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_register_register")
            register_btn.click()
            time.sleep(10)

        # 9.注册账号时密码是否可以超过最多12位的位数
        def test_register3(self):
            register = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_register")
            register.click()
            register_phone = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_phone")
            register_phone.send_keys("15532048632")
            register_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_code")
            register_code.send_keys("1234")
            register_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_register_pwd")
            register_pwd.send_keys("1234567890123")
            register_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_register_register")
            register_btn.click()
            time.sleep(10)

        #10.忘记密码
        def test_forget(self):
            forget=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_forget")
            forget.click()
            forget_phone = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_phone")
            forget_phone.send_keys("15227989218")
            forget_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_code")
            forget_code.send_keys("1234")
            forget_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_pwd")
            forget_pwd.send_keys("123456")
            forget_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_forget_changecode")
            forget_btn.click()
            time.sleep(10)

        #11.显示修改后的密码
        def test_forget_eye(self):
            forget=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/tv_login_forget")
            forget.click()
            forget_phone = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_phone")
            forget_phone.send_keys("15227989218")
            forget_code = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_code")
            forget_code.send_keys("1234")
            forget_pwd = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/et_forget_pwd")
            forget_pwd.send_keys("123456789")
            forget_eye = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/iv_forget_eye")
            forget_eye.click()
            forget_btn = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/btn_forget_changecode")
            forget_btn.click()
            time.sleep(10)













