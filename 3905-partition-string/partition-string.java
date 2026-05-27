class Solution {
    public List<String> partitionString(String s) {
        Set<String> hs = new HashSet<>();
        List<String> l= new ArrayList<>();
        int i = 0;
        while (i < s.length()) 
        {
            String curr = "";
            int j = i;
            while (j < s.length()) 
            {
                curr += s.charAt(j);
                if (!hs.contains(curr))
                {
                    hs.add(curr);
                    l.add(curr);
                    break;
                }
                j++;
            }
            i = j + 1;
        }
        return l;
    }
}