/**
 * Created by anshu on 27/07/17.
 */
public class SubTreeOfAnotherTree {
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
        public boolean isSubtree(TreeNode s, TreeNode t) {
            return check(s,t,false);
        }
        boolean check(TreeNode s,TreeNode t,boolean inc){
            if(s==null&&t==null)
                return true;
            if(s!=null&&t!=null){
                if(inc){
                    return (s.val==t.val)&&check(s.left,t.left,inc)&&check(s.right,t.right,inc);
                }else{
                    if(s.val==t.val){
                        return (check(s.left,t.left,!inc)&&check(s.right,t.right,!inc))||(check(s.left,t,inc))||(check(s.right,t,inc));
                    }else{
                        return (check(s.left,t,inc))||(check(s.right,t,inc));
                    }
                }
            }
            return false;
        }
    }
}
