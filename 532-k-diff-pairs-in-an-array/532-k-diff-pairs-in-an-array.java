class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for(int num : map.keySet()){
            if(k > 0 && map.containsKey(num+k) || k == 0 && map.get(num) > 1)
                count++;
        }
        return count;
    }
}