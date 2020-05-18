from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webdriver import WebDriver

class BasePage():
    _white_list=[(By.ID,"tips"),(By.ID,"tips2")]

    def __init__(self, driver: WebDriver):
        self.driver = driver

    def find_element(self,locator):
        print(locator)
        try:
            return self.driver.find_element(*locator)
        except:
            self.handle_exception()
            return self.driver.find_element(*locator)



    def handle_exception(self):
        for locator in self._white_list:
            print(locator)
            elements=self.driver.find_elements(*locator)
            if len(elements)>=1:
                elements[0].click()
            else:
                print("%s not found %s",str(locator))
            #
            # page_source=self.driver.page_source
            # if "tips1" in page_source:
            #     self.driver.find_element(*locator).click()
            # elif "tips2" in page_source:
            #     pass
            #

    def find_element_and_click(self,locator):
        print("click")
        return self.driver.find_element(locator).click()