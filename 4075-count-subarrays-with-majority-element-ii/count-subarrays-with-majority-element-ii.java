class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length,cnt=n;
        long c=0,pre=0;
        int[] arr=new int[2*n+1];
        arr[n]=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                pre+=arr[cnt];
                ++cnt; ++arr[cnt];
            }
            else
            {
                --cnt;
                pre-=arr[cnt];
                ++arr[cnt];
            }
            c+=pre;
        }
        return c;
    }
}