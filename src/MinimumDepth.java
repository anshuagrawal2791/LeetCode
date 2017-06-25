/**
 * Created by anshu on 25/06/17.
 */
public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return height(root,1);
    }
    int height(TreeNode a,int d){
        if(a==null)
            return Integer.MAX_VALUE;
        if(a.left==null&&a.right==null)
            return d;
        return Math.min(height(a.left,d+1),height(a.right,d+1));
    }
}
