class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int length1 = a.length;
        int length2 = b.length;
        int totalLength = length1 + length2;
        int firstNum = 0;
        int secondNum = 0;
        int count = 0;
        int targetCounter = (totalLength + 1) / 2;
        
        int i=0;
        int j=0;
        int value = 0;
        while(i < length1 && j < length2){
            if(a[i] < b[j]){
                value = a[i];
                i++;
            }else{
                value = b[j];
                j++;
            }
            count++;
            if(count >= targetCounter){
                if(count == (targetCounter+1)){
                    secondNum = value;
                    break;
                }else{
                    firstNum = value;
                }
            }
        }
        while (i < length1 && count <= ((totalLength+1) / 2)) {
            value = a[i];
            i++;
            count++;
            if(count >= targetCounter){
                if(count == (targetCounter+1)){
                    secondNum = value;
                    break;
                }else{
                    firstNum = value;
                }
            }
        }
        while (j < length2 && count <= ((totalLength+1) / 2)) {
            value = b[j];
            j++;
            count++;
            if(count >= targetCounter){
                if(count == (targetCounter+1)){
                    secondNum = value;
                    break;
                }else{
                    firstNum = value;
                }
            }
        }
        if(totalLength % 2 != 0){
            return firstNum;
        }else{
            return (double)(firstNum + secondNum) / 2.0;
        }
    }
}