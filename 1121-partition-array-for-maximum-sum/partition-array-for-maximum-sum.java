class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int m=0;
            for(int j=1;j<=k && i-j+1>=0;j++)
            {
                m=Math.max(arr[i-j+1],m);
                int p=(i-j>=0) ? dp[i-j] : 0;
                dp[i]=Math.max(dp[i],m*j+p);
            }
        }
        return dp[dp.length-1];
    }
}