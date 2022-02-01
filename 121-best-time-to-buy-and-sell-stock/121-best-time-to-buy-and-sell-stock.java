class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int max = 0;
        int start = 0;
        int end = start+1;
        for(int i=end; i<prices.length; i++){
            if(prices[start] < prices[end]){
                max = Math.max(max, prices[end]-prices[start]);
            }else{
                start = end;
            }
            end++;
        }
        return max;
    }
}