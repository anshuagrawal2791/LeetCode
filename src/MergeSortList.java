/**
 * Created by anshu on 17/07/17.
 */
public class MergeSortList {
    public ListNode sortList(ListNode head) {
        int n = len(head);
        // System.out.println(n+"");
        if(n==0||n==1)
            return head;
        return sort(head,n);
    }
    ListNode sort(ListNode head,int n){
        if(n==1)
            return head;
        ListNode slow = head,fast = head.next;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;fast=fast.next.next;
        }
        // System.out.println(head.val+" "+slow.next.val);
        ListNode temp=slow.next;
        slow.next = null;
        // System.out.println(head.val+" "+temp.val);

        return merge(sort(head,(n%2==0)?n/2:n/2+1), sort(temp,n/2));
        // return head;
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode l3;
        ListNode head=null;
        if(l1.val<l2.val)
        {
            head=l1;
            l1=l1.next;

        }else
        {
            // l3=l2;
            head=l2;
            l2=l2.next;
            // head=l2;
        }
        l3=head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                l3.next=l1;
                l1=l1.next;
            }else{
                l3.next=l2;
                l2=l2.next;
            }
            l3=l3.next;
        }
        while(l1!=null){
            l3.next=l1;
            l1=l1.next;
            l3=l3.next;
        }
        while(l2!=null){
            l3.next=l2;
            l2=l2.next;
            l3=l3.next;

        }
        return head;

    }
    int len(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;

    }
}
