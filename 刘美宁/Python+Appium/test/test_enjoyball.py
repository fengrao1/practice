from appium import webdriver
import os
import pytest
import time
from appium.webdriver.common.touch_action import TouchAction
from selenium.webdriver.remote.webdriver import WebDriver



from test.app import App

class TestEnjoyBall():

    def setup_class(self):
        self.login_page = App.start()
        self.main_page = self.login_page.login_success("13165532297", "123456")

    def test_type_ball(self):
        # self.main_page = self.login_page.login_success("13165532297", "123456")
        self.main_page.type_ball()
        time.sleep(5)

    def test_data_time(self):
        # self.main_page = self.login_page.login_success("13165532297", "123456")
        self.main_page.time_ball()
        time.sleep(5)

    def test_number_ball(self):
        self.main_page.number_ball()
        time.sleep(5)

    def test_address_ball(self):
        self.main_page.address_ball()
        time.sleep(5)

    def test_invitation_ball(self):
        self.main_page.invitation_ball()
        time.sleep(5)

    def teardown_class(self):
        App.quit()
