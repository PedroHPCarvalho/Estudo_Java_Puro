package LeetCodeProblems.anagramproblemupgrade;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

//===========SOLUÇÃO===============

// Oque estou construindo e oque isso deve fazer?
//  - Estou construindo uma função (método) que consiga identificar anagramas
// Qual a saída?
//  - A saída deve ser um valor booleano:
//  - Verdadeiro caso seja um anagram
//  - Falso caso não seja identificado um anagrama
// Qual a entrada?
//  - A entrada deve ser duas Strings
// Exemplos?
//  - Input -> s = "anagram" e t = "nagaram" output = true
//  - Input -> s = "bom" e t = "dia" output = false
// Restrições
//  - As entradas das Strings s e t podem ter tamanho de 1 a 50.000
//  - Strings sempre são em caixa baixa e palavras em ingles
// Observações
//  - Ordem é irrelevante em anagramas
//  - A constituição da String importa
// Estratégias
//  - Visando evoluir em performance e Qualidade comparada a ultima solução, será utilizado HashMap

import java.util.HashMap;

public class Solution {
  public static void main(String[] args){
    System.out.println(isAnagram("anagram","nagaram"));
  }

  public static boolean isAnagram(String s, String t){
    // Instancio o HashMap que será utilizado como scoreboard
    HashMap<Character,Integer> scoreboard = new HashMap<>();
    // Vamos iterar sobre a string s para ADICIONAR valores no scoreboard
    for(int i = 0; i < s.length(); i++){
      char charNow = s.charAt(i);
      scoreboard.put(charNow, scoreboard.getOrDefault(charNow, 0) + 1);
    }
    // Vamos iterar sobre a string t para SUBTRAIR os valores do scoreboard, ira retirar daquelas que encontrar, oque não for igual não entra na conta
    for(int j = 0; j < t.length(); j ++){
      char charNow = t.charAt(j);
      scoreboard.put(charNow, scoreboard.getOrDefault(charNow, 0) - 1);
    }
    // Logo caso depois de SUBTRAIR, se todos os indices não forem 0, não é um anagrama
    for(int value : scoreboard.values()){
      if(value != 0){
        return false;
      }
    }
    return true;
  }
}
