class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ms=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                int len=j-i+1;
                if (len<l || len>r) continue;
                int n=sum(nums,i,j);
                if(n<=0) continue;
                ms=Math.min(ms,n);
            }
        }
        return ms==Integer.MAX_VALUE?-1:ms;
    }
    public int sum(List<Integer> nums, int l, int r)
    {
        int s=0;
        for(int i=l;i<=r;i++)
        s+=nums.get(i);
        return s;
    }
}