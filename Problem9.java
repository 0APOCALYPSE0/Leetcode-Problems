/*
  9. Palindrome Number

  Given an integer x, return true if x is palindrome integer.
  An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

  Example:1
            Input: x = 121
            Output: true

  Example:2
            Input: x = -121
            Output: false
            Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

  Example:3
            Input: x = 10
            Output: false
            Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

  Example:4
            Input: x = -101
            Output: false

*/

public class Problem9 {
  public boolean isPalindrome(int x) {
    int original = x;
    int sum = 0;
    if(x < 0){
        return false;
    }
    while(x != 0){
        int rem = x % 10;
        sum = sum*10 + rem;
        x = x / 10;
    }
    if(original == sum){
        return true;
    }else{
        return false;
    }
  }
  public static void main(String args[]){
    int x = 121;
    Problem9 obj = new Problem9();
    System.out.println(obj.isPalindrome(x));
  }
}
