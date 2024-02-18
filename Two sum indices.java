class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k=0;
        int out[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
       {
            for(int j=i+1;j<nums.length;j++)
        { if( nums[i]+nums[j]==target)
                {out[k++]=i;
                    out[k++]=j;   
                             }
          
          }
       }
    
  return out;  }
}
