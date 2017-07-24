/**
 * Created by anshu on 20/07/17.
 */
public class PalinLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class Solution {
        ListNode mid;
        public boolean isPalindrome(ListNode head) {
            if(head==null)
                return true;
            ListNode slow=head,fast=head;
            ListNode slowPre=null;
            int n=0;
            while(slow!=null&&fast!=null&&fast.next!=null){
                slowPre=slow;
                slow=slow.next;
                fast=fast.next.next;
                n+=1;
            }
            if(fast==null)
                n*=2;
            else if(fast.next==null)
                n=2*n+1;
            if(n%2==0)
                mid=slowPre;
            else mid=slow;
            return isPal(head,n);

        }
        boolean isPal(ListNode head,int n){
            // System.out.println(head.val+" "+mid.val);
            if(n==1||n==0){
                mid=mid.next;
                return true;
            }

            // mid=mid.next;
            if(isPal(head.next,n-2))
            {
                if(head.val==mid.val){
                    mid=mid.next;
                    return true;
                }
            }
            mid=mid.next;
            return false;
        }
    }
}
