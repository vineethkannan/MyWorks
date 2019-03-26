'''
Created on Jan 18, 2019

@author: USER NEW
'''
import csv
import urllib.request

from bs4 import BeautifulSoup
from django.http import request
import requests


# # specify the url and get element details
# urlpage =  'https://www.w3schools.com/'
 
r = requests.get('https://api.github.com/events')
t=r.headers
print(t)

# query the website and return the html to the variable 'page'
# page = urllib.request.urlopen(urlpage)
# parse the html using beautiful soup and store in variable 'soup'
# soup = BeautifulSoup(page, 'html.parser')
 
# print(soup)

#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# find results within table
# table = soup.find('table', attrs={'class': 'tableSorter'})
# results = table.find_all('tr')
# print('Number of results', len(results))

# create and write headers to a list 
# 
# rows = []
#  
# rows.append(['Rank', 'Name', 'Description', 'Location', 'Year end', 'Annual sales rise over 3 years', 'Sales �000s', 'Staff', 'Comments'])
#  
# print(rows)

#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


# loop over results
# for result in results:
#     # find all columns per result
#     data = result.find_all('td')
#     # check that columns have data 
#     if len(data) == 0: 
#         continue

