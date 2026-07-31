class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<word.length();i++) 
        { 
            char c=word.charAt(i); 
            m.put(c,m.getOrDefault(c,0)+1); 
        }
        List<Integer> f=new ArrayList<>(m.values());
        f.sort(Collections.reverseOrder());
        int c=0;
        for(int i=0;i<f.size();i++)
        c+=f.get(i)*(i/8+1);
        return c;
    }
}