class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String sb="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                if(check(sub,k))
                {
                    if(sb=="" || sub.length()<sb.length()) sb=sub;
                    else if(sb.length()==sub.length()) sb=lex(sb,sub);
                }
                else continue;
            }
        }
        return sb;
    }
    public boolean check(String s,int k)
    {
        int c=0;
        for(char ch:s.toCharArray())
        if(ch=='1') c++;
        return c==k;
    }
    public String lex(String a,String b)
    {
        if (a.compareTo(b) < 0)
            return a;

        return b;
    }
}