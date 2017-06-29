/**
 * Created by anshu on 29/06/17.
 */
public class SumNumbers {
    int ans;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        check(root,root.val+"");
        return ans;
    }
    void check(TreeNode root, String prefix){
        if(root.left==null&&root.right==null){
            ans+=Integer.parseInt(prefix);
            return;
        }
        if(root.left!=null){
            check(root.left,prefix+root.left.val);
        }
        if(root.right!=null)
            check(root.right,prefix+root.right.val);
    }
}
