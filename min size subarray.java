Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

class Solution {
    public void backtrack(int index,int [] candidates,int target,List<Integer> result,List<List<Integer>> finalRes ){
     // base case 
    // System.out.println(result);
     if(target == 0){
        List<Integer> newArray=new ArrayList(result);
        finalRes.add(newArray);
       // System.out.println(finalRes);
        return;
     }
     if(target < 0){
        return;
     }
     for(int i=index;i< candidates.length;i++){
                  result.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],result,finalRes);
            result.remove(result.size()-1);//backtrack
     }
   } 
    public int minSubArrayLen(int target, int[] nums) {
         List<List<Integer>> finalOutput=new ArrayList(); 
           backtrack(0,nums,target,new ArrayList(),finalOutput);
           int min=Integer.MAX_VALUE;
           if(finalOutput.size() == 0)
           return 0;
           for(int i=0;i<finalOutput.size();i++)
           { min=Math.min(min,finalOutput.get(i).size());

           }
           return min;
    }
}



