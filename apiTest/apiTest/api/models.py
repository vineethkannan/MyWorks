from django.db import models


# Create your models here.
class Stock(models.Model):
    FB = models.CharField(max_length=10)
    open = models.FloatField()
    close =models.FloatField()
    volume =models.IntegerField()
    class meta:
        db_table = "Stock"    
    
    
    
def __str__(self):
    return self.FB