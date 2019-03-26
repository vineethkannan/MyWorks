'''
Created on Feb 4, 2019

@author: USER NEW
'''
from selenium import webdriver
import unittest
import HtmlTestRunner

class googleSearch(unittest.TestCase):
    
    @classmethod
    def setUpClass(self):
        self.driver=webdriver.Chrome(executable_path=r'C:\Users\USER NEW\Downloads\chromedriver_win32/chromedriver.exe')


    def Login(self): 
        self.driver.get("https://fcca204-vjcvocskfp.dispatcher.us3.hana.ondemand.com/index.html")  
        
        self.driver.find_element_by_id("__xmlview0--uid-inner").send_keys("QA2")
        self.driver.find_element_by_id("__xmlview0--pasw-inner").send_keys("abcd1234")
        self.driver.find_element_by_xpath("//bdi[@id='__button0-BDI-content']").click()
     
    def Admin(self):
        self.driver.find_element_by_class_name('HomeIcon_MyView sapMBarChild sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer').click()
          

        
        
    
    @classmethod
    def tearDownClass(cls):
     cls.driver.close()
     cls.driver.quit()
      



if __name__ == '__main__':
    unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output='D:\Vineeth\selenium_testing\webScraping\Report'))
    
    
    