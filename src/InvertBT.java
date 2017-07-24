/**
 * Created by anshu on 20/07/17.
 */
public class InvertBT {
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
        public TreeNode invertTree(TreeNode root) {
            return invert(root);
        }

        TreeNode invert(TreeNode root){
            if(root==null)
                return null;
            // System.out.println(root.val);
            if(root.left==null&&root.right==null)
                return root;
            TreeNode temp = root.left;
            root.left= invert(root.right);
            root.right = invert(temp);
            return root;
        }
    }
}
