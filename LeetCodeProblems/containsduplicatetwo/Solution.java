package LeetCodeProblems.containsduplicatetwo;

// 219. Contains Duplicate II
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 0 <= k <= 105

//Solução

// Oque é e oque faz?
// Criar uma função que recebe um array de int e um k, a função deve verificar a distancia entra as repetições e validar se são menores e igual a k
// Qual a saída?
//  - verdadeiro para caso o numero target k não contenha duplicatas
//  - Falso para caso o numero target k tenha duplicatas no array
// Qual a entrada?
//  - um array de ints chamado num
//  - uma variavel chamada k
// Exemplos?
//  - nums = [1,2,3,1] e k = 3 será true
//  - nums = [1,2,1] e k = 1 será false
// Restrições
//  - tamanho máximo de array de entrada será de 1 a 100.000
//  - cada valor dentro de um buket do array pode variar de -1.000.000.000 a 1.000.000.000
//  - e o valor de k de 0 até 100.000
// Observações
//  - 
// Estratégia escolhida
//  - Neste problema eu poderia usar HashMap para mapear valor -> quantidade de vezes que aparece
//  - Tambem pode ser usado o HashSet pois ele não permite duplicações

import java.util.HashMap;
import java.math;

public class Solution {
  public static void main(String[] args){
    int[] nums = {1,2,3,1,2,3};
    int k = 2;
    boolean result = kDupeVerification(nums,k);
    System.out.println(result);
  }

  public static boolean kDupeVerification(int[] nums, int k){
    //iniciar o HashMap<Integer,Integer>
    HashMap<Integer,Integer> mapIndices  = new HashMap<>();
    //iterar sobre todo o nums
    for(int i = 0; i < nums.length; i++){
        //Caso um das diferenças sejam menores ou igual a k, retorna true
        if(mapIndices.containsKey(nums[i])){
          int diference = Math.abs((i - mapIndices.getOrDefault(nums[i], 0)));
          if(diference <= k){
            return true;
          }
        }
        //adicionar todos os valores no hash map com o indice e seu valor
        mapIndices.put(nums[i], i);
      } 
    //retorna false caso nenhuma satisfaça i-j < k 
    return false;     
  }
}