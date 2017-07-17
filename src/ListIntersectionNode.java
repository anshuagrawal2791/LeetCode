/**
 * Created by anshu on 17/07/17.
 */
public class ListIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1 = len(headA);
        int c2 = len(headB);
        int d = Math.abs(c1-c2);
        ListNode cur1= headA;
        ListNode cur2= headB;
        if(c1>c2){
            while(d>0){
                cur1=cur1.next;
                d--;
            }
        }else{
            while(d>0){
                cur2=cur2.next;
                d--;
            }
        }
        while(cur1!=null&&cur2!=null){
            if(cur1==cur2){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return null;


    }
    int len(ListNode head){
        int ans=0;
        while(head!=null){
            ans++;
            head=head.next;
        }
        return ans;
    }
}
