class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++)
        {
            if(digits(i)%t==0) return i;
        }
    }
    public int digits(int n)
    {
        int m=1;
        while(n>0)
        {
            m*=n%10;
            n/=10;
        }
        return m;
    }
}