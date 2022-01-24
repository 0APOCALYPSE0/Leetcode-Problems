class Solution {
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        boolean result = true;
        boolean capital = false;
        boolean small = false;
        for(int i=0; i<length; i++){
          if(small && capital){
            break;
          }
          if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z' && i != 0){
            capital = true;
          }else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z' && i != 0){
            small = true;
          }
        }
        if((small && capital) || (word.charAt(0) >= 'a' && word.charAt(0) <= 'z' && capital)){
          result = false;
        }
        return result;
    }
}