class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k) return s;
        while(s.length()>k)
        {
            String t="";
            for(int i=0;i<s.length();i+=k)
            {
                String a=(i+k<=s.length())?s.substring(i,i+k):s.substring(i);
                t+=sum(a);
            }
            s=t;
        }
        return s;
    }
    public String sum(String a) {
        int s = 0;
        for (int i = 0; i < a.length(); i++) {
            s += a.charAt(i) - '0';
        }
        return String.valueOf(s);
    }
}