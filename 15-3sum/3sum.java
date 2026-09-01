class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> n=new ArrayList<>();
        int s=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
            s=nums[i]+nums[j]+nums[k];
            if(s==0) 
            {
                n.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while (j < k && nums[j] == nums[j + 1]) j++;
                while (j < k && nums[k] == nums[k - 1]) k--;
                j++; k--;
            }
            if(s>0) k--;
            if(s<0) j++;
        }
    }
    return n;
}}