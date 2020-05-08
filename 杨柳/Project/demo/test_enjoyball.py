import time

from appium import webdriver
import pytest

from appium.webdriver.common.touch_action import TouchAction

class Test_EnjoyBall():
    def setup_class(self):
        print("初始化driver")
        cap = {"platformName": "Android",
               "deviceName": "2GXDU19923010881",
               "appPackage": "com.example.lenovo.enjoyball",
               "appActivity": "com.example.lenovo.Activity.LoginActivity",
               "noReset": True
               }
        self.driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", cap)
        # 隐式等待：服务器端查询
        self.driver.implicitly_wait(10)

    # def teardown_class(self):
    #     print("退出driver")
    #     self.driver.quit()

    @pytest.fixture(scope="class", autouse=True)
    def test_login(self):
        phone=self.driver.find_element_by_id("et_login_phone")
        phone.send_keys("17370226893")
        password=self.driver.find_element_by_id("et_login_pwd")
        password.send_keys("123456")
        submit=self.driver.find_element_by_id("bt_login_lg")
        submit.click()

        # toast=self.driver.find_element_by_xpath("//*[@class='android.widget.Toast']").text
        # print(toast)


    # 按照球类查询约球信息
    def test_search(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("tv_main_football").click()
        self.driver.find_element_by_id("tv_main_basketball").click()
        self.driver.find_element_by_id("tv_main_volleyball").click()
        self.driver.find_element_by_id("tv_main_badminton").click()
        self.driver.find_element_by_id("tv_main_tabletennis").click()
        self.driver.find_element_by_id("tv_main_topall").click()

    # 点击约球列表第一个
    def test_list_first(self):
        list_view=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/lv_time_demand")
        list_items = list_view.find_elements_by_class_name("android.widget.LinearLayout")
        list_items[0].click()
        self.driver.press_keycode(4)

    # 点击约球列表第一个 并申请加入
    def test_join(self):
        list_view=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/lv_time_demand")
        list_items = list_view.find_elements_by_class_name("android.widget.LinearLayout")
        list_items[0].click()
        self.driver.find_element_by_xpath("//*[@text='虚位以待']").click()
        self.driver.find_element_by_id("android:id/button1").click()

        assert "请不要重复提交申请" in \
               self.driver.find_element_by_xpath("//*[@class='android.widget.Toast']").text
        self.driver.press_keycode(4)

    #点击我的界面进入约球
    def test_yueqiu(self):
        self.driver.find_element_by_id("iv_main_portrait").click()
        time.sleep(3)
        self.driver.find_element_by_id("ll_personalcenter_yueqiu").click()
        self.driver.press_keycode(4)
        self.driver.press_keycode(4)

    # 点击自己创建的队伍并申请加入
    def test_join_my(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("tv_main_tabletennis").click()

        list_view=self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/lv_time_demand")
        list_items = list_view.find_elements_by_class_name("android.widget.LinearLayout")
        list_items[0].click()
        self.driver.find_element_by_xpath("//*[@text='虚位以待']").click()

        assert "不能加入自己的队伍" in \
               self.driver.find_element_by_xpath("//*[@class='android.widget.Toast']").text
        self.driver.press_keycode(4)
        time.sleep(3)

    # 添加当前时间的约球
    def test_add_data(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='足球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间之前的约球
    def test_add_before(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='足球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间之后的约球
    def test_add_after(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='足球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        self.driver.find_element_by_xpath("//*[@text='6']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间 红馆的约球
    def test_add_place(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='排球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 地点
        self.driver.find_element_by_id("sp_createagreement_address").click()
        self.driver.find_element_by_xpath("//*[@text='红馆']").click()

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)

    # 添加当前时间 人数为4的约球
    def test_add_number(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='排球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 地点
        self.driver.find_element_by_id("sp_createagreement_address").click()
        self.driver.find_element_by_xpath("//*[@text='白馆']").click()

        # 人数
        self.driver.find_element_by_id("sp_createagreement_num").click()
        self.driver.find_element_by_xpath("//*[@text='4']").click()

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间 人数为4 添加我想说的约球
    def test_add_say(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='排球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 地点
        self.driver.find_element_by_id("sp_createagreement_address").click()
        self.driver.find_element_by_xpath("//*[@text='白馆']").click()

        # 人数
        self.driver.find_element_by_id("sp_createagreement_num").click()
        self.driver.find_element_by_xpath("//*[@text='4']").click()

        # 我想说
        self.driver.find_element_by_id("et_createagreement_say").click()
        self.driver.find_element_by_id("et_createagreement_say").send_keys("加油")
        self.driver.press_keycode(4)

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间 邀请人加入的约球
    def test_add_invite1(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='排球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 邀请
        self.driver.find_element_by_id("btn_createagreement_invite").click()
        self.driver.find_element_by_id("et_invite_search").click()
        self.driver.find_element_by_id("et_invite_search").send_keys("15833552353")
        self.driver.find_element_by_id("tv_invite_search").click()
        self.driver.find_element_by_id("tv_searchresult_invite").click()
        self.driver.find_element_by_id("android:id/button1").click()
        self.driver.press_keycode(4)
        time.sleep(3)
        self.driver.press_keycode(4)
        self.driver.press_keycode(4)

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "你收到了一个新的约球邀请" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)


    # 添加当前时间 邀请人加入的约球
    def test_add_invite2(self):
        self.driver.find_element_by_id("img_main_time").click()
        self.driver.find_element_by_id("fab_demand_add").click()
        self.driver.find_element_by_id("sp_createagreement_type").click()
        self.driver.find_element_by_xpath("//*[@text='排球']").click()
        self.driver.find_element_by_id("tv_getData").click()

        # 日期
        list_view = self.driver.find_element_by_id("android:id/pickers")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_xpath("//*[@text='5']").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 时间
        self.driver.find_element_by_id("tv_getTime").click()
        list_view = self.driver.find_element_by_id("android:id/timePickerLayout")
        list_items = list_view.find_elements_by_class_name("android.widget.NumberPicker")
        list_items[1].find_element_by_class_name("android.widget.Button").click()
        self.driver.find_element_by_id("btn_bottomsheetdialog_OK").click()

        # 邀请
        self.driver.find_element_by_id("btn_createagreement_invite").click()
        self.driver.find_element_by_id("et_invite_search").click()
        self.driver.find_element_by_id("et_invite_search").send_keys("158335523")
        self.driver.find_element_by_id("tv_invite_search").click()
        self.driver.press_keycode(4)
        self.driver.press_keycode(4)

        self.driver.find_element_by_id("btn_createagreement_OK").click()
        self.driver.find_element_by_id("android:id/button1").click()
        assert "约球队伍创建成功" in \
               self.driver.find_element_by_xpath("/hierarchy/android.widget.Toast").text
        self.driver.press_keycode(4)

if __name__ == '__main__':
    pytest.main(["-s","test_enjoyball.py::Test_EnjoyBall"])

