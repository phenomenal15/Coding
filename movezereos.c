void moveZeroes(int* nums, int numsSize) {
    int t=0,j=0;
    int a[20]={0};
    for(int i=0;i<numsSize; i++)
 {   if(nums[i]==0)
     t++;
    else
     a[j++]=nums[i];
}
     while(t<0)
     {
         a[j++]=0;
         t--;
     }

printf("The new array :");
for(int i=0;i<numsSize;i++)
nums[i]=a[i];
for(int i=0;i<numsSize;i++)
printf("%d",nums[i]);
    
}