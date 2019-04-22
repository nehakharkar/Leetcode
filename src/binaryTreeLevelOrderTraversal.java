import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class binaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new LinkedList();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int qsize= 0;
        while(!q.isEmpty())
        {
        List<Integer> iList = new LinkedList();
        qsize = q.size();
        for(int i = 0 ;i<qsize; i++)
        {
            TreeNode dummy = q.remove();
            iList.add(dummy.val);
            if(dummy.left != null)
            {
                q.add(dummy.left);
            }
            if(dummy.right != null)
            {
                q.add(dummy.right);
            }
            
        }
         result.add(iList);
            
        }
        return result;
    }
}