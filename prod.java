class  prod {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {ans[i]=1;
            for(int j=0;j<nums.length;j++)
        if(j!=i)
            ans[i]*=nums[j];
        }
        return ans;
    }
}