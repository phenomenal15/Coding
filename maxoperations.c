

int maxOperations(int* nums, int n, int k){
int c=0;
for(int i=0;i<n;i++)
{  for(int j=i+1;j<n;j++)
    { if(nums[i]>nums[j])
      {int t=nums[i];
      nums[i]=nums[j];
      nums[j]=t;
      }
    }
}

int i=0;
int j=n-1;
while(i<j)
{
    if(nums[i]+nums[j]==k)
    {c++;
     i++;
     j--;
    }
    else  
    {if(nums[i]+nums[j]<k)
    i++;
    else 
    j--;

    }
}
return c;

}