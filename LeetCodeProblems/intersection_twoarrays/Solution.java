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
// 0 <= nums1[i], nums2[i] <= 1000

//------------Solução----------

// Oque estou construindo e oque deve fazer?
// - Estou construindo uma função/método que deve retornar um array com as interseções de dois arrays
// Qual a saida?
// - Um array com os valores de intersecção
// Qual a entrada?
// - Dois arrays de entrada
// Exemplos?
// - dado o arrayA = [1,2,3] e o arrayB = [2,4,5] o resultado será [2]
// Observações?
// - Os elementos do array final não levam em considerção repetições, são unicos
// - O array final tem que estar ordenado de forma asc
// Restrições?
// - os tamanhos do arrays devem ser menor que 1000 bukkets
// - Cada bukket tem tamanho maximo de 1000
// Qual estratégia escolhida?
// - Por não pode ter termos repetidos e ainda manter performance, vou optar por utilizar HashSets
// Meus Erros?

import java.util.Arrays;
import java.util.HashSet;



public class Solution {
  public static void main(String[] args){
    int[] numsA = {1,2,3,4,5};
    int[] numsB = {1,4,5,8,9};
    System.out.println(Arrays.toString(returnIntersections(numsA, numsB)));
  }

  public static int[] returnIntersections(int[] numsA, int[] numsB){
    //Instanciar o HashSet, que servira de memória para armazenar os valores encontrados
    HashSet<Integer> intersectionSet = new HashSet<>(); 
    HashSet<Integer> finalTest = new HashSet<>(); 
    //Iterar sobre o nums1 e armazernar os valores no set
    for(int num : numsA){
      intersectionSet.add(num);
    }
    System.out.println(intersectionSet);
    //Iterar sobre o num2 subtraindo os valores que ele não contenha do hash, a ideia é ficar apenas os valores que existem nos 2 arrays
    for(int num2 : numsB){
      if(intersectionSet.contains(num2)){
        finalTest.add(num2);
      }
    }
    System.out.println(intersectionSet);
    //Antes de retornar, precisamos transformar o hashSet em um array ordanado de forma crescente
    int[] finalArray = new int[finalTest.size()];
    int index = 0;
    for(int num: finalTest){
      finalArray[index++] = num;
    }
    Arrays.sort(finalArray);
    return finalArray;
  }
}
