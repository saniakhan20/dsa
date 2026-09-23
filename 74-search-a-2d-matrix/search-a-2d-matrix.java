class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int l=0,r=m*n-1;
        while(l<=r)
        {
            int mm=l+(r-l)/2;
            int mid=matrix[mm/n][mm%n];
            if(mid==target) return true;
            if(mid<target) l=mm+1;
            else r=mm-1;
        }
        return false;
    
    }
}