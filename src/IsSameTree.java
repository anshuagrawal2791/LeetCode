import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
public class IsSameTree {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    boolean check(TreeNode a, TreeNode b){
        if(a==null&&b==null)
            return true;
        if(a!=null&&b!=null)
            return (a.val==b.val&&check(a.left,b.left)&&check(a.right,b.right));
        return false;
    }
}
