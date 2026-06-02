class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
        int[] waterStartTime, int[] waterDuration) {

        int lw = solve(landStartTime, landDuration, 
            waterStartTime, waterDuration);
        int wl= solve(waterStartTime, waterDuration,
            landStartTime, landDuration );
        return Math.min(lw,wl);
    }
    public int solve(int[] start1,int[] dur1,int[] start2,int[] dur2) 
    {
        int f = Integer.MAX_VALUE;
        for (int i = 0; i < start1.length; i++) 
            f = Math.min(f,start1[i] + dur1[i]);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) 
        {
            int s =Math.max(f, start2[i]);
            ans = Math.min(ans,s + dur2[i]);
        }
        return ans;
    }
}