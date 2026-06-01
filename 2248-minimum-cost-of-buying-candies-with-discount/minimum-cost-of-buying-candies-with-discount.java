class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int s=0,c=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            c++;
            if(c%3==0) continue;
            s+=cost[i];
        }
        return s;
    }
}