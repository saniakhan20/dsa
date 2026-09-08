class Solution {
    public int countCommas(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(i<=999) continue;
            c+=comma(i);
        }
        return c;
    }
    public int comma(int n)
    {
        int c=0;
        while(n>=1000)
        {
            n/=1000;
            c++;
        }
        return c;
    }
}