class Solution {
    // function to convert decimal to binary
    public int decToBinary(int n){
        int count = 0;
        while (n > 0) {
            // storing remainder in binary array
            int temp = n % 2;
            if(temp == 1){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
            int value = decToBinary(i);
            if(value >= 0 && value <= n){
                result[i] = value;
            }
        } 
        return result;
    }
}