class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        int totalSum = nums.length;
        for(int i=0; i<nums.length; i++){
            arraySum += nums[i];
            totalSum += i;
        }
        return totalSum-arraySum;
    }
}