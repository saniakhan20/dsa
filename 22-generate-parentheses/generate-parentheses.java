class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        backtrack(l,n,0,0,new StringBuilder());
        return l;
    }
    public void backtrack(List<String> l, int n, int c, int o, StringBuilder s)
    {
        if(s.length()==2*n)
        {l.add(s.toString()); return;}
        if(o<n) {s.append("("); backtrack(l,n,c,o+1,s); 
        s.deleteCharAt(s.length()-1);}
        if(c<o) {s.append(")"); backtrack(l,n,c+1,o,s); 
        s.deleteCharAt(s.length()-1);}
    }
}