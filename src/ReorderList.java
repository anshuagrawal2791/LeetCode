/**
 * Created by anshu on 17/07/17.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null)
            return;
        ListNode slow = head, fast=head.next;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(slow.val+" "+((fast!=null)?fast.val:null));
        if(slow.next==null)
            return;
        ListNode second = reverse(slow.next);
        slow.next=null;
        weave(head,second);
    }
    void weave(ListNode first,ListNode second){
        while(second!=null&&first!=null){
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            first.next=second;
            second.next=next1;
            first=next1;
            second=next2;
        }
    }

    ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        ListNode next;
        while(cur!=null){
            next = cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
