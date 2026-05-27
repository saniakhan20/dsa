class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer> l=new HashMap<>();
        Map<Character,Integer> u=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c)) l.put(c,i);
            else 
            { if(!u.containsKey(c)) u.put(c,i); }
        }
        int c=0;
        for(char i: l.keySet())
        {
            char up=Character.toUpperCase(i);
            if(u.containsKey(up) && 
            u.get(up)>l.get(i))
            c++;
        }
        return c;
    }
}