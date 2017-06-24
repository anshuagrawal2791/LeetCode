import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by anshu on 24/06/17.
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<List<Integer>>();
        Stack<List<TreeNode>> s = new Stack<>();
        List<List<Integer>> finalList = new ArrayList<>();
        List<TreeNode>x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        x.add(root);
        y.add(root.val);
        s.push(x);
        finalList.add(y);
        while(!s.isEmpty()){
            x = s.pop();
            List<TreeNode> newx = new ArrayList<>();
            List<Integer> newy = new ArrayList<>();
            for(int i=0;i<x.size();i++){
                TreeNode cur = x.get(i);
                TreeNode left = cur.left;
                TreeNode right = cur.right;
                if(left!=null){
                    newx.add(left);
                    newy.add(left.val);
                }
                if(right!=null){
                    newx.add(right);
                    newy.add(right.val);
                }

            }
            if(newx.size()>0){
                s.push(newx);
                finalList.add(newy);
            }
        }
        return finalList;
    }
}
