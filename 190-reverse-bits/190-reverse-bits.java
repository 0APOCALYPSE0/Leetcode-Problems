public class Solution {
    // you need treat n as an unsigned value
    
    public int reverseBits(int n) {
        // array to store binary number
        int[] binaryNum = new int[32];
        // System.out.println(n);
 
        // counter for binary array
        for (int i = 31; i >= 0; i--) {
			int k = n >> i;
			if ((k & 1) > 0)
				// System.out.print("1");
                binaryNum[31-i] = 1;
			else
				// System.out.print("0");
                binaryNum[31-i] = 0;
		}
        int decValue = 0;
        int base = 1;
        for(int j=0; j<32; j++){
            // System.out.print(binaryNum[j]);
            decValue += binaryNum[j] * base;
			base = base * 2;
        }
        return decValue;
    }
}