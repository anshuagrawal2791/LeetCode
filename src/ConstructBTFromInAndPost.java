/**
 * Created by anshu on 24/06/17.
 */
public class ConstructBTFromInAndPost {
    int root;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        root=inorder.length-1;
        return build(postorder,inorder,0,inorder.length-1);
    }
    TreeNode build(int post[],int in[],int start,int end){
        if(end<start){
            return null;
        }
        TreeNode node = new TreeNode(post[root]);
        int x = search(in,start,end,post[root]);
        root--;
        node.right=build(post,in,x+1,end);
        node.left = build(post,in,start,x-1);
        return node;
    }
    int search(int a[],int start,int end,int x){
        for(int i=start;i<=end;i++)
            if(a[i]==x)
                return i;
        return -1;
    }
}
