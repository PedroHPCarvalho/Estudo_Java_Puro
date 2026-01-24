package LeetCodeProblems.intersection_twoarrays;

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000.

import java.util.HashSet;
import java.util.Arrays;

public class ConsolidSolution {
  public static void main(String[] args) {
    int[] numA = {1,2,3,4}; 
    int[] numB = {2,4,4,7,5};
    System.out.println(Arrays.toString(intersectionValidation(numA, numB)));

  }

  public static int[] intersectionValidation(int[] numA, int[] numB){
    HashSet<Integer> firstSet = new HashSet<>();
    HashSet<Integer> validationSet = new HashSet<>();
    for(int num: numA){
      firstSet.add(num);
    }
    for(int num: numB){
      if(firstSet.contains(num)){
        validationSet.add(num);
      }
    }
    int[] returnArray = new int[validationSet.size()];
    int index = 0;
    for(int num : validationSet){
      returnArray[index] = num;
      index++;
    }
    return returnArray;
  }
}
