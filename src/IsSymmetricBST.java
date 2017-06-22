import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
public class IsSymmetricBST {
    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return check(root.left,root.right);
        // out(root);
        // if(l1.equals(l2))
        // return true;
        /// return false;
    }
    boolean check(TreeNode a,TreeNode b){
        if(a==null&&b==null)
            return true;
        if(a!=null&&b!=null){
            return (a.val==b.val&&check(a.left,b.right)&&check(a.right,b.left));
        }
        return false;
    }
    // void in (TreeNode root){
    //     if(root==null){
    //     l1.add(null);
    //     return;}
    //     in(root.left);
    //     l1.add(root.val+"");
    //     in(root.right);
    // }
    // void out(TreeNode root){
    //     if(root==null){
    //     l2.add(null);
    //     return;}
    //     out(root.right);
    //     l2.add(root.val+"");
    //     out(root.left);
    // }
}
