'''
Created on Dec 12, 2018

@author: USER NEW
'''
import unittest
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

class test01(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Chrome()

    def test01(self):
        driver = self.driver
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html")
        mess = driver.find_element_by_id("sum1")
        mess.send_keys('125')
        mess1 = driver.find_element_by_id("sum2")
        mess1.send_keys('15')
        total = driver.find_element_by_xpath("html/body/div[2]/div/div[2]/div[2]/div[2]/form/button").click()
        new1 = driver.find_element_by_id("displayvalue")
        assert new1.text == '140'
        time.sleep(5)

if __name__ == "__main__":
    unittest.main()