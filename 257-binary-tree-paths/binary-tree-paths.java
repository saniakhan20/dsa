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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        if(root==null ) return l;
        dfs(root,"",l);
        return l;
    }
    public void dfs(TreeNode root,String s,List<String> l)
    {
        if(root==null) return ;
        if(root.left==null && root.right==null) 
        { l.add(s+root.val); return; }
        dfs(root.left,s+root.val+"->",l);
        dfs(root.right,s+root.val+"->",l);
    }
}