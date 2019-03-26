'''
Created on Jan 21, 2019

@author: USER NEW
'''
import json
from urllib.request import urlopen

from bs4 import BeautifulSoup


url = "https://www.google.com/"


html = urlopen(url)
soup = BeautifulSoup(html, 'lxml')
# print(soup)

type(soup)

title = soup.title
print(title)
# text = soup.get_text()


# soup.find_all('a')

# all_links = soup.find_all("a")
# for link in all_links:
#     print(link.get("href"))
#     
    
    
    
rows = soup.find_all('tr')
# test=json.dumps(rows)
# print(test)


 
for row in rows:
    row_td = row.find_all('td')
#     test=json.dumps(row_td)
#     print(test)
     
#print(row_td)
type(row_td)
 

 
str_cells = str(row_td)
cleantext = BeautifulSoup(str_cells, "lxml").get_text()
# print(cleantext)
        
      
      
      
      
    