class Solution {
    public int maxDepth(String s) {
        Stack<Character> d=new Stack<>();
        int m=0;
        for(char c:s.toCharArray())
        {
            if(c=='(') {
                d.push(c); 
                m=Math.max(m,d.size()); }
            if(c==')') d.pop();
        }
        return m;
    }
}