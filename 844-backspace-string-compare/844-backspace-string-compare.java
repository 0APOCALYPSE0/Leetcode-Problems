class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack s1 = new Stack<Integer>();
        Stack s2 = new Stack<Integer>();
        int i=0; int j=0;
        while(i < s.length() || j<t.length()){
            if(i < s.length()){
                if(s.charAt(i) == '#' && !s1.isEmpty()){
                    s1.pop();
                }else{
                    if(s.charAt(i) != '#'){
                        s1.push(s.charAt(i));   
                    }
                }   
            }
            if(j < t.length()){
                if(t.charAt(j) == '#' && !s2.isEmpty()){
                    s2.pop();
                }else{
                    if(t.charAt(j) != '#'){
                        s2.push(t.charAt(j));   
                    }
                }   
            }
            i++;
            j++;
        }
        if(s1.size() != s2.size()){
            return false;
        }
        boolean flag = true;
        int size = s1.size();
        for(int k=0; k<size; k++){
            if(s1.pop() != s2.pop()){
                flag = false;
                break;
            }
        }
        return flag;
    }
}