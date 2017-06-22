import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
public class IsValidBST {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {

        inorder(root);
        for(int i=0;i<list.size()-1;i++)
            if(list.get(i)>=list.get(i+1))
                return false;
        return true;
    }
    void inorder(TreeNode root){

        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
