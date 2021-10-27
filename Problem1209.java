/*
  1209. Remove All Adjacent Duplicates in String II

  You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
  We repeatedly make k duplicate removals on s until we no longer can.
  Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.

  Example:1
            Input: s = "abcd", k = 2
            Output: "abcd"
            Explanation: There's nothing to delete.

  Example:2
            Input: s = "deeedbbcccbdaa", k = 3
            Output: "aa"
            Explanation:
            First delete "eee" and "ccc", get "ddbbbdaa"
            Then delete "bbb", get "dddaa"
            Finally delete "ddd", get "aa"

  Example:3
            Input: s = "pbbcggttciiippooaais", k = 2
            Output: "ps"

*/

import java.util.Stack;

public class Problem1209 {
  public String removeDuplicates(String s, int k) {
    //         char[] arr = s.toCharArray();
    //         int length = arr.length;
    //         boolean bool = false;
    //         int count = 1;
    //         int num = 0;
    //         int countReplace = 0;

    //         for(int i=0; i<length-1; i++){
    //             if(arr[i] == arr[i+1]){
    //                 count = count + 1;
    //                 if(count == k){
    //                     countReplace = countReplace + 1;
    //                     if(countReplace > 1){
    //                         num = num+k;
    //                     }
    //                     bool = true;
    // //                    String toBeReplaced = s.substring(((i+2)-k)-num, (i+2)-num);
    // //                    s = s.replace(toBeReplaced, "");
    //                     s = s.substring(0, ((i+2)-k)-num)
    //                             + s.substring((i+2)-num);
    //                 }
    //             }else{
    //                 count = 1;
    //             }
    //         }
    //         if(bool == true){
    //             return removeDuplicates(s, k);
    //         }else{
    //             return s;
    //         }
            // Above solution taking more time......

            // int count = 1;
            // for (int i = 0; i < s.length()-1; i++) {
            //     if(s.charAt(i) == s.charAt(i+1)){
            //         count = count + 1;
            //         if(count == k){
            //             s = s.substring(0, (i+2)-k) + s.substring(i+2);
            //             s = removeDuplicates(s, k);
            //         }
            //     }else{
            //         count = 1;
            //     }
            // }
            // return s;

    char[] SC = s.toCharArray();
    int i, j;
    Stack<Integer> st = new Stack<>();
    st.add(0);
    for (i = 1, j = 1; j < s.length(); i++, j++) {
        char chr = SC[i] = SC[j];
        if (i == 0 || chr != SC[i-1]) st.add(i);
        else if (i - st.peek() + 1 == k) i = st.pop() - 1;
    }
    return new String(SC, 0, i);
  }
  public static void main(String args[]){
    String s = "abcd";
    int k = 2;
    Problem1209 obj = new Problem1209();
    System.out.println(obj.removeDuplicates(s, k));
  }
}
