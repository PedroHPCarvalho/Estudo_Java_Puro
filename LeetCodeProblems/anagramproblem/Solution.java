package LeetCodeProblems.anagramproblem;

import java.util.Arrays;

class Solution {
    public static void main(String[] args){
        isAnagram("abcz", "abc");
    }

    public static void isAnagram(String s, String t) {
        // Etapa 1, inicializar um array de int de tamanho 26, vai ser o scoreboard de frequencia de caracteres do alfabeto
        int[] scoreboard = new int[26];
        // Etapa 2, iterar sobre a string de entrada s e fazer a adição no frequency array
        for(int i = 0; i < s.length(); i++){
            //Aqui preciso fazer
                //descobrir o caractere e sua posição no array
                char charOfS = s.charAt(i);
                int posScore = charOfS - 'a';
                //Adição de +1 na respectiva posição
                scoreboard[posScore] += 1;
        }
        System.out.println(Arrays.toString(scoreboard));
        // Etapa 3, iterar sobre a string de entrada t e fazer a subtracao no frequency array
        for(int j = 0; j < t.length(); j++){
            //Aqui preciso fazer
              //descobrir o caractere e sua posição no array scoreboard
              char charOfT = t.charAt(j);
              int posScoreT = charOfT - 'a';
              //Subtrair -1 na posição
              scoreboard[posScoreT] -= 1;
        }
        System.out.println(Arrays.toString(scoreboard));
        // Etapa 4, iterar sobre as 26 posições
        for(int h = 0; h < scoreboard.length; h++){
            if(scoreboard[h] != 0){
              System.out.println("deu ruim");
              break;
            }
        } 
        System.out.println("Deu BOM");
            //caso algum indice seja diferente de 0, são diferentes = false
            //caso todos sejam 0, então são iguais = true
        
    }
}


// Oque é?
//  Devo construir uma Função que verifica se uma string é anagrama de outra e retorna true, caso não sejam, retorna false
// Qual a entrada?
//  A string s a qual é a referencia, e a string t que é a setring a ser comparada
// Qual a saída?
// - true se confirmar anagrama
// - false se não for anagrama
// Exemplos?
//  dada as entradas s = rat, t = tar defina se é um anagrama, sendo assim true
// Restrições
//  Entrada máxima de 50.000 caracteres
//  o esperado são apenas letras de a-z em ingles
// Observações relevantes
//  - A ordem é irrelevante por ser um anagrama
//  - Sempre devem ser letras minusculas
// Estratégia de Solução
//  - Para esse problema é necessário usar soluções de CONTAGEM DE FREQUENCIA, pois a composição importa
//  - Usar a tabela ASCII onde cada caractere é um numero, consigo obter qual a posição do caractere no alfabeto pois a é 97 e subtraindo valores de b em diante conseguimos extrair a posição exata de qual caractere no alfabeto
//  - Com essa informação posso adicionar o valor a cada caractere localizado em um array de 26 posições (0-25) 
//  - Por ultimo vamos percorrer o array verificando se as 26 posições são 0

// Oque é um anagrama
//  anagrama é uma palavra formada apartir de outra, com suas letras organizadas em uma ordem diferente



// Possivel solução: sistema de pontuação e comparação, posso iterar sobre as duas listas, buscando um caractere na outra, e caso todos os pontos sejam atingidos (o tamanho da entrada sendo o target e a cada iteração se soma um ponto até iterar sobre tudo e descobrir se uma corresponde a outra).
// Por que essa falharia: em entradas altas pode acabar sendo muito lenta