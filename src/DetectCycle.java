/**
 * Created by anshu on 17/07/17.
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        if(head==null||head.next==null)
            return null;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                // return slow;
                break;
            }
        }
        ListNode x=head;
        while(x!=null&&slow!=null){
            if(x==slow)
                return x;
            x=x.next;
            slow=slow.next;
        }

        return null;
    }
}
