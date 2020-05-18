from appium import webdriver
import os
import pytest
import time
from appium.webdriver.common.touch_action import TouchAction
from selenium.webdriver.remote.webdriver import WebDriver
from page.base_page import BasePage
from selenium.webdriver.common.by import By

class MainPage(BasePage):

    _ball_action=(By.ID,"com.example.lenovo.enjoyball:id/tab_spec_main_time")  #约球键
    _add_team=(By.ID,"com.example.lenovo.enjoyball:id/fab_demand_add")#创建队伍
    _type_ball_btn = (By.ID, "com.example.lenovo.enjoyball:id/sp_createagreement_type")  # 类型
    _OK_btn=(By.XPATH,"//*[@text='确定']")#确定
    _invite_btn = (By.XPATH, "//*[@text='邀请']")  #邀请
    _btn_basketball = (By.XPATH,"//*[@text='篮球']")
    _btn_data_list = (By.ID, "com.example.lenovo.enjoyball:id/tv_getData")
    _btn_data = (By.XPATH,"//*[@text='2019']")
    _btn_time_list = (By.ID, "com.example.lenovo.enjoyball:id/tv_getTime")
    _btn_time = (By.XPATH,"//*[@text='上午']")
    _btn_affirm = (By.ID, "android:id/button1")
    _btn_address = (By.ID,"com.example.lenovo.enjoyball:id/sp_createagreement_address")
    _btn_address_text = (By.XPATH,"//*[@text='白馆']")
    _btn_number = (By.ID,"com.example.lenovo.enjoyball:id/sp_createagreement_num")
    _btn_number_text = (By.XPATH,"//*[@text='3']")
    _btn_invitation = (By.XPATH, "//*[@text='邀请']")
    _invitation_search = (By.ID,"com.example.lenovo.enjoyball:id/et_invite_search")


    def type_ball(self):
        self.find_element(self._ball_action).click()
        self.find_element(self._add_team).click()
        self.find_element(self._type_ball_btn).click()
        time.sleep(5)
        self.find_element(self._btn_basketball).click()
        time.sleep(5)
        self.find_element(self._OK_btn).click()


    def time_ball(self):
        # self.find_element(self._ball_action).click()
        # self.find_element(self._add_team).click()
        self.find_element(self._type_ball_btn).click()
        self.find_element(self._btn_basketball).click()
        time.sleep(5)
        self.find_element(self._btn_data_list).click()
        self.find_element(self._btn_data).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_time_list).click()
        time.sleep(2)
        self.find_element(self._btn_time).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_affirm).click()

    def address_ball(self):
        self.find_element(self._type_ball_btn).click()
        self.find_element(self._btn_basketball).click()
        time.sleep(5)
        self.find_element(self._btn_data_list).click()
        self.find_element(self._btn_data).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_time_list).click()
        time.sleep(2)
        self.find_element(self._btn_time).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_address).click()
        time.sleep(2)
        self.find_element(self._btn_address_text).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_affirm).click()

    def number_ball(self):
        self.find_element(self._type_ball_btn).click()
        self.find_element(self._btn_basketball).click()
        time.sleep(5)
        self.find_element(self._btn_data_list).click()
        self.find_element(self._btn_data).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_time_list).click()
        time.sleep(2)
        self.find_element(self._btn_time).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_number).click()
        time.sleep(2)
        self.find_element(self._btn_number_text).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_affirm).click()

    def invitation_ball(self):
        self.find_element(self._type_ball_btn).click()
        self.find_element(self._btn_basketball).click()
        time.sleep(5)
        self.find_element(self._btn_data_list).click()
        self.find_element(self._btn_data).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_time_list).click()
        time.sleep(2)
        self.find_element(self._btn_time).click()
        time.sleep(2)
        self.find_element(self._OK_btn).click()
        time.sleep(2)
        self.find_element(self._btn_invitation).click()
        time.sleep(2)
        invite_text = self.find_element(self._invitation_search)
        invite_text.click()
        time.sleep(2)
        invite_text.send_keys("13165532297")
        time.sleep(2)
        self.driver.find_element_by_xpath("//*[@text='搜索']").click()




