class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            if(i%2==0) s1+=c-'0';
            else s2+=c-'0';
        }
        if(s1==s2) return true;
        else return false;
    }
}