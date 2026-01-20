package EstudosString.Practice;

public class nivelUmString {
  public static void main(String[] args){
    // 1 - Imprimir cada caractere da String
    // Dada uma string(Arroz), imprima cada caractere em uma linha.]
        String stringEntrada = "Arroz";
        char arrayChar[]= stringEntrada.toCharArray();
        for(char charOfArray : arrayChar){
          System.out.println(charOfArray);
        }

    System.out.println("\n");
    // 2 - Contar ocorrência de um caractere
    // Conte quantas vezes o caractere 'a' aparece na string. (Arroz)
        String stringEntrada2 = "Carapicuiba";
        int contadorDeA = 0;
        for(int i = 0; i< stringEntrada2.length(); i++){
          if(Character.toLowerCase(stringEntrada2.charAt(i)) == 'a'){
            contadorDeA = contadorDeA + 1;
          }
        }
        System.out.println(contadorDeA);

    System.out.println("\n");
    // 3 - Comparar duas strings
    //Retorne true se forem iguais sem usar ==
    String str1 = "Bomdia";
    String str2 = "Good Morning";
    
    System.out.println(str1.equals(str2));
    
    System.out.println("\n");    
    // 4 - Inverter uma string (2 versões) - Barueri
    // objetivo é salvar em uma variavel a string reversa
    
    // usando StringBuilder
    StringBuilder sB = new StringBuilder("Barueri");
    String saida = sB.reverse().toString();
    System.out.println(saida);
    
    // sem usar StringBuilder
    String stringParaInverter = "Barueri";
    char arrayStringEntrada[] = stringParaInverter.toCharArray();
    int tamanhoStringEntrada = stringParaInverter.length();
    char arrayStringSaida[] = new char[tamanhoStringEntrada];
    int contadorCorreto = 0;
    
    for(int contadorInverso = tamanhoStringEntrada - 1; contadorInverso >= 0; contadorInverso--){
      arrayStringSaida[contadorCorreto] = arrayStringEntrada[contadorInverso];
      contadorCorreto++;
    }
    
    String saidaInversa = new String(arrayStringSaida);
    System.out.println(saidaInversa);
    
    System.out.println("\n");
    // 5 - Substrings básicas
    // Dada "abcdef", gere:
    String entrada = "abcdef";
    // "abc"
    System.out.println(entrada.substring(0,3));
    // "cde"
    System.out.println(entrada.substring(2, 5));
    // "def"
    System.out.println(entrada.substring(3, 6));
  }
}
