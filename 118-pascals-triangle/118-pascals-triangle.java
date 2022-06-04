class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++){
            ArrayList nestedList = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(i == 0 || j == 0){
                    nestedList.add(1);
                }else{
                    int val1;
                    int val2;
                    if(i == j){
                        val1 = 0;
                        val2 = list.get(i-1).get(j-1);
                    }else{
                        val1 = list.get(i-1).get(j);
                        val2 = list.get(i-1).get(j-1);
                    }
                    nestedList.add(val1+val2);
                }
            }
            list.add(nestedList);
        }
        return list;
    }
}