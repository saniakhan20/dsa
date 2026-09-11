class Solution {
    public int totalNumbers(int[] digits) {
        List<Integer> l=new ArrayList<>();
        boolean[] used=new boolean[digits.length];
        perm(digits,used,0,0,l);
        Set<Integer> s=new HashSet<>();
        for(int i:l)
        {
            if(i>=100 && i%2==0) s.add(i);
        }
        return s.size();
    }
    public void perm(int[] digits, boolean[] used, int c,int n,List<Integer> l)
    {
        if(c==3) {l.add(n); return;}
        for(int i=0;i<digits.length;i++)
        {
            if(used[i]) continue;
            if(c==0 && digits[i]==0) continue;
            used[i]=true;
            perm(digits,used,c+1,n*10+digits[i],l);
            used[i]=false;
        }
    }
}