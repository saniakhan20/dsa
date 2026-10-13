class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] l=new long[n];
        for(int i=0;i<n;i++)
        l[i]=(long)nums[i]*nums[i];
        Arrays.sort(l);
        long s=0;
        for(int i=0;i<n;i++)
        {
            if(i<n/2) s-=l[i];
            else s+=l[i];
        }
        return s;
    }
}