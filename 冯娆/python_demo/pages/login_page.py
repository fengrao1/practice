from selenium.webdriver.common.by import By
from pages.news_page import MainPage
from pages.base_page import BasePage


class LoginPage(BasePage):

    _userphone_locator=(By.ID,"com.example.lenovo.enjoyball:id/et_login_phone")
    _password_locator = (By.ID, "com.example.lenovo.enjoyball:id/et_login_pwd")
    _btnsubmit_locator = (By.ID, "com.example.lenovo.enjoyball:id/bt_login_lg")
    _toast_locator=(By.XPATH,"//*[@class='android.widget.Toast']")

    def login(self,userphone,password):
        user_phone = self.find_element(self._userphone_locator)
        user_phone.send_keys(userphone)
        user_password = self.find_element(self._password_locator)
        user_password.send_keys(password)
        self.find_element(self._btnsubmit_locator).click()

    def login_success(self,userphone,password):
        self.login(userphone,password)
        return MainPage(self.driver)

    # def login_fail(self, userphone, password):
    #     self.login(userphone, password)
    #     return self

    def get_toast_txt(self):
        return self.find_element(self._toast_locator).text

    def get_current_activity(self):
        return self.driver.current_activity




