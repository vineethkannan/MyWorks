
import unittest
import datetime
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

class PythonOrgSearch(unittest.TestCase):

     

    def setUp(self):
        self.driver = webdriver.Chrome()
        
    def PythonOrgSearch(self):
        ts = datetime.datetime.now().timestamp()
        self.driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
        uname = self.driver.find_element_by_id("identifierId")
        uname.send_keys("aswini@actionfi.com")
        self.driver.find_element_by_xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]").click()
        time.sleep(2)
        uname1 = self.driver.find_element_by_name("password")
        uname1.send_keys("$4Aswini")
        self.driver.find_element_by_xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]").click()
        time.sleep(2)
      
        self.driver.find_element_by_xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div").click()
        time.sleep(2)
        to = self.driver.find_element_by_name("to")
        to.send_keys("rajeesh@actionfi.com")
        time.sleep(2)
        subject = self.driver.find_element_by_name("subjectbox")
        subject.send_keys("test two")
        send_btn = self.driver.find_elements_by_xpath("//*[contains(text(), 'Send')]")
        
        
        # message.send_keys("20")
        # message1 = self.driver.find_element_by_id("sum2")
        # message1.send_keys("20")
        # self.driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button').click()
        # display_message=self.driver.find_element_by_id("displayvalue")
        # assert display_message.text=="40"
        
        #time.sleep(5)


    def tearDown(self):
        self.driver.close()

if __name__ == "__main__":
    unittest.main()
