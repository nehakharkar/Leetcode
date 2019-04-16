

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class univaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        boolean leftSide = (root.left == null) || ((root.val == root.left.val) && 
                                               isUnivalTree(root.left));
        boolean rightSide = (root.right == null) || ((root.val == root.right.val)                                                   && isUnivalTree(root.right));
        return leftSide && rightSide;
    }
}