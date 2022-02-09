class Solution {
    public char findTheDifference(String s, String t) {
        char result = '0';
        int length = s.length();
        int sArr[] = new int[26];
        int tArr[] = new int[26];
        
        for(int i=0; i<length; i++){
            sArr[s.charAt(i) - 'a']++;
            tArr[t.charAt(i) - 'a']++;
        }
        tArr[t.charAt(length) - 'a']++;
        for(int i=0; i<26; i++){
            if(sArr[i] != tArr[i]){
                int value = i + 97;
                result = (char)value;
                break;
            }
        }
        
        return result;
    }
}