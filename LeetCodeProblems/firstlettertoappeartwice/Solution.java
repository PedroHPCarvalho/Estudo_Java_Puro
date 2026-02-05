// Given a string s consisting of lowercase English letters, return a primeira carta a aparecer duas vezes.

// Note:

// A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
// s will contain at least one letter that appears twice.
 

// Example 1:

// Input: s = "abccbaacz"
// Output: "c"
// Explanation:
// The letter 'a' appears on the indexes 0, 5 and 6.
// The letter 'b' appears on the indexes 1 and 4.
// The letter 'c' appears on the indexes 2, 3 and 7.
// The letter 'z' appears on the index 8.
// The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
// Example 2:

// Input: s = "abcdd"
// Output: "d"
// Explanation:
// The only letter that appears twice is 'd' so we return 'd'.
 

// Constraints:

// 2 <= s.length <= 100
// s consists of lowercase English letters.
// s has at least one repeated letter.

//----------------RESOLUÇÃO-------------------

//Oque vou construir e oque deve fazer?
// - O método deve trazer o PRIMEIRO caractere que se repete duas vezes
//Entradas
// - uma string
//Saidas
// - o caractere que se repetiu primeiro duas vezes
//Exemplos
// - entra s = "aabcde" a saida será "a"
//Restricoes
// - s parte de tamanho 2 a 100
// - s sempre sera em caixa baixa e ingles
// - s tera pelo menos uma repeticao
//Observacoes
//Estrategia

public class Solution {
  public static void main(String[] args){
    String teste = "acabcc";
    System.out.println(firstRepeatedCharacterOld(teste));
    System.out.println(firstRepeatedCharacterNew(teste));
  }

  public static char firstRepeatedCharacterOld(String stringToValidate){
    char actualChar = '\0';
    for (char letter : stringToValidate.toCharArray()){
      if (actualChar == '\0'){
        actualChar = letter;
        continue;
      }
      if(letter == actualChar){
        return letter;
      }
      actualChar = letter;
    }
    return '\0';
  }

  public static char firstRepeatedCharacterNew(String s){
    int[] scoreboardLetters = new int[26];
    for(char letter : s.toCharArray()){
      int position = letter - 'a';
      scoreboardLetters[position] += 1;
      if(scoreboardLetters[position] == 2){
        return letter;
      }  
    }
    return '\0';
  }
}
