import pytest
from testcase.app import App

class TestNews():

    def setup_class(self):
        self.login_page = App.start()
        self.news_page = self.login_page.login_success("15231123391", "111111")

    # 进入搜索框
    def test_enter_search(self):
        self.news_page.enter_search()
        assert "全部" not in self.news_page.get_page_source()

    # 根据ID或者关键字搜索新闻（存在符合搜索内容的新闻，3条）
    @pytest.mark.parametrize("content",["1", "排超","3-0"])
    def test_search1(self,content):
        self.news_page.search_item(content)
        assert self.news_page.get_list_count()!=0

    # 根据ID或者关键字搜索新闻（不存在符合搜索内容的新闻，6条）
    @pytest.mark.parametrize("content1", ["0", "100", "-1"," ","太平洋","#￥&@"])
    def test_search2(self,content1):
        self.news_page.search_item(content1)
        assert self.news_page.get_list_count() == 0

    # 退出搜索框, 返回首页
    def test_exit_search(self):
        self.news_page.exit_search()
        assert "全部" in self.news_page.get_page_source()

    # 进入新闻详细界面
    def test_enter_news(self):
        self.news_page.enter_news()
        assert "关注" in self.news_page.get_page_source()

    # 新闻界面的操作：关注
    def test_concern_news(self):
        self.news_page.concern_news()
        assert "你已经关注了" in self.login_page.get_toast_txt()

    # def teardown_class(self):
    #     App.quit()
