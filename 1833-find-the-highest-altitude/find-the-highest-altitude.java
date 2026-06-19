class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] a=new int[n+1];
        a[0]=0;
        int id=0,m=0;
        for(int i=1;i<n+1;i++)
        {
            a[i]=gain[id]+a[i-1];
            id++;
        }
        for(int i:a)
        if(i>m) m=i;
        return m;
    }
}