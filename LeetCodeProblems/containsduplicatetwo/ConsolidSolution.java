package LeetCodeProblems.containsduplicatetwo;

import java.util.HashMap;

public class ConsolidSolution {
  public static void main(String[] args){
    int[] nums = {1,1,3,3};
    int k = 3;
    System.out.println(validKDiference(nums, k));
  }

  public static boolean validKDiference(int[] nums, int k){
    HashMap<Integer,Integer> hashmap = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      if (hashmap.containsKey(nums[i])){
          int dif = i - hashmap.getOrDefault(nums[i], 0);
          if(dif <= k){
            return true;
          }
      }
      hashmap.put(nums[i],i);
    }
    return false;
  }
}
