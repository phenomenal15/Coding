Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.



import java.util.*;
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
            backtrack(i,candidates,target-candidates[i],result,finalRes);
            result.remove(result.size()-1);//backtrack
     }
   } 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> finalOutput=new ArrayList(); 
            backtrack(0,candidates,target,new ArrayList(),finalOutput);
            return finalOutput;
    }
}




                      []
                    (7)
                    / | \ \
                  /   |   \ \
                /     |    \ \
              /       |     \ \
           [2]       [3]    [6] [7]
          (5)       (4)    (1)  (0) <- Valid combination: [7]
         / | \       / \     
       /   |   \    /   \    
     /     |    \  /     \
   [2,2] [2,3] [2,6] [3,3] [3,6]  
   (3)   (2)   (3)  (1)   (-3) <- Stop (target < 0)
   / | \    |     
 [2,2,2]  [2,3]
   (1)    (-1) <- Stop (target < 0)
   /    
 [2,2,2,2] <- Stop (target < 0)
 (-1) <- Stop (target < 0)
 / | \   
