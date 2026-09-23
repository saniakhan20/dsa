class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        if(nums[0]>x && nums[n-1]>x) return -1;
        int t=0;
        for(int i:nums) t+=i;
        t-=x;
        if(t==0) return n;
        int l=0,s=0,ml=-1;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            while(s>t && l<=i)
            {s-=nums[l]; l++; }
            if(s==t)
            ml=Math.max(ml,i-l+1);
        }
        if(ml==-1) return -1;
        return n-ml;
    }
}