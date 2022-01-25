class Solution {
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        int count = 0;
        boolean toggle1 = true;
        boolean toggle2 = false;
        if(length < 3){
            return false;
        }else if(arr[0] > arr[1]){
            return false;
        }
        for(int i=0; i<length-1; i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
            if(arr[i] > arr[i+1] && toggle1){
                count++;
                toggle1 = false;
                toggle2 = true;
            }
            if(arr[i] < arr[i+1] && toggle2){
                count++;
                toggle2 = false;
                toggle1 = true;
            }
            if(count > 1){
                break;
            }
        }
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }
}