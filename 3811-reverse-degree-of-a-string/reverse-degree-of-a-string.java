class Solution {
    public int reverseDegree(String s) {
        int sm=0;
        for(int i=0;i<s.length();i++)
        {
            sm+=(i+1)*('z'-s.charAt(i)+1);
        }
        return sm;
    }
}