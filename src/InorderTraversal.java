import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
public class InorderTraversal {
    List<Integer> li = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);
        return li;
    }
    void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }
}
