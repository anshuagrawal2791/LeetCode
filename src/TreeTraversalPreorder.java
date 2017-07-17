import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by anshu on 17/07/17.
 */
public class TreeTraversalPreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        if(root==null)
            return visited;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        // visited.add(root.val);
        while(!s.isEmpty()){
            TreeNode cur = s.pop();
            visited.add(cur.val);
            if(cur.right!=null){
                s.push(cur.right);
                // visited.add(cur.right.val);
            }
            if(cur.left!=null){
                s.push(cur.left);
                // visited.add(cur.left.val);
            }
        }
        return visited;
    }
}
