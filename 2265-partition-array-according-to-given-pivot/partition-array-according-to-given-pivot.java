class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> s=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        for(int i:nums)
        {
            if(i<pivot) s.add(i);
            else if(i==pivot) e.add(i);
            else b.add(i);
        }
        int[] a=new int[n];
        int id=0;
        for(int i:s)
        a[id++]=i;
        for(int i:e)
        a[id++]=i;
        for(int i:b)
        a[id++]=i;
        return a;
    }
}