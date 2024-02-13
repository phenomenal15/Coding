bool canPlaceFlowers(int* a, int size,int n)
    {int i=0;

    
        while(i<size-2)
    {if(a[i]==1 && a[i+2]==0)
     {a[i+2]=1;  
      i=i+2;
      n--;
     if(n==0)
     return true;
     }
     else 
     i++;
     
    }
     return false;  
     }