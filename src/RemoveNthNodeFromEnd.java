/**
 * Created by anshu on 08/06/17.
 */
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode main = head;
        ListNode ref = head;
        ListNode prev = null;
        for(int i=0;i<n;i++){
            ref=ref.next;
        }
        while(ref!=null){
            prev=main;
            main = main.next;
            ref=ref.next;
        }
        if(prev!=null)
            prev.next=main.next;
        else
            head=main.next;
        return head;

    }
}
