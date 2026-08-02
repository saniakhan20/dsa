class Solution {
    Integer[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new Integer[n][n];
        return check(piles,0,n-1)>=0;
    }
    public int check(int[] piles, int i, int j)
    {
        if(i==j) return piles[i];
        if(dp[i][j]!=null) return dp[i][j];
        int l=piles[i]-check(piles,i+1,j);
        int r=piles[j]-check(piles,i,j-1);
        return dp[i][j]=Math.max(l,r);
    }
}
