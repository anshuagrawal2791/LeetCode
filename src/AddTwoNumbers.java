/**
 * Created by anshu on 06/06/17.
 */

class ListNode {
        int val;
    ListNode next;
         ListNode(int x) { val = x; }
     }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        int carry=0;
        while(l1!=null&&l2!=null){
            int a = l1.val+l2.val+carry;
            carry = a/10;
            a%=10;
            ListNode node = new ListNode(a);
            node.next=l3;
            l3=node;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int a = l1.val+carry;
            carry = a/10;
            a%=10;
            ListNode node = new ListNode(a);
            node.next=l3;
            l3=node;
            l1=l1.next;
        }
        while(l2!=null){
            int a = l2.val+carry;
            carry = a/10;
            a%=10;
            ListNode node = new ListNode(a);
            node.next=l3;
            l3=node;
            l2=l2.next;
        }
        while(carry>0){
            int a = carry%10;
            carry/=10;
            ListNode node = new ListNode(a);
            node.next=l3;
            l3=node;
        }
        // print(l3);
        ListNode rl3;
        return rl3=reverse(l3);
    }
    ListNode reverse(ListNode l3){
        ListNode cur = l3;
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
    void print(ListNode l3){
        while(l3!=null){
            System.out.print(l3.val+"->");
            l3=l3.next;
        }
    }
}
