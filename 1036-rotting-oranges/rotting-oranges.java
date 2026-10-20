class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int f=0,c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                else if(grid[i][j]==1) f++;
            }
        }   
        int[][] d={{0,-1},{0,1},{1,0},{-1,0}};
        while(!q.isEmpty() && f>0)
        {
            int s=q.size();
            for(int k=0;k<s;k++)
            {
                int[] a=q.poll();
                for(int[] dir:d)
                {int i=a[0]+dir[0],j=a[1]+dir[1];
            if(i<m&&j<n&&i>=0&&j>=0 && grid[i][j]==1)
            {
                grid[i][j]=2;
                q.offer(new int[]{i,j});
                f--;
            }
        }}c++;
    }
    return f==0?c:-1;
}}