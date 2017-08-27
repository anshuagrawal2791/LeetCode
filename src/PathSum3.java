/**
 * Created by anshu on 25/07/17.
 */
public class PathSum3 {
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
        public int pathSum(TreeNode root, int sum) {
            if(root==null)
                return 0;
            return check(root,sum,false);
        }
        int check(TreeNode root,int sum,boolean inc){
            // System.out.println(((root!=null)?root.val:"null")+" sum: "+sum);
            // if(root!=null&&root.left==null&&root.right==null&&root.val==sum)
            //     return 1;
            int x=0;

            if(root.left==null&&root.right==null&&root.val==sum)
            {
                x+=1;
                return x;
            }
            else if(sum==root.val)
                x+= 1;


            if(inc){
                // int x=0;
                if(root.left!=null)
                    px+=check(root.left,sum-root.val,inc);
                if(root.right!=null)
                    x+=check(root.right,sum-root.val,inc);
                return x;
            }else{
                // int x=0;
                if(root.left!=null)
                    x+=check(root.left,sum-root.val,!inc)+check(root.left,sum,inc);
                if(root.right!=null)
                    x+=check(root.right,sum-root.val,!inc)+check(root.right,sum,inc);
                return x;
            }
        }
    }
}
