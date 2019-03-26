from django.shortcuts import get_object_or_404
from django.shortcuts import render
from rest_framework import status
from rest_framework.response import Response
from rest_framework.views import APIView

from .models import Stock
from .serializers import StockSerializer


# Create your views here.
class StockList(APIView):
    
#list of all stocks    
    def get(self,request):
       stocks=Stock.objects.all() 
       print(stocks)
       serializer = StockSerializer(stocks,many=True)
       print(serializer)
       return Response(serializer.data)
   
   
   
   
#create new stock    
    def post(self,request, format=None):
        
        
        serializer = StockSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
    #data=request.data