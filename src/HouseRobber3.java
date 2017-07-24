/**
 * Created by anshu on 24/07/17.
 */
public class HouseRobber3 {
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
        public int rob(TreeNode root) {
            return check(root,0);
        }
        int check(TreeNode root, int cur){
            if(root==null)
                return 0;
            if(root.left==null&&root.right==null)
                return root.val;
            if(root.left!=null&&root.right!=null){
                int exclude = check(root.left,cur)+check(root.right,cur);
                int include = check(root.left.left,cur)+check(root.left.right,cur)+check(root.right.left,cur)+check(root.right.right,cur)+root.val;
                return Math.max(exclude,include);
            }
            else if(root.left!=null){
                int exclude = check(root.left,cur);
                int include = check(root.left.left,cur)+check(root.left.right,cur)+root.val;
                return Math.max(exclude,include);
            }
            else{
                int exclude = check(root.right,cur);
                int include = check(root.right.left,cur)+check(root.right.right,cur)+root.val;
                return Math.max(exclude,include);
            }
        }
    }
}
