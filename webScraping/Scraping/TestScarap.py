'''
Created on Jan 18, 2019

@author: USER NEW
'''

import csv
import urllib.request

from bs4 import BeautifulSoup


# # specify the url and get element details
urlpage =  'http://nycs4hanadev.actionfi.com:8000/sap/bc/ui5_ui5/ui2/ushell/shells/abap/FioriLaunchpad.html?sap-client=002&sap-language=EN#Shell-home/'
 
 
# query the website and return the html to the variable 'page'
page = urllib.request.urlopen(urlpage)
# parse the html using beautiful soup and store in variable 'soup'
soup = BeautifulSoup(page, 'html.parser')
 
print(soup)

#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# find results within table
table = soup.find('table', attrs={'class': 'tableSorter'})
results = table.find_all('tr')
print('Number of results', len(results))

# create and write headers to a list 

rows = []

rows.append(['Rank', 'Name', 'Description', 'Location', 'Year end', 'Annual sales rise over 3 years', 'Sales £000s', 'Staff', 'Comments'])

print(rows)






