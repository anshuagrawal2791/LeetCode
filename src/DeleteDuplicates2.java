/**
 * Created by anshu on 20/06/17.
 */
public class DeleteDuplicates2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode cur = head;
        ListNode prev=null;
        ListNode x = cur;
        while(x!=null){
            while(x.next!=null&&x.val==x.next.val)
                x=x.next;
            cur.next=x.next;
            prev=cur;
            cur=cur.next;
            x=cur;

        }
        return head;
    }
}
