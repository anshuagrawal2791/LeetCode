/**
 * Created by anshu on 26/07/17.
 */
public class DiameterOfBT {
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
        int max=0;
        public int diameterOfBinaryTree(TreeNode root) {

            if(root==null)
                return 0;

            len(root);
            return max;
            // int l1=0,l2=0;
            // if(root.left!=null)
            //     l1= len(root.left)+1;
            // if(root.right!=null)
            //     l2= len(root.right)+1;
            // return l1+l2;

        }
        int len (TreeNode root){
            if(root==null)
                return 0;
            int left = len(root.left);
            int right = len(root.right);
            max = Math.max(max,left+right);
            return Math.max(left,right)+1;
        }
    }
}
