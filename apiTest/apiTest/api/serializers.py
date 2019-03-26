'''
Created on Mar 12, 2019

@author: USER NEW
'''
from rest_framework import serializers

from .models import Stock


class StockSerializer(serializers.ModelSerializer):
    
    
    
 class Meta:
    model=Stock 
      # fields=('FB','volume')
    fields='__all__' 

class Meta1:
       
  model=Stock 
  fields=("FB","volume","open")
       
