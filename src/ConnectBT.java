/**
 * Created by anshu on 27/06/17.
 */
class TreeLinkNode {
         int val;
         TreeLinkNode left, right, next;
         TreeLinkNode(int x) { val = x; }
     }
public class ConnectBT {
    public void connect(TreeLinkNode root) {
        flat(root);
    }
    void flat(TreeLinkNode root){
        if(root==null)
            return;
        if(root.left!=null){
            root.left.next=root.right;
            if(root.next!=null)
                root.right.next=root.next.left;
        }
        flat(root.left);
        flat(root.right);
    }
}
