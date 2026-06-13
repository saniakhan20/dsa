class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String i:words)
        {
            int s=sum(i,weights);
            int n=s%26;
            sb.append((char)('z'-n));
        }
        return sb.toString();
    }
    public int sum(String s,int[] weights)
    {
        int sum=0;
        for(char c:s.toCharArray())
        {
            sum+=weights[c-'a'];
        }
        return sum;
    }
}