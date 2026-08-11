class Solution {
    public int missingInteger(int[] nums) {
        List<Integer> l=new ArrayList<>();
        l.add(nums[0]);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]==1) l.add(nums[i+1]);
            else
            break;
        }
        int s=0,c=0;
        for(int i=0;i<l.size();i++)
        s+=l.get(i);
        
        for(int i=s;;i++)
        if(!check(nums,i)) return i;
    }
    public boolean check(int[] nums,int s)
    {
        for(int i:nums)
        if(i==s) return true;
        return false;
    }
}