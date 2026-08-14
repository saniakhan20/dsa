class Solution {
    public int maximumLengthSubstring(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            if(check(s.substring(i,j))) c=Math.max(c,s.substring(i,j).length());
        }
        return c;
    }
    public boolean check(String s)
    {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray())
        m.put(c,m.getOrDefault(c,0)+1);
        for(char c:s.toCharArray())
        if(m.get(c)>2) return false;
        return true;
    }
}