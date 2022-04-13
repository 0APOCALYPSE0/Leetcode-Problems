class Mat{
    private int index, soldier;
    
    public Mat(Integer index, Integer soldier){
        this.index = index;
        this.soldier = soldier;
    }
    
    public Integer getIndex(){
        return this.index;
    }
    
    public void setIndex(Integer index){
        this.index = index;
    }
    
    public Integer getSoldier(){
        return this.soldier;
    }
    
    public void setSoldier(Integer soldier){
        this.soldier = soldier;
    }
    
}

class MatSortingComparator
        implements Comparator<Mat> {
 
        // Method 1
        // To compare customers
        @Override
        public int compare(Mat mat1,
                           Mat mat2)
        {
 
            // Comparing customers
            int soldierCompare = mat1.getSoldier().compareTo(
                mat2.getSoldier());
 
            int indexCompare = mat1.getIndex().compareTo(
                mat2.getIndex());
 
            // 2nd level comparison
            return (soldierCompare == 0) ? indexCompare
                                      : soldierCompare;
        }
    }

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Mat> al = new ArrayList<>();
        int result[] = new int[k];
        
        for(int i=0; i<mat.length; i++){
            int countSoldiers = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    countSoldiers++;
                }
            }
            al.add(new Mat(i, countSoldiers));
        }
        Collections.sort(al,
                         new MatSortingComparator());
        for(int i=0; i<k; i++){
            result[i] = al.get(i).getIndex();
        }
        return result;
    }
}