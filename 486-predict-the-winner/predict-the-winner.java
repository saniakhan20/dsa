class Solution {
    Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        dp=new Integer[n][n];
        return check(nums,0,n-1)>=0;
    }
    public int check(int[] nums, int i,int j)
    {
        if(i==j) return nums[i];
        if(dp[i][j]!=null) return dp[i][j];
        int l=nums[i]-check(nums,i+1,j);
        int r=nums[j]-check(nums,i,j-1);
        return dp[i][j]=Math.max(l,r);
    }
}