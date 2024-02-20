class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0,rsum=0,i,k;
        for(i=0;i<nums.length;i++)
        { lsum=0;
        rsum=0;
            if(i==0)
            {lsum=0;
                  k=i;
                  k=k+1;
              while(k<nums.length)
              { 
                  rsum+=nums[k++];
              }
            }
            

            else if(i==nums.length-1)
            {
                rsum=0;
                k=i;
                k=k-1;
              while(k>-1)
              {
                  lsum+=nums[k--];
              }
            }

            else
            {  k=i;
             k=k-1;
              while(k>-1)
              {
                  lsum+=nums[k--];
              }
                k=i;
                 k=k+1;
              while(k<nums.length)
              {
                  rsum+=nums[k++];
              }
            }

              if(lsum==rsum)
            {
            return i;
            }
        }
 return -1; }
}