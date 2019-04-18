/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class balancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
       int l = Depth(root.left);
       int r = Depth(root.right);
        return  (int)Math.abs(l-r) < 2 && isBalanced(root.left) && isBalanced(root.right);   
    }
    public static int Depth(TreeNode n)
       {
           if(n == null)
               return 0;
           return Math.max(Depth(n.left),Depth(n.right)) + 1;
       }
}