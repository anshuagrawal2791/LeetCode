import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
public class AllPossibleBSTs {
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new ArrayList<>();
        return formTrees2(1,n);
    }
    List<TreeNode> formTrees2(int start,int end){

        List<TreeNode> li = new ArrayList<>();
        if(start>end)
        {
            li.add(null);
            return li;
        }
        // if(start==end){
        //     li.add(new TreeNode(start));
        //     return li;
        // }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftlist = formTrees2(start,i-1);
            List<TreeNode> rightlist =formTrees2(i+1,end);
            for(int j=0;j<leftlist.size();j++){
                TreeNode left = leftlist.get(j);
                for(int k=0;k<rightlist.size();k++){
                    TreeNode right = rightlist.get(k);
                    TreeNode root = new TreeNode(i);
                    root.left=left;
                    root.right = right;
                    li.add(root);
                }
            }
        }
        return li;
    }



    // TreeNode formTrees(TreeNode root,int li,int lj,int ri,int rj,int i){
    //     if(lj>li||rj>ri){
    //         return null;
    //     }
    //     root = new TreeNode(i);
    //     for(int l=li;l<=lj;l++){

    //     root.left=formTrees(root.left,li,l-1,l+1,lj,l);
    //         for(int r=ri;r<=rj;r++){
    //             // root.right= new TreeNode(r);
    //             root.right=formTrees(root.right,ri,r-1,r+1,rj,r);
    //         }
    //     }
    //     return root;
    // }

    // TreeNode formTrees(TreeNode root,int i,int j){
    //     if(j<i)
    //     return null;
    //     for(int x=i;x<=j;x++){
    //         root=new TreeNode(x);
    //         root.left=formTrees(root.left,i,x-1);
    //         root.right=formTrees(root.right,x+1,j);
    //     }
    //     return root;
    // }
}
