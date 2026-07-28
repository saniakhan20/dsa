class Solution {
    public String smallestPalindrome(String s) {
        int p=s.length()/2;
        char[] c=s.toCharArray();
        Arrays.sort(c,0,p);
        for(int i=0;i<p;i++)
        c[s.length()-1-i]=c[i];
        return new String(c);
    }
}