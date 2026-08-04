class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int n=nums.length,p=0;
        for(int i=nums[0];i<=nums[n-1];i++)
        {
            if(i!=nums[p]) { l.add(i); continue; }
            p++;
        }
        return l;
    }
}