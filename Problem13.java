/*
  13. Roman to Integer

  Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
  Symbol       Value
  I             1
  V             5
  X             10
  L             50
  C             100
  D             500
  M             1000
  For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

  I can be placed before V (5) and X (10) to make 4 and 9.
  X can be placed before L (50) and C (100) to make 40 and 90.
  C can be placed before D (500) and M (1000) to make 400 and 900.
  Given a roman numeral, convert it to an integer.

  Example:1
            Input: s = "III"
            Output: 3

  Example:2
            Input: s = "IV"
            Output: 4

  Example:3
            Input: s = "IX"
            Output: 9

  Example:4
            Input: s = "LVIII"
            Output: 58
            Explanation: L = 50, V= 5, III = 3.
*/

import java.util.HashMap;

public class Problem13 {
  public int romanToInt(String s) {
    HashMap<Character, Integer> data = new HashMap<Character, Integer>();
    data.put('I', 1);
    data.put('V', 5);
    data.put('X', 10);
    data.put('L', 50);
    data.put('C', 100);
    data.put('D', 500);
    data.put('M', 1000);
    char[] roman = s.toCharArray();
    int length = roman.length;
    int sum = 0;

    for(int i=0; i<length; i++){
        if(i != length - 1 && data.get(roman[i]) < data.get(roman[i+1])){
            sum = sum + data.get(roman[i+1]) - data.get(roman[i]);
            i++;
        }else{
            sum = sum + data.get(roman[i]);
        }
    }

    return sum;
  }
  public static void main(String args[]){
    String s = "III";
    Problem13 obj = new Problem13();
    System.out.println(obj.romanToInt(s));
  }
}