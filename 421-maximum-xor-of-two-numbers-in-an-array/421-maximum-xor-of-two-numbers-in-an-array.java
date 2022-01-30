//This is not my solution. But I am using this solution after fully understanding

class Node {
    HashMap<Integer, Node> children;
    Node() {
        this.children = new HashMap<>();
    }
}

class Trie {
    Node root;
    
    Trie() {
        this.root = new Node();
    }
    
    public void insert(int[] A) {
        for(int num : A) {
            Node curr = this.root;
            for(int i=31;i>=0;i--) {
                int currBit = (num >> i) & 1;
                if(!curr.children.containsKey(currBit)) 
                    curr.children.put(currBit, new Node());
                curr = curr.children.get(currBit);
            }
        }
    }
}

class Solution {
    
//     static int myXOR(int x, int y){
	
//         // Initialize result
//         int res = 0;

//         // Assuming 32-bit Integer
//         for(int i = 31; i >= 0; i--)					
//         {

//             // Find current bits in x and y
//             int b1 = ((x & (1 << i)) == 0 ) ? 0 : 1;
//             int b2 = ((y & (1 << i)) == 0 ) ? 0 : 1;

//             // If both are 1 then 0 else xor is same as OR
//             int xoredBit = ((b1 & b2) != 0) ? 0 : (b1 | b2);		

//             // Update result
//             res <<= 1;
//             res |= xoredBit;
//         }
//         return res;
//     }
    
    // static int myXOR(int x, int y) {
    //     return (x + y - (2 * (x & y)));
    // }
    
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         int value = this.myXOR(nums[i], nums[j]);
        //         if(value > max){
        //             max = value;
        //         }
        //     }
        // }
        // int i=0;
        // int j=1;
        // while(i < nums.length-1){
        //     if(j == nums.length){
        //         i++;
        //         if(i == nums.length - 1){
        //             break;
        //         }
        //         j=i+1;
        //     }
        //     int value = this.myXOR(nums[i], nums[j]);
        //     if(value > max){
        //         max = value;
        //     }
        //     j++;
        // }
        Trie trie = new Trie();
        trie.insert(nums);
        
        for(int num : nums) {
            Node curr = trie.root;
            int currSum = 0;
            for(int i=31;i>=0;i--) {
                int requiredBit = 1-((num >> i) & 1); // if A[i] is 0, we need 1 and if A[i] is 1, we need 0. Thus, 1 - A[i]
                if(curr.children.containsKey(requiredBit)) {
                    currSum |= (1<<i); // set ith bit of curr result
                    curr = curr.children.get(requiredBit);
                } else {
                    curr = curr.children.get(1-requiredBit);
                }
            }
            max = Math.max(max, currSum); // get max number
        }
        return max;
    }
}