from appium import webdriver
from appium.webdriver.webdriver import WebDriver

from pages.login_page import LoginPage

#初始化driver，关闭driver
class App():
    driver:WebDriver=None

    @classmethod
    def start(cls):
        cap = {"platformName": "Android",
               "deviceName": "6a50ace1",
               "appPackage": "com.example.lenovo.enjoyball",
               "appActivity": "com.example.lenovo.Activity.LoginActivity",
               "noReset": True

               }
        cls.driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", cap)
        cls.driver.implicitly_wait(10)
        return LoginPage(cls.driver)

    @classmethod
    def quit(cls):
        cls.driver.quit()