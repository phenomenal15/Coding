bool isSubsequence(char* s, char* t) {
    int j=0,k=0;
   int n=strlen(s);
    for(int i=0;i<strlen(t);i++)
    { if(s[j]==t[i])
      {
           j++;
           
    }
}
if(j==n)
return true;
else return false;
    
}