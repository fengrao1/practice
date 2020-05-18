
from selenium.webdriver.common.by import By

from page.main_page import MainPage
from page.base_page import BasePage
import time

class LoginPage(BasePage):

    _phone_locator=(By.ID,"com.example.lenovo.enjoyball:id/et_login_phone") #手机号
    _password_locator = (By.ID, "com.example.lenovo.enjoyball:id/et_login_pwd")#密码
    _btnsubmit_locator = (By.ID, "com.example.lenovo.enjoyball:id/bt_login_lg") #登录按钮
    _toast_locator=(By.XPATH,"//*[@class='android.widget.Toast']")

    def login(self,phone,password):
        user_phone = self.find_element(self._phone_locator)
        user_phone.send_keys(phone)
        user_password = self.find_element(self._password_locator)
        user_password.send_keys(password)
        time.sleep(3)
        # submit = self.find_element(self._btnsubmit_locator).click()
        submit = self.find_element(self._btnsubmit_locator)
        submit.click()

        # submit = self.find_element(self._btnsubmit_locator)
        # submit.click()

    def login_success(self,phone,password):
        self.login(phone,password)
        return MainPage(self.driver)

    def login_fail(self, phone, password):
        self.login(phone, password)
        return self

    def get_toast_txt(self):
        return self.find_element(self._toast_locator).text

    def get_current_activity(self):
        return self.driver.current_activity



