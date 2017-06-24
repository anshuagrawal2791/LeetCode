/**
 * Created by anshu on 24/06/17.
 */
public class ConstructBTFromInAndPre {
    int root=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        return build(preorder,inorder,0,preorder.length-1);
    }
    TreeNode build(int pre[],int in[], int start,int end){
        if(end<start)
            return null;
        // if(start==end){
        //     return new TreeNode(in[start]);
        // }
        TreeNode node = new TreeNode(pre[root]);

        int x = search(in,pre[root],start,end);
        root++;
        node.left = build(pre,in,start,x-1);
        node.right = build(pre,in,x+1,end);
        return node;

    }

    int search(int a[],int x,int start,int end){
        for(int i=start;i<=end;i++){
            if(a[i]==x)
                return i;
        }
        return -1;
    }
}
