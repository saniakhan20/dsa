class Solution {
    public int magicalString(int n) {
        String s="122";
        for(int i=2;i<=n;i++)
        {
            char c=s.charAt(i);
            if((c-'0')==2) 
            {
                if(s.charAt(s.length()-1)-'0'==1) s+="22";
                else s+="11";
            }
            else
            {
                if(s.charAt(s.length()-1)-'0'==1) s+='2';
                else s+='1';
            }
        }
        //return one(s);
        return one(s.substring(0,n));
    }
    public int one(String s)
    {
        int o=0;
        for(char c:s.toCharArray())
        {
            if((c-'0')==1) o++;
        }
        return o;
    }
}