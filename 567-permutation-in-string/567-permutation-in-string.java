class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Freq[] = new int[26];
        int s2Freq[] = new int[26];
        
        if(s1.length() > s2.length()){
            return false;
        }
        
        for(int i=0; i<s1.length(); i++){
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
        
        if(areSame(s1Freq, s2Freq)){
            return true;
        };
        
        for(int i=s1.length(); i<s2.length(); i++){
            s2Freq[s2.charAt(i-s1.length())- 'a']--;
            s2Freq[s2.charAt(i) - 'a']++;
            if(areSame(s1Freq, s2Freq)){
                return true;
            }
        }
        return false;
        
    }
    
    public boolean areSame(int s1[], int s2[]){
        for(int i=0; i<26; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
}