class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++)
        {
            int l=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++)
            {
                int sw=Math.max(l,waterStartTime[j]);
                int f1=sw+waterDuration[j];
                int w=waterStartTime[j]+waterDuration[j];
                int sl=Math.max(w,landStartTime[i]);
                int f2=sl+landDuration[i];

                m=Math.min(m,Math.min(f1,f2));
            }
        }
        return m;
    }
}