package LeetCodeProblems.twosum;

import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.



// Oque é?
//  - Função que observa um target e utiliza termos dentro do array de entrada para chegar a soma dos termos no target
// Qual a entrada?
//  - Um array com os valores e um int sendo o target a chegar
// Qual a saída?
//  - Retorna os indices necessários no array para chegar a soma
// Restrições
//  - Entrada do nums é até 100.000 indices
//  - Valor de cada indice é -1.000.000.000 e 1.000.000.000
//  - target é entre -1.000.000.000 e 1.000.000.000
//  - Sempre existe uma solução
// Observações
// Estratégia adotada
//  - Visando performance, utilizar HashMap para asossiar chave->valor indice->valor

public class Solution {
  public static void main(String[] args){
      int[] nums = {3,3};
      System.out.println(Arrays.toString(twoSum(nums, 6)));

  }

  public static int[] twoSum(int[] nums, int target) {
        // Criação do HashMap(Equivalente a um Dicionário), onde colocamos chave->valor; sendo indice->valor
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int complement;
        int[] result = new int[2];
        // Iterar sobre o array de entrada
        for(int i = 0; i <= nums.length - 1; i++){
            complement = target - nums[i];
            if(!hashmap.containsKey(complement)){
                hashmap.put(nums[i],i);
            } else {
                result[0] = hashmap.get(complement);
                result[1] = i;
                break;
            }
        }
        return result;
    }

}
