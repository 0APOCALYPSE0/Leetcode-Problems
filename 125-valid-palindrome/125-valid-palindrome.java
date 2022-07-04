class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                str = str+s.charAt(i);
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                str = str + (char) ((int)s.charAt(i) + 32);
            }
        }
        int start = 0; int end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}