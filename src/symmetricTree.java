/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymm(root.left, root.right);

	}

	public boolean isSymm(TreeNode p, TreeNode q) {
		if (q == null && p == null)
			return true;
		if (q == null || p == null)
			return false;
		return (p.val == q.val) && isSymm(p.left, q.right) && isSymm(p.right, q.left);
	}
}