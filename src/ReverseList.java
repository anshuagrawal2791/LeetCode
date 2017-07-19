/**
 * Created by anshu on 19/07/17.
 */
public class ReverseList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode cur = head;
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
}
