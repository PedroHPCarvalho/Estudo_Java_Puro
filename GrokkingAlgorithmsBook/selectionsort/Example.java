import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Example {
  public static void main(String[] args){
    ArrayList<Integer> entryArray = new ArrayList<>(Arrays.asList(1,2,3,5,1,7,3,1,6,4));
    System.out.println(selectionSort(entryArray));
  }

  public static List<Integer> selectionSort(ArrayList<Integer> entryArray){
    ArrayList<Integer> sortedArray = new ArrayList<>();
    while (!entryArray.isEmpty()){
      int small_index_retorned = smallValue(entryArray);
      sortedArray.add(entryArray.get(small_index_retorned));
      entryArray.remove(small_index_retorned);
    }
    return sortedArray;
  }

  public static int smallValue(ArrayList<Integer> entryArray){
    int small_value = entryArray.get(0);
    int small_index = 0;
    for(int index = 0; index < entryArray.size(); index++){
      if(entryArray.get(index) < small_value){
        small_value = entryArray.get(index);
        small_index = index;
      }
    }
    return small_index;
  }
  

}

