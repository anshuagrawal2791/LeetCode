/**
 * Created by anshu on 23/06/17.
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n||head==null)
            return head;
        int diff = n-m+1;
        m--;
        ListNode cur = head;
        ListNode prev = null;
        while(m>0){
            prev=cur;cur=cur.next;
            m--;
        }

        // System.out.println("diff "+diff);
        // System.out.println(((prev!=null)?prev.val:prev)+" "+cur.val);
        ListNode start = cur;
        ListNode startprev = null;
        ListNode next=null;
        while(diff>0&&start!=null){
            // System.out.println(((startprev!=null)?startprev.val:startprev)+" "+((start!=null)?start.val:start)+" "+((next!=null)?next.val:next));
            next= start.next;
            start.next=startprev;
            startprev= start;
            start=next;
            diff--;
        }
        // System.out.println("after loop "+((startprev!=null)?startprev.val:startprev)+" "+((start!=null)?start.val:start)+" "+((next!=null)?next.val:next));
        if(prev!=null){
            prev.next=startprev;
            cur.next=start;
        }else{
            head=startprev;
            cur.next=start;
        }
        return head;
    }
}
