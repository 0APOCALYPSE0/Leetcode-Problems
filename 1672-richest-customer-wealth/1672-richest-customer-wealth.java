class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            richest = Math.max(wealth, richest);
        }
        return richest;
    }
}