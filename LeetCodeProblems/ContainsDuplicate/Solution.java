package LeetCodeProblems.ContainsDuplicate;

import java.util.HashSet;

public class Solution {
  public static void main(String[] args){
    int[] teste = {1,2,3,4,1};
    System.out.println(containsDuplicate(teste));
   
  }

  public static boolean containsDuplicate(int[] nums) {
    //Inicializar HashSet, ele é importado da biblioteca java.util.HashSet
    // HashSet só funciona com tipos de referência (objetos), não com tipos primitivos (como int, double, boolean).

    // Tipos Primitivos (não funcionam em HashSet)
    // int, double, float, long, short, byte, boolean, char
    // São valores simples armazenados na memória

    // Tipos de Referência (funcionam em HashSet)
    // Qualquer classe, incluindo Integer, String, Double

    // São objetos que "apontam" para dados na memória
     HashSet<Integer> hash = new HashSet<>();

        //for each sobre o array enums
        for(int num : nums){
        // caso contenha o index atual retorna true
        if (hash.contains(num)){
            return true;
        }
        // adiciona um dado no hash caso não seja duplicata
        hash.add(num);
        }
        //retorna false pois não tem duplicacao
        return false;
    }
}


//Oque é?
// Método que retorna true caso em um array de numero exista duplicidade de valores, ja retorna true na primeira incidencia, caso contrario retorna false

//Qual a entrada?
// A entrada é um array int chamado nums

//Qual a saída?
//  - true = contem duplicatas
//  - false = não contem duplicatas

//Exemplos
//  - dado um array int [1,2,3,1] a saida é true
//  - dado um array int [1,2,3] a saida é false

//Restrições
// - Entradas até 100.000
// - Variações podem ir de -1B a 1B

//Oque caracteriza duplicidade?
// Duplicidade é caracterizada quando existe dois caracteres iguais em um array
// Estratégia Escolhida
// HashSet - HashSet é uma estrutura de dados que armazena valores sem repetição, usando uma função hash para permitir 
// busca, inserção e verificação em tempo constante O(1) na média.