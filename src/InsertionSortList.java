/**
 * Created by anshu on 17/07/17.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
            return head;
        ListNode here = head.next;
        ListNode herePrev = head;
        while(here !=null){
            ListNode cur = head;
            ListNode curPrev = null;
            while(cur!=here&cur.val<here.val){
                curPrev=cur;
                cur=cur.next;
            }
            if(cur==here){
                herePrev = here;
                here=here.next;

            }else if(cur==head){
                herePrev.next = here.next;
                here.next=head;
                head=here;
                here=herePrev.next;
            }else{
                herePrev.next = here.next;
                here.next=cur;
                curPrev.next = here;
                here = herePrev.next;
            }
        }
        return head;
    }
}
