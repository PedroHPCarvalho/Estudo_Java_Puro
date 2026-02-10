package EstudosString.Practice;

public class NivelDoisString {
  public static void main(String[] args){
    // 1  Transformar uma String em outra, deixando elas iguais com a remoção de um char (mesmo problema do HackerHank)
    //str1 = "abcba"
    //str2 = "abba"
    // a 1 tem que se tornar igual a 2

    String str1 = "abcba"; 
    String str2 = "abba";

    //Transformar str1 em str2
    //Problema de dois ponteiros, é necessário percorrer as duas strings ao mesmo tempo, para descobrir as diferenças
    //Provavelmente criar uma StringBuilder, para ir inserindo de acordo com a passagem do ponteiro que observa a str1 baseado na str 2
    //Prever casos de null, ou uma string invalida, ambos retornar como -1
    // a b x b a
    // a b b a
    int ponteiroI = 0;
    int ponteiroJ = 0;
  }
}
