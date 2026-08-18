class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[s.length()];
        for(int i=0;i<n;i++)
        {
            dp[i]=i;
            for(int j=0;j<=i;j++)
            {
                if(palin(s.substring(j,i+1)))
                { 
                    if(j==0) dp[i]=0;
                    else dp[i]=Math.min(dp[i],1+dp[j-1]);
                }
            }
        }
        return dp[n-1];
    }
    public boolean palin(String s)
    {
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++; r--;
        }
        return true;
    }
}