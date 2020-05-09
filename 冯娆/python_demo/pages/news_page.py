from pages.base_page import BasePage
from selenium.webdriver.common.by import By

class MainPage(BasePage):

    _btn_content = (By.ID, "com.example.lenovo.enjoyball:id/et_main_search")
    _edit_content = (By.ID, "com.example.lenovo.enjoyball:id/et_search_search")
    _btn_search = (By.ID, "com.example.lenovo.enjoyball:id/iv_search_search")
    _btn_people = (By.ID, "com.example.lenovo.enjoyball:id/iv_search_back")
    _btn_concern = (By.ID, "com.example.lenovo.enjoyball:id/btn_news_attention")
    _btn_comment = (By.ID, "com.example.lenovo.enjoyball:id/ed_news_commentContent")

    _btn_publish_comment = (By.ID, "com.example.lenovo.enjoyball:id/iv_news_releaseComment")
    _btn_collect_news = (By.ID, "com.example.lenovo.enjoyball:id/iv_news_collect")
    _btn_remindWho_news = (By.ID, "com.example.lenovo.enjoyball:id/iv_news_remindWho")

    # 进入搜索框
    def enter_search(self):
        self.find_element(self._btn_content).click()

    # 根据ID或者关键字搜索新闻
    def search_item(self,content):
        self.find_element(self._edit_content).clear()
        self.find_element(self._edit_content).send_keys(content)
        self.find_element(self._btn_search).click()

    # 退出搜索框
    def exit_search(self):
        self.find_element(self._btn_people).click()

    # 进入新闻详细界面
    def enter_news(self):
       self.get_list_item().click()

    # 新闻界面的操作：关注
    def concern_news(self):
        self.find_element(self._btn_concern).click()

    def get_list_count(self):
        list_view = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/lv_search_news")
        list_items = list_view.find_elements_by_class_name("android.widget.LinearLayout")
        item_len = len(list_items)
        return item_len

    def get_list_item(self):
        list_view = self.driver.find_element_by_id("com.example.lenovo.enjoyball:id/lv_home_news")
        list_items = list_view.find_elements_by_class_name("android.widget.LinearLayout")
        return list_items[1]

    def get_page_source(self):
        return self.driver.page_source






