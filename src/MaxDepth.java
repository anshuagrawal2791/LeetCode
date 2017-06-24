/**
 * Created by anshu on 24/06/17.
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return max(root);
    }
    int max(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(max(root.left),max(root.right));
    }
}
