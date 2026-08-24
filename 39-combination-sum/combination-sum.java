class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        backtrack(l,new ArrayList<>(),target,candidates,0);
        return l;
    }
    public void backtrack(List<List<Integer>> l, List<Integer> sl,int t,int[] c,int s)
    {
        if(t==0) {l.add(new ArrayList<>(sl)); return;}
        if(t<0) return;
        for(int i=s;i<c.length;i++)
        {
            sl.add(c[i]);
            backtrack(l,sl,t-c[i],c,i);
            sl.remove(sl.size()-1);
        }
    }
}