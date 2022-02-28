class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        if(nums.length == 0){
            return list;
        }else if(nums.length == 1){
            list.add(nums[0]+"");
            return list;
        }
        int start = nums[0];
        int end = 0;
        int count = 0;
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
                end = nums[i+1];
                continue;
            }
            if(count == 0){
                start = nums[i];
                end = start;
            }else{
                start = end-count;
                count = 0;
            }
            if(start == end){
                list.add(start+"");
            }else{
                list.add(start+"->"+end);   
            }
            start = nums[i+1];
        }
        if(end < start){
            list.add(start+"");
        }else{
            list.add(start+"->"+end);   
        }
        return list;
    }
}