package LeetCodeProblems.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class ConsolidSolution {
  public static void main(String[] args){
    int target = 10;
    int[] nums = {1,5,6,9};
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target){
    HashMap<Integer,Integer> hashmap = new HashMap<>();
    int complemento;
    int[] result = new int[2];
    for(int i = 0; i < nums.length; i++){
      complemento = target - nums[i];
      if(hashmap.containsKey(complemento)){
        result[0] = hashmap.get(complemento);
        result[1] = i;
        break;
      }
      hashmap.put(nums[i], i);
    }
    return result;
  }
}
