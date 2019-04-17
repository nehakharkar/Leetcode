
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class minDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if(root ==null)
            return 0;
        if(root.left!=null && root.right!=null)
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        else if (root.left== null)
            return minDepth(root.right)+1;
        else if(root.right==null)
            return minDepth(root.left)+1;
        return 0;
    }
}