/**
 * Created by anshu on 27/07/17.
 */
public class MergeBT {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            return merge(t1,t2);
        }
        TreeNode merge(TreeNode a,TreeNode b){
            if(a==null&&b==null)
                return null;
            TreeNode root=null;
            if(a!=null&&b!=null){
                root = new TreeNode(a.val+b.val);
                root.left = merge(a.left,b.left);
                root.right = merge(a.right,b.right);
            }
            else if(a!=null){
                root = new TreeNode(a.val);
                root.left = a.left;
                root.right= a.right;
            }else{
                root = new TreeNode(b.val);
                root.left=b.left;
                root.right = b.right;
            }
            return root;
        }
    }
}
