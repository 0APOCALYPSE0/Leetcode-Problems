class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int majorityElement1 = arr[0];
        int majorityElement2 = 0;
        int count1 = 1;
        int count2 = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == majorityElement1){
                count1++;
            }else if(arr[i] == majorityElement2){
                count2++;
            }else if(count1 == 0){
                majorityElement1 = arr[i];
                count1 = 1;
            }else if(count2 == 0){
                majorityElement2 = arr[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int i=0; i<arr.length; i++){
            if(majorityElement1 == arr[i]){
                count1++;
            }
            if(majorityElement2 == arr[i]){
                count2++;
            }
        }
        ArrayList result = new ArrayList<Integer>();
        if(majorityElement1 == majorityElement2){
            result.add(0);
            return result;
        }
        if(count1 > arr.length/3){
            result.add(majorityElement1);
        }
        if(count2 > arr.length/3){
            result.add(majorityElement2);
        }
        return result;
    }
}