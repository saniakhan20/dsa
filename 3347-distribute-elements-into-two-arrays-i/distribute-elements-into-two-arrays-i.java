class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>(); 
        l.add(nums[0]); l1.add(nums[1]);
        for(int i=2;i<nums.length;i++)  
        {
            if(l.get(l.size()-1)>l1.get(l1.size()-1)) l.add(nums[i]);
            else l1.add(nums[i]);
        }
        int[] a=new int[nums.length];
        int k=0;
        for(int i:l)
        { a[k]=i; k++;}
        for(int i:l1)
        {a[k]=i; k++;}
        return a;
    }
}