/**
 * Created by anshu on 27/06/17.
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        return check(root,sum);
    }
    boolean check(TreeNode root, int sum){
        if(sum==root.val&&root.left==null&&root.right==null)
            return true;
        // if(sum<=root.val)
        // return false;
        boolean a=false,b=false;
        if(root.left!=null)
            a=check(root.left,sum-root.val);
        if(root.right!=null)
            b=check(root.right,sum-root.val);
        return a||b;
    }
}
