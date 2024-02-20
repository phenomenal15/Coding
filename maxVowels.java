class Solution {
    public int maxVowels(String s, int k) {
        String str=s.substring(0,k);
        int c=0;
       for(int i=0;i<k;i++) 
       { if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
            c++;
       }
       int max=c;
       for(int i=k;i<s.length();i++)
       { c=0;
       str=s.substring(i-k+1,i+1);
       System.out.println(str);
      for(int j=0;j<k;j++) 
        { if(str.charAt(j) == 'a' || str.charAt(j)== 'e' || str.charAt(j)== 'i' || str.charAt(j)== 'o' || str.charAt(j)== 'u')
             c++;
        }
       max=Math.max(max,c);
      

       }
       return max;
    }
}