class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        boolean[] vis=new boolean[26];
        for(char c:s.toCharArray())
        freq[c-'a']++;
        for(char c:s.toCharArray())
        {
            freq[c-'a']--;
            if(vis[c-'a']) continue;
            while(sb.length()>0 && sb.charAt(sb.length()-1)>c && 
            freq[sb.charAt(sb.length()-1)-'a']>0)
            {
                vis[sb.charAt(sb.length()-1)-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            vis[c-'a']=true;
            sb.append(c);
        }
        return sb.toString();
    }
}
