class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int im=image[sr][sc];
        if(im==color) return image;
        dfs(image,sr,sc,color,im);
        return image;   
    }
    public void dfs(int[][] image, int sr, int sc, int color,int im)
    {
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=im)
        return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,im);
        dfs(image,sr-1,sc,color,im);
        dfs(image,sr,sc+1,color,im);
        dfs(image,sr,sc-1,color,im);
    }
}