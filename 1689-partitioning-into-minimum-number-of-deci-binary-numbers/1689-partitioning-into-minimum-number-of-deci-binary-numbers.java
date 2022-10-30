class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i=0; i<n.length(); i++){
            int val = Integer.parseInt(n.charAt(i)+"");
            if(val > maxDigit){
                maxDigit = val;
            }
        }
        return maxDigit;
    }
}