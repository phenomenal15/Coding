class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int size= nums1.length + nums2.length;
      int mer[]=new int[size];
      double m;
        for(int i=0;i<nums1.length;i++)
        {
            mer[i]=nums1[i];
        }
         for(int i=nums1.length,j=0;i<nums1.length + nums2.length;i++,j++)
        {
            mer[i]=nums2[j];
        }
        Arrays.sort(mer);
            if(mer.length%2==0)
            {
                m= (( mer[(mer.length/2)-1] +mer[mer.length/2])/2.0);
             return m;}
        else
        {
            return mer[mer.length/2];
        } 

    }
}
