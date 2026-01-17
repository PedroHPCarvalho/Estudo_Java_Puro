package LeetCodeProblems.ContainsDuplicate;

import java.util.HashSet;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

// Example 2:

// Input: nums = [1,2,3,4]

// Output: false

// Explanation:

// All elements are distinct.

// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]

// Output: true

 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

public class ConsolidSolution {
  public static void main(String[] args){
    int[] nums = {1,2,3,4,5};
    boolean exit = containsDuplicate(nums);
    System.out.println(exit);
  }

  public static boolean containsDuplicate(int nums[]){
    HashSet<Integer> hashNum = new HashSet<>();
    for(int num : nums){
      if(hashNum.contains(num)){
        return true;
      }
      hashNum.add(num);
    }
    return false;
  }
}
