class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> l=new HashSet<>();
        Set<Character> u=new HashSet<>();
        for(char c :word.toCharArray())
        {
            if(Character.isLowerCase(c)) l.add(c);
            else u.add(c);
        }
        int c=0;
        for(char i:l)
        {
            if(u.contains(Character.toUpperCase(i))) c++;
        }
        return c;
    }
}