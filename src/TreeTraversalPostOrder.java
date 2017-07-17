import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by anshu on 17/07/17.
 */
public class TreeTraversalPostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while(!s.isEmpty()||p!=null){
            if(p!=null){
                s.push(p);
                result.add(0,p.val);
                p=p.right;
            }else{
                TreeNode node = s.pop();
                p=node.left;
            }
        }
        return result;
    }
}
