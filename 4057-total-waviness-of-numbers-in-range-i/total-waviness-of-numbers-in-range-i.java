class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++)
        {
            c+=wave(i);
        }
        return c;
    }
    public int wave(int n)
    {
        String s=String.valueOf(n);
        if(s.length()<3) return 0;
        int c=0;
        for(int i=1;i<s.length()-1;i++)
        {
            char p=s.charAt(i-1);
            char cu=s.charAt(i);
            char ne=s.charAt(i+1);
            if(cu>p && cu>ne) c++;
            else if(cu<p && cu<ne) c++;
        }
        return c;
    }
}