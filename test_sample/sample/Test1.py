


from selenium import webdriver
import HTMLTestRunner
import HtmlTestRunner
import time
import unittest
class DjangoTest(unittest.TestCase):
     

    # This method is invoked when test case start.
    def setUp(self):
        # Create the Firefox browser when test case setup.
        self. browser = webdriver.Chrome(executable_path=r'C:\Users\USER NEW\Downloads\chromedriver_win32/chromedriver.exe')

    # This method is invoked when test case complete.    
    def tearDown(self):
        # Close and quit the Firefox browser when test case tear down.
        self.browser.quit()

    # This is the test method.    
    def testHomePage(self):
        # Get Django home page.
        self.browser.get('http://127.0.0.1:8000/')
        # Sleep 10 seconds to wait for the page load.
        time.sleep(10)
        # Assert whether the web page title contains word Djangl or not.
       # self.assertIn("Djangl", self.browser.title, 'Browser title do not contains Django')
   
suite = unittest.TestLoader().loadTestsFromTestCase(DjangoTest)
unittest.TextTestRunner(verbosity=2).run(suite)

outfile = open("/Documents", "w")
 
runner = HTMLTestRunner.HTMLTestRunner(
stream=outfile,title='Test Report',description='This demonstrates the report output by Prasanna.Yelsangikar.')
 
#testRunner = HtmlTestRunner.HTMLTestRunner("/Documents", "w")
#         
# 
# if __name__ == '__main__':
#  # Runn all test case function.
#   unittest.main(testRunner)    
#     
