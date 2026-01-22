package GrokkingAlgorithmsBook.binarysearch;

// Busca binária
// Vou fazer uma pequena implementação para praticar

public class Example2 {
  public static void main(String[] args){
    int[] list = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39};
    int target = 11;
    System.out.println("indice do valor: "+binarySearch(list, target));
  }
  
  public static int binarySearch(int[] list,int target){
    int baixo = 0;
    int alto = list.length - 1;
    while (baixo <= alto){
      int meio = (alto + baixo) / 2;
      int chute = list[meio];   
      System.out.println("Valor do Meio "+chute);
      if(chute == target){
          return meio;
      }
      if(chute > target){
          alto = meio - 1;
      }
      if(chute < target){
          baixo = meio + 1;
      }
    }
    return -100000;
  }
}
