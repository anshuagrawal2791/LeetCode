/**
 * Created by anshu on 08/06/17.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = null;
        while(l1!=null&&l2!=null){
            ListNode next;
            if(l1.val<l2.val){
                next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                next=new ListNode(l2.val);
                l2=l2.next;
            }
            next.next=cur;
            cur=next;
        }
        // System.out.println(cur.val);
        while(l1!=null){
            ListNode next = new ListNode(l1.val);
            next.next = cur;
            cur=next;
            l1=l1.next;
        }
        while(l2!=null){
            ListNode next = new ListNode(l2.val);
            next.next = cur;
            cur=next;
            l2=l2.next;
        }
        // System.out.println(cur.val);
        ListNode prev = null;
        ListNode next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;


    }
}
