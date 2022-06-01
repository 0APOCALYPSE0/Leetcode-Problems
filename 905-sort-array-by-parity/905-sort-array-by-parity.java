class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int pt = 0;
        if(nums.length == 1){
            return nums;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[pt] % 2 == 0){
                pt++;
            }else if(nums[i] % 2 == 0){
                int temp = nums[pt];
                nums[pt] = nums[i];
                nums[i] = temp;
                pt++;
            }
        }
        return nums;
    }
}