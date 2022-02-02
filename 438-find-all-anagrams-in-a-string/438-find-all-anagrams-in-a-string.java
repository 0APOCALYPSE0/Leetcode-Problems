class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        int m = p.length();
        int n = s.length();
        if(m > n){
            return list;
        }
        int pCharFreq[] = new int[26];
        int sCharFreq[] = new int[26];
        
        for(int i=0; i<m; i++){
            pCharFreq[p.charAt(i) - 'a']++;
            sCharFreq[s.charAt(i) - 'a']++;
        }
        
        if(areSame(pCharFreq, sCharFreq)){
            list.add(0);
        }
        
        for(int i=m; i<n; i++){
            sCharFreq[s.charAt(i-m) -'a']--;
            sCharFreq[s.charAt(i) - 'a']++;
            if(areSame(pCharFreq, sCharFreq)){
                list.add(i-m+1);
            }
        }
        
        return list;
    }
    
    public boolean areSame(int pFreq[], int sFreq[]){
        for(int i=0; i<26; i++){
            if(pFreq[i] != sFreq[i]){
                return false;
            }
        }
        return true;
    }
}