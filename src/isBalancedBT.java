/**
 * Created by anshu on 25/06/17.
 */
public class isBalancedBT {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return check(root);
    }
    boolean check(TreeNode a){
        if(a==null)
            return true;
        int lh = height(a.left);
        int rh = height(a.right);
        int diff = Math.abs(lh-rh);
        return(diff<=1&&check(a.left)&&check(a.right));

    }
    int height(TreeNode a){
        if(a==null)
            return 0;
        return 1+Math.max(height(a.left),height(a.right));
    }
}
