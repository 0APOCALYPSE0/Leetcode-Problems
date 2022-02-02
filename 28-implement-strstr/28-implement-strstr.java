class Solution {
    public int strStr(String haystack, String needle) {
        int result = 0;
        boolean notFound = false;
        if(needle.length() == 0){
            return 0;
        }else if(needle.length() > haystack.length()){
            return -1;
        }
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                notFound = true;
                boolean check = compare(haystack, needle, i);
                result = check ? i : -1;
                if(check == true){
                    break;   
                }
            }
        }
        result = notFound ? result : -1;
        
        return result;
    }
    
    public boolean compare(String haystack, String needle, int index){
        if((haystack.length() - index) < needle.length()){
            return false;
        }
        for(int i=0; i<needle.length(); i++){
            if(needle.charAt(i) != haystack.charAt(index)){
                return false;
            }
            index++;
        }
        return true;
    }
}