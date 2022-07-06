class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }else{
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            boolean min = false;
            int count = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == first || nums[i] == second || nums[i] == third){
                    if(nums[i] == third){
                        min = true;
                    }
                    continue;
                }
                count++;
                if(nums[i] >= first){
                    third = second;
                    second = first;
                    first = nums[i];
                }else if(nums[i] >= second){
                    third = second;
                    second = nums[i];
                }else if(nums[i] >= third){
                    third = nums[i];
                }
            }
            if(count < 2 && min){
                return first;
            }
            if(third == Integer.MIN_VALUE && !min){
                return first;
            }
            return third;
        }
    }
}