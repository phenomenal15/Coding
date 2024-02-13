int maxArea(int* height, int heightSize) {
    int min=0,max=0,ans=0,i=0,j=heightSize-1;
    while(i<j){
         if(height[i]>height[j]){
             min=height[j];   
         }
         else{
             min=height[i];
         }
         ans=min*(j-i);
         if(max<ans){
             max=ans;
         }
         if(height[i] < height[j]){
             i++;
         }
         else{
             j--;
         }

}
return max;
}