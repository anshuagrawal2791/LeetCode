import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 27/06/17.
 */
public class PathSum {
    List<List<Integer>> finalList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null)
            return finalList;
        check(root,sum,new ArrayList<Integer>());
        return finalList;
    }
    void check(TreeNode root,int sum,List<Integer> li){
        if(sum==root.val&&root.left==null&&root.right==null)
        {
            li.add(root.val);
            finalList.add(li);
            return;
        }
        if(root.left!=null){
            List<Integer> li2 = new ArrayList<>(li);
            li2.add(root.val);
            check(root.left,sum-root.val,li2);
        }
        if(root.right!=null){
            List<Integer> li2 = new ArrayList<>(li);
            li2.add(root.val);
            check(root.right,sum-root.val,li2);
        }
    }
}
