class Node {
    HashMap<Character, Node> children;
    Node() {
        this.children = new HashMap<>();
    }
}

class Trie {
    Node root;

    Trie() {
        this.root = new Node();
    }

    public Boolean insert(String[] strArr) {
        int count = 0;
        int innerCount = 0;
        for(String str: strArr){
          count++;
          Node curr = this.root;
            for(char c : str.toCharArray()) {
                innerCount++;
                if(!curr.children.containsKey(c)) {
                    if(count != 1 && innerCount == 1){
                        return true;
                    }
                    curr.children.put(c, new Node());
                }
                curr = curr.children.get(c);
            }
            innerCount = 0;
        }
        return false;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String strPrefix = "";
        Trie trie = new Trie();
        Boolean result = trie.insert(strs);  
        if(result){
            return "";
        }
        int count = 0;
        for(String str : strs) {
            count++;
            Node curr = trie.root;
            String temp = "";
            for(char c : str.toCharArray()){
                if(curr.children.size() == 1){
                    temp = temp+c;
                    if(curr.children.containsKey(c)) {
                        curr = curr.children.get(c);
                    }
                }
            }
            if(count == 1){
                strPrefix = temp;
            }
            if(temp.length() < strPrefix.length()){
                strPrefix = temp;
            }
        }
        return strPrefix;
    }
}