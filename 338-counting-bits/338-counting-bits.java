class Solution {
    // function to convert decimal to binary
    public int decToBinary(int n, int[] res){
        int count = 0;
        while (n > 0) {
            // storing remainder in binary array
            int temp = n % 2;
            if(temp == 1){
                if(res[n] != 0){
                    count = count + res[n];
                    break;
                }else{
                    count++;   
                }
            }
            n = n / 2;
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
            int value = decToBinary(i, result);
            result[i] = value;
        } 
        return result;
    }
}