/**
 * Created by anshu on 20/06/17.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int target) {
        // if(head==null || head.next==null)
        // return head;
        ListNode x = head;
        ListNode pre=null;
        while(x!=null&&x.val>=target){
            pre=x;
            x=x.next;}
        if(x==null)
            return head;
        // System.out.println(x.val);
        ListNode y;
        if(x!=head){
            pre.next=x.next;
            x.next=head;
            head=x;
            y=pre.next;
        }else
        {
            pre=x;
            y=x.next;

        }
        // System.out.println(x.val+" "+y.val+" "+pre.val);
        ListNode counter = head;

        while(y!=null){
            //  System.out.println(y.val+" "+((pre!=null)?pre.val:pre));
            while(y!=null&&y.val>=target){
                pre=y;
                y=y.next;
            }
            if(y==null)
                return head;
            if(pre!=counter){
                pre.next=y.next;
                y.next=counter.next;
                counter.next=y;
                counter=counter.next;
                y=pre.next;}
            else{
                pre=y;
                y=y.next;
                counter=counter.next;
            }

        }
        return head;


    }
}
