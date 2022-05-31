public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += Integer.remainderUnsigned(n, 2);
            n = Integer.divideUnsigned(n, 2);
        }
        return result;
    }
}