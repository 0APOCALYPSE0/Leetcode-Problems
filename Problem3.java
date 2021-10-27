/*
	3. Longest Substring Without Repeating Characters

	Given a string s, find the length of the longest substring without repeating characters.

	Example:1
						Input: s = "abcabcbb"
						Output: 3
						Explanation: The answer is "abc", with the length of 3.

	Example:2
						Input: s = "bbbbb"
						Output: 1
						Explanation: The answer is "b", with the length of 1.

	Example:3
						Input: s = "pwwkew"
						Output: 3
						Explanation: The answer is "wke", with the length of 3.
						Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

	Example:4
						Input: s = ""
						Output: 0

*/

import java.util.HashMap;
public class Problem3
{
	public int lengthOfLongestSubstring(String str){
		HashMap<Character, Integer> map = new HashMap<>();
	    int startIndex = 0;
	    int maxLength = 0;

	    for(int i=0; i<str.length(); i++){
	        if(!map.containsKey(str.charAt(i))){
	            map.put(str.charAt(i), i);
	        }else{
              // System.out.println(map.values());
	            int index = map.get(str.charAt(i));
	            if(maxLength < (i-startIndex)){
	                maxLength = i-startIndex;
	            }
	            if(startIndex < index+1){
	               startIndex = index+1;
	            }
	            map.remove(str.charAt(i));
	            map.put(str.charAt(i), i);
	        }
	    }
	    if(maxLength < str.length() - startIndex){
	       maxLength = str.length() - startIndex;
	    }
			return maxLength;
	}
	public static void main(String[] args) {
	    String str = "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			Problem3 obj = new Problem3();
	    System.out.println(obj.lengthOfLongestSubstring(str));
	}
}
