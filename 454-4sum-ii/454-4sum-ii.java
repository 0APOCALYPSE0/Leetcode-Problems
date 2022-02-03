class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int length = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                int num = nums1[i]+nums2[j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                int num = (nums3[i]+nums4[j])*-1;
                result += map.getOrDefault(num, 0);
            }
        }
        return result;
    }
}