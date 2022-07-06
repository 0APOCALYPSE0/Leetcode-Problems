class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        int t0 = 0; int t1 = 1;
        int next = 0;
        for(int i=0; i<n; i++){
            next = t0 + t1;
            t0 = t1;
            t1 = next;
        }
        return t0;
    }
}