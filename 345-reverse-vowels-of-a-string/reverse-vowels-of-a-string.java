class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        sb.append(c);
        while(l<r)
        {
            char c1=sb.charAt(l), c2=sb.charAt(r);
            if(vowel(c1) && vowel(c2))
            {
                char t=c1;
                sb.setCharAt(l,c2);
                sb.setCharAt(r,t);
                l++; r--;
            }
            else if(!vowel(c1) && vowel(c2)) l++;
            else if(vowel(c1) && !vowel(c2)) r--;
            else {l++; r--;}
        }
        return sb.toString();
    }
    public boolean vowel(char c)
    {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}