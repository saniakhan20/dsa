class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb=new StringBuilder();
        /*for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(sb.contains(c)) continue;
            if(sb.charAt(sb.size()-1)<c) sb.append(c);
            else
            {
                if(future(s.substring(i,s.length()),c)) 
                { sb.remove(sb.size()-1); sb.append(c); }
                else sb.append(c);
            }
        }
        return sb.toString();*/

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