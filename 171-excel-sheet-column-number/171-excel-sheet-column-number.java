class Solution {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int sum = 0;
        for(int i=0; i<length-1; i++){
            sum += (columnTitle.charAt(i) - 'A') + 1;
            sum *= 26;
        }
        sum += (columnTitle.charAt(length-1) - 'A') + 1;
        return sum;
    }
}