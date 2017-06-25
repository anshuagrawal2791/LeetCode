/**
 * Created by anshu on 25/06/17.
 */
public class SortedListToBST {
    ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int n = len(head);
        cur=head;
        return build(n);
    }
    TreeNode build(int n){
        if(n<=0)
            return null;
        TreeNode left = build(n/2);
        TreeNode root = new TreeNode(cur.val);
        cur=cur.next;
        root.left=left;
        root.right=build(n-n/2-1);
        return root;
    }
    int len(ListNode head){
        int length=0;
        while(head!=null){
            head=head.next;
            length++;
        }
        return length;
    }
}
