class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        
        while(l <= r){
            int mid = l + (r - l) / 2;
            int row = 0;
            int col = 0;
            if((mid+1) % matrix[0].length == 0){
                row  = (mid+1)/matrix[0].length - 1;
                col = matrix[0].length-1;
            }else{
                row = (mid+1)/matrix[0].length;
                col = ((mid+1) % matrix[0].length) - 1;
            }
            
            if(matrix[row][col] == target){
                return true;
            }
            
            if(matrix[row][col] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}