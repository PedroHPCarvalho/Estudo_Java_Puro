package GrokkingAlgorithmsBook.binarysearch;

public class Exemple{
  public static void main(String[] args){
    int[] list = {1,3,5,7,9};
    int target = 3; 
    System.out.println(binarySearch(list, target));
  }


  //Vamos construir um algoritmo de busca binária, seu objetivo é encontrar um determinado número no array usando a técnica de busca binaria
  public static int binarySearch(int[] list, int target){
    //Aqui instanciamos as váriaveis que ajudarão na busca
    //baixo representa o menor valor de procura intervalo 
    //alto o maior valor no intervalo de procura
    int baixo = 0;
    int alto = list.length - 1;
    //Vamos criar um laço de repetição onde serão feitas as etapas para a busca, a condição será o seguinte: enquanto baixo for menor ou igual que alto continue rodando; baixo <= alto
    while (baixo <= alto){
      //no inicio da iteração vamos calcular o meio do intervalo de procura
      // (baixo + alto) / 2 (OBS: É NECESSÁRIO ARREDONDAR PARA BAIXO NESSE CASO, EM ALGUMAS LINGUAGENS É FEITO DE MANEIRA NATURAL)
      int meio = (baixo + alto) / 2; 
      //Aqui será armazenados os chutes em uma lista 
      int chute = list[meio];
      //Aqui vamos validar cada caso
      // Caso o chute for igual o target, se encerra e retorna o valor meio
      if (chute == target){
        return meio;
      }
      // caso o chute for maior que o item, o alto assume o valor alto -1
      if (chute > target){
        alto = meio - 1;
      }
      // caso o chute for menor que o baixo, o baixo assume meio + 1
      if (chute < target){
        baixo = meio + 1;
      }
      System.out.println("Valor do chute: "+chute);   
    }
  // Caso não exista item, retorna none
  return -1;
  }
}