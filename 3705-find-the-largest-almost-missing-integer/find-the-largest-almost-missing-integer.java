class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        if(k==n) 
        {
            int m=0;
            for(int i:nums)
            if(m<i) m=i;
            return m;
        }
        else if(k==1)
        {
            int m=-1;
            for(int i:hm.keySet())
            if(hm.get(i)==1 && i>m) m=i;
            return m;
        }
        else
        {
            /*if(hm.get(nums[0])>hm.get(nums[n-1])) return nums[n-1];
            else if(hm.get(nums[0])<hm.get(nums[n-1])) return nums[0];
            else return Math.max(nums[0],nums[n-1]);*/
            boolean first = hm.get(nums[0]) == 1;
            boolean last = hm.get(nums[n - 1]) == 1;

            if (first && last) {
                return Math.max(nums[0], nums[n - 1]);
            }

            else if (first) {
                return nums[0];
            }

            else if (last) {
                return nums[n - 1];
            }

            else {
                return -1;
            }
        }
    }
}