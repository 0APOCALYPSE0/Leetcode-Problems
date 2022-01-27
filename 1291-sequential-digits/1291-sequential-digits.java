class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int digits = 0;
        int temp = low;
        int startNum = 0;
        List<Integer> list = new LinkedList<Integer>();
        if(low > 123456789){
            return list;
        }
        while(temp != 0){
            if(temp < 10){
                startNum = temp;
            }
            digits++;
            temp = temp/10;
        }
        for(int i=startNum; i<9; i++){
            boolean bool = false;
            String str = "";
            int value = 0;
            for(int j=0; j<digits; j++){
                value = i+j;
                if((i+j) > 9){
                    bool = true;
                    i=0;
                    digits++;
                    break;
                }
                str = str+String.valueOf(value);
            }
            if(i == 8 && digits == 2){
                digits++;
                i=0;
            }
            if(bool || Integer.parseInt(str) < low){
                continue;
            }
            if(Integer.parseInt(str) <= high){
                list.add(Integer.parseInt(str));
            }else{
                break;
            }
            if(Integer.parseInt(str) == 123456789){
                break;
            }
        }
        return list;
    }
}