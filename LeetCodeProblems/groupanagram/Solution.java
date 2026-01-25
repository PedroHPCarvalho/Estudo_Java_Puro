
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static void main(String[] args) {
      System.out.println(groupAnagrams(new String[]{"Pedro","drope","ana"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
      //Meu objetivo é descobrir os grupos de anagramas entre as strings
      //Para isso eu poderia descobrir a constituição de cada uma das strings e armazenar atrelando 
      // a constituiçao a String Constituição->String, e depois eu poderia usar a constituição para agrupar

      //Vamos começar instanciando a estrutura Hash que vai armazenar o Codigo e um array com as strings que usam o mesmo codigo
      HashMap<String,ArrayList<String>> grouped = new HashMap<>();
      for(String str : strs){
        String code = generateStringCode(constitution(str));
        if(!grouped.containsKey(code)){
          grouped.putIfAbsent(code, new ArrayList<>());
        }

        grouped.get(code).add(str);
      }
      List<List<String>> finalArray = new ArrayList<>(grouped.values());
      return finalArray;
      
    }

    public static HashMap<Character,Integer> constitution(String stringEntry){
      //Esta função tem como objetivo obter os dados da constituição da string, ira retornar um HashMap com letra -> Quantidade da string
      String lowString = stringEntry.toLowerCase();
      HashMap<Character,Integer> constitutionMap = new HashMap<>();
      for(char charOfString : lowString.toCharArray()){
        constitutionMap.put(charOfString, constitutionMap.getOrDefault(charOfString, 0) + 1);
      }
      return constitutionMap;
    }

    public static String generateStringCode(HashMap<Character,Integer> constitutionMap){
      //Esta função tem o objetivo de gerar a StringCode da constituição do HashMap
      //Antes de pensar em iterar sobre o HashMap, precisamsos de uma maneira de fazer a leitura do hashmap de forma ordenada
      //Vou pegar um KeySet e ordenar
      StringBuilder code = new StringBuilder();
      ArrayList<Character> ordenedKeys = new ArrayList();

      for(char key: constitutionMap.keySet()){
        ordenedKeys.add(key);
      }
      int index = 0;
      Collections.sort(ordenedKeys);
      while (index < constitutionMap.size()){
        Character key = ordenedKeys.get(index);
        int value = constitutionMap.get(key);
        code.append(key).append(value);
        index++;
      }
      return code.toString();
    }
}

// Oque deve ser desenvolvido e qual o objetivo?
//  - Função/Método que recebe um array de strings e agrupa as strings por grupos de anagramaas
// Saida
// - Um array de arrays de string [["assim"],["mesmo"]]
// Entrada
// - Array de String
// Exemplos
// - Dado o array de Strings ["bat","tab","eat"] o resultado esperado é [["bat",tab],["eat"]]
// Observações
// - A ordem do array do retorno é irrelenvante
// Restrições
// - Os arrays de strings de entrada pode ter um tamanho de até 10.000
// - Cada elemento do array pode ter no maximo 100 de tamanho
// - Elementos vão sempre vão ser em ingles e letra minuscula
// Estrategia escolhida
// Erros 