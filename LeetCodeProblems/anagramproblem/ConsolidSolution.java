package LeetCodeProblems.anagramproblem;

// Problema:

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s e consistem em letras minúsculas em inglês.t

public class ConsolidSolution {
  public static void main(String[] args){
    AnagramVerification("ola", "ola")
  }

  public static boolean AnagramVerification(String s, String t){
    int[] scoreboard = new int[26];
    for(int i = 0; i < s.length(); i++){
      char charOfS = s.charAt(i);
      int posS = charOfS - 'a';
      scoreboard[posS] += 1;
    }
    for(int j = 0; j < t.charAt(j); j++){
      char charOfT = s.charAt(j);
      int posT = charOfT - 'a';
      scoreboard[posT] -= 1;
    }
    for(int h = 0; h < scoreboard.length; h++){
        if(scoreboard[h] != 0){
          return false;
        }
    }
    return true;
  }
}
