class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();   
        stack.push(pushed[0]);
        int i=1;
        int j=0;
        while(i < pushed.length || j < popped.length){
            if(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }else{
                if(i == pushed.length){
                    break;
                }
                stack.push(pushed[i]);
                i++;
            }
        }
        return stack.isEmpty();
    }
}