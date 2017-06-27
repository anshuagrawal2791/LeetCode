/**
 * Created by anshu on 27/06/17.
 */
public class FlattenBT {
    TreeNode head;
    public void flatten(TreeNode root) {
        head =root;
        flat(root);
    }
    TreeNode flat(TreeNode root){
        if(root==null)
            return null;
        head=root;
        if(root.left==null&&root.right==null){
            // head=root;
            return root;
        }
        TreeNode temp = root.right;
        TreeNode left = flat(root.left);
        // head=head.right;
        // root.right=left;
        root.left=null;
        if(left!=null)
            root.right=left;
        // root.right=(left!=null)?left;
        head.right=flat(temp);
        // head=left;
        // TreeNode right = flat(temp);
        // head.right=right;
        // head = right;
        // head=right;
        return root;
    }
}
