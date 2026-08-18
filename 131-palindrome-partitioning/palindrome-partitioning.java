class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l=new ArrayList<>();
        List<String> sl=new ArrayList<>();
        back(l,sl,s,0);
        return l;
    }
    public void back(List<List<String>> l, List<String> sl, String s, int n)
    {
        if(s.length()==n)
        {l.add(new ArrayList<>(sl)); return;}
        for(int i=n;i<s.length();i++)
        {
            if(palin(s,n,i))
            {
                sl.add(s.substring(n,i+1));
                back(l,sl,s,i+1);
                sl.remove(sl.size()-1);
            }
        }
    }
    public boolean palin(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}