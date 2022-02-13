class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> emptyList = new LinkedList<>();
        list.add(emptyList);
        for(int i=0; i<nums.length; i++){
            int size = list.size();
            for(int j=0; j<size; j++){
              List<Integer> nestedList = new LinkedList<>(list.get(j));
              nestedList.add(nums[i]);
              list.add(nestedList);
            }
        }
        return list;
    }
}