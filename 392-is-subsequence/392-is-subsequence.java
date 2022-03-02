class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()){
            return false;
        }
        
        int subSequence = 0;
        for(int i=0; i<t.length(); i++){
            if(subSequence == s.length()){
                break;
            }
            if(s.charAt(subSequence) == t.charAt(i)){
                subSequence++;
            }
        }
        return subSequence == s.length();
    }
}