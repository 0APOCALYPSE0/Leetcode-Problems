class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> stackIndex = new Stack<Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
                stackIndex.push(i);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    s = s.substring(0, i) + s.substring(i+1);
                    i--;
                    if(!stackIndex.isEmpty()){
                        stackIndex.pop();
                    }
                }else{
                    stackIndex.pop();
                }
            }
        }
        while(!stackIndex.isEmpty()){
            int i = stackIndex.pop();
            s = s.substring(0, i) + s.substring(i+1);
        }
        return s;
    }
}