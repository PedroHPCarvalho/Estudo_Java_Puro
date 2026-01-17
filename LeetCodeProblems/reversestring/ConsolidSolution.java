// Problema:

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 

// Constraints:
// 1 <= s.length <= 105
// s[i] is a printable ascii character.


package LeetCodeProblems.reversestring;

public class ConsolidSolution {
  public static void main(String[] args){
    char[] s = {'h','e','l','l','o'};
    InverterString inversor = new InverterString(s);
    inversor.MakeInversion();
    System.out.println(s);
  };
}

class InverterString {
  char[] entryArry;
  public InverterString(char[] entryArry){
    this.entryArry = entryArry;
  }
  
  public void MakeInversion(){
    int countRight = entryArry.length - 1;
    for(int countLeft = 0; countLeft < countRight; countLeft++){
        char temp = entryArry[countLeft];
        entryArry[countLeft] = entryArry[countRight];
        entryArry[countRight] = temp;
        countRight--;
    }
   }
  }



