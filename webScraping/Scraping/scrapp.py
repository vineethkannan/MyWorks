'''
Created on Jan 22, 2019

@author: USER NEW
'''


from bs4 import BeautifulSoup
import requests
from dis import Instruction


url = 'https://fcca204-h82ba8d74.dispatcher.us3.hana.ondemand.com/webapp/index.html#/adminEntity'
html_doc = requests.get(url).content
soup = BeautifulSoup(html_doc, 'html.parser')



recipe_container = soup.findAll()

print(recipe_container)
# 
# name = recipe_container.find('h1').get_text().strip()
# # print(name)
# 
# image = recipe_container.find('div', {'class': 'art_imgwrap'}).picture.img['src']
#         
# # print(image)
# 
# # ingredients        
# recipe_ingredients = recipe_container.find('div', {"class": "ingredients"})
# ingredients = [x.get_text().strip()
#                for x in recipe_ingredients.find_all('li')]
# # print(ingredients)
# # instructions
# recipe_method = recipe_container.find('div', {"class": "method"})
# instructions = [x.get_text().strip()
#                 for x in recipe_method.find_all('li')]
# 
# print(instructions)




