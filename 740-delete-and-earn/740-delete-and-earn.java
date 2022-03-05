class Solution {
    public int deleteAndEarn(int[] nums) {
        int freq[] = new int[10001];
        int max = 0;
        for(int num : nums){
            freq[num]++;  
            if(num > max){
                max = num;
            }
        } 
        int max_val = 0, prev_max = 0;
        for(int i=0; i<=max; i++) {
            int cur_max = Math.max(max_val, prev_max + i * freq[i]);
            prev_max = max_val;
            max_val = cur_max;
        }
        return max_val;
    }
}