class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> sl=new ArrayList<>();
        check(l,sl,k,n,1);
        return l;
    }
    public void check(List<List<Integer>> l, List<Integer> sl, int k, int n, int s)
    {
        if(sl.size()==k) { l.add(new ArrayList<>(sl)); return; }
        for(int i=s;i<=n;i++)
        {
            sl.add(i);
            check(l,sl,k,n,i+1);
            sl.remove(sl.size()-1);
        }
    }
}