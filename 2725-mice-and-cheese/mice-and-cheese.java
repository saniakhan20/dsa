class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int t=0,r2=0,n=reward1.length;
        for(int i:reward2)
        r2+=i;
        Integer[] d=new Integer[n];
        for(int i=0;i<n;i++)
        d[i]=reward1[i]-reward2[i];
        Arrays.sort(d,Collections.reverseOrder());
        for(int i=0;i<k;i++)
        t+=d[i];
        return t+r2;
    }
}