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
    public int sum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return sum;
    }
    public void helper(TreeNode root,int value)
    {
        if(root.left== null && root.right== null){
            sum+= value*10+root.val;
            return;
        }
        if(root.left!=null){
            helper(root.left,value*10+root.val);
        }
        if(root.right!=null){
            helper(root.right,value*10+root.val);    
        }
    }
}
