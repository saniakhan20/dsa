class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int md=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int d=nums[i+1]-nums[i];
            md=Math.max(md,d);
        }
        return md;
    }
}