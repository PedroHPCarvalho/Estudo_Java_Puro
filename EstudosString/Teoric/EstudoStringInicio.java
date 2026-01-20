package EstudosString.Teoric;
import java.util.Arrays;

public class EstudoStringInicio{
  // Vamos iniciar o estudo da classe String em Java
  // Oque é uma String?
  // String são uma cadeia(ou array) de Caracteres, por exemplo a palavra hello é uma string constituida assim ['h','e','l','l','o'] 
  // String pode ser convertida em: char data[] = ['h','e','l','l','o']
  // String pode ser convertida em char[] usando toCharArray() 
  // Strings são imutáveis, qualquer alteração cria um novo string
  // Strings são OBJETOS, assim possuem métodos com diversas funções como: 
  // + examinar um elemento(char) individualmente
  // + comparar strings(sequencias de char)
  // + procurar por strings 
  // + extrair substrings 
  // + transformar strings(maiusculos e minusculos)
  // Java possui um operador espeficio pra concatenar Strings(+)
  // Passar um argumento nulo para um construtor ou método dessa classe String causara NullPointerExecption
  // toda String é um unicode, que é um codigo universal para aquele simbolo, a classe Java e auxiliares permitem a interação com esses textods
  
  // StringBuilder (SB)
  // SB é mutável, podendo modificar seu conteudo sem ser destruido e reconstruido
  // torna operações repetidas como concatenar mais eficiente
  // é ideal para construção dinamica

  //Kit de Sobrevivencia String e StringBuilder

  public static void main(String[] args){
    
    //Criar uma String 
    //Aqui a crição mais simples de um objeto String
    String criarStringSimples = "Texto String";
    //Aqui temos a criação completa do Objeto String
    String criarObjetoString = "Texto Objeto String";

    //Saber o tamanho de um String(quantidade de caracteres)  
    System.out.println(criarObjetoString.length());

    //Acessar um char dentro da String
    System.out.println(criarObjetoString.charAt(0));
    System.out.println(criarObjetoString.charAt(1));

    //Comparação correta de Strings
    System.out.println(criarStringSimples.equals(criarObjetoString));

    //Criação de uma Substring, criar um string a partir dos objetos em lista de outra 
    System.out.println(criarObjetoString.substring(0,3));

    //converter String para um Arry de Char(array de caracteres)
    //import java.util.Arrays; para usar o toString
    char[] arr = criarObjetoString.toCharArray();
    System.out.println(Arrays.toString(arr));

    //Procurar o indice do caractere ou da string
    //char
    System.out.println(criarObjetoString.indexOf(arr[1]));
    //String - apartir do numero de saida se inicia a string
    System.out.println(criarObjetoString.indexOf("String"));
    
    //Concatenação de Strings
    String str1 = "Hello ";
    String str2 = "World";
    System.out.println(str1+str2);



    //StringBuilder

    //Criar nova StringBuilder
     StringBuilder novaStringBuilder = new StringBuilder();

    // Adicionar valores
    novaStringBuilder.append("Ola Mundo");
    System.out.println(novaStringBuilder);
    novaStringBuilder.append("!!!");
    System.out.println(novaStringBuilder);

    //Converter de StringBuilder para String
    String convercaoString = novaStringBuilder.toString();
    System.out.println(convercaoString.toUpperCase());
    // convercaoString.append(); não funciona pois agora é string

    //Modificar StringBuilder
    //Deletar char(caractere)
    novaStringBuilder.deleteCharAt(0);
    System.out.println(novaStringBuilder);
    //Inserir char(caractere) baseado na posição de um index
    novaStringBuilder.insert(0,'0');
    System.out.println(novaStringBuilder);
    //Definir um valor para uma posição
    novaStringBuilder.setCharAt(0, '!');
    System.out.println(novaStringBuilder);
  }
} 