class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> h=new HashMap<>();
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++) a[i]=arr[i];
        Arrays.sort(a);
        int r=1;
        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]>a[i-1]) r++;
            h.put(a[i],r);
        }
        for(int i=0;i<a.length;i++)
        arr[i]=h.get(arr[i]);
        return arr;
    }
}