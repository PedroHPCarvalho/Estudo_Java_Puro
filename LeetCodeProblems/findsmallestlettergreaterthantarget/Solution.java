// Oque vai ser construido e oque deve fazer?
//     - Construir uma função que recebe um array de chars e retorna o menor caractere em letter, o maior lexicograficamente falando, se nâo existir retornar o primeiro caractere de letter
// Qual a entrada?
//     - array letters com um array de chars e o char target
// Qual a saída?
//     - A saida é o char menor caractere, ou no caso do target não existir retoranr o primeiro caractere de letter
// Exemplos?
//     - letters = ["c","f","j"], target = "a" a saída é "c" por "a" não existir e "c" ser o primeiro
//     - letters = ["c","f","j"], target = "c" a saída é "f" por ser o menor caractere em seguida, o maior lexicograficmente
// Restrições
//     - o array letter terá tamanho de 2 a 10000
//     - cada elemento de letter minusculo e em ingles
//     - ordenado de forma não decrescente
//     - letter deve conter alguma variação de char
//     - target minusculo e em ingles 
// Observaçoes
// Estrategia escolhida
// Eficiencia máxima, usar arrays pre-definidos para diminuir complexidade o(n) e ganhar tempo 

public class Solution {
  public static void main(String[] args){
    char[] teste = {'l','e','t','t','e','r'};
    char target = 'l';
    System.out.println(smallestTarget(teste, target));
  }

  public static char smallestTarget(char[] letters, char target){
    int[] scoreboard = new int[26];
    for (char charOfLetter : letters){
      int locInScoreboard = charOfLetter - 'a';
      scoreboard[locInScoreboard] += 1;
    }
    // // Caso o target não exista
    // if(scoreboard[target - 'a'] == 0){
    //   int differenceOfA = letters[0] - 'a';
    //   char resultChar = (char) ('a' + differenceOfA);
    //   return resultChar;
    // }
    for(int index = (target - 'a') + 1; index < scoreboard.length; index++ ){
      if(scoreboard[index] != 0){
        int positionInArray = 97 + index;
        char resultChar = (char) (positionInArray);
        return resultChar;
      }
    }
      return letters[0];
  }
}
