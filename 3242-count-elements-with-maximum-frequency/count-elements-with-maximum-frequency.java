class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        m.put(i,m.getOrDefault(i,0)+1);
        int max=0;
        for(int i:m.keySet())
        if(m.get(i)>max) max=m.get(i);
        int c=0;
        for(int i:m.keySet())
        if(m.get(i)==max) c++;
        return c*max;
    }
}