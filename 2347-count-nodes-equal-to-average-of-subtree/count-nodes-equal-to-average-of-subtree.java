/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        sum(root);
        return c;
    }
    public int[] sum(TreeNode root)
    {
        if(root==null) return new int[]{0,0};
        int[] l=sum(root.left);
        int[] r=sum(root.right);
        int s=l[0]+r[0]+root.val;
        int n=l[1]+r[1]+1;
        if(root.val==s/n) c++;
        return new int[]{s,n};
    }    
    
}