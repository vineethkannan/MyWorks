from django.http import HttpResponse
from django.shortcuts import render
import requests 
from requests.models import Response
from rest_framework import response

from rest_framework.views import APIView


# Create your views here.
API_ENDPOINT ="https://endpoint3.collection.us2.sumologic.com/receiver/v1/http/ZaVnC4dhaV0cHtBdlfnwkmg3Q_p116752321XvoV0JF33rjs7dTzX-HFKUuLxo0ZGhQakoc8ZaSwzhq2d69OdDOg7vJTDIqmyu5Lke27a_AGC8lu4bNQeg=="
API_KEY = "2dMTuHyUuOBOV2YqciQFtoAvR9cDRAe3W6pZqqPZCeouiTLcKzPyuGu2fnuHq7sI"


 


print("print_1")
#create new stock    

# class SumoTest(APIView):
#     
#     def post(self,request):
#      print("print")
#      
#     data = {'api_dev_key':API_KEY, 
#         'api_option':'paste',
#         'api_paste_format':'python'} 
#     
#     
#     # sending post request and saving response as response object 
#     r = requests.post(url = API_ENDPOINT, data = data)
#     pastebin_url = r.text 
#     print("The pastebin URL is:%s"%pastebin_url) 





def posting(request):
    print("print")
    data = {'api_dev_key':API_KEY, 
            'api_option':'paste',
            'api_paste_format':'python'} 
         
         
    # sending post request and saving response as response object 
    r = requests.post(url = API_ENDPOINT, data = data)
    pastebin_url = r.text 
    print("The pastebin URL is:%s"%pastebin_url) 
    return Response({'message': 'Processing JSON '})