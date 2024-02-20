class Solution {
    public int largestAltitude(int[] gain) { 
        int h[]=new int[gain.length+1];
        h[0]=0;
        int m=h[0];
        for(int i=1,j=0;i<gain.length;i++,j++)
        {
             h[i]=h[i-1] + gain[j];  
        }
        for(int i=0;i<h.length;i++)
        {
            m=Math.max(m,h[i]);
        }
  return m;
    }
}