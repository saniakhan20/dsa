class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
            if((max(nums,i)-min(nums,i))<=k) return i;
        return -1;
    }
    public int max(int[] n, int in)
    {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<=in;i++)
        m=Math.max(m,n[i]);
        return m;
    }
    public int min(int[] n,int in)
    {
        int m=Integer.MAX_VALUE;
        for(int i=in;i<n.length;i++)
        m=Math.min(m,n[i]);
        return m;
    }
}