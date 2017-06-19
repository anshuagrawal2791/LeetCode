/**
 * Created by anshu on 20/06/17.
 */
public class DeleteDuplicatesLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode x = head;
        ListNode prevx= null;
        while(x.next!=null){
            ListNode cur=x;
            ListNode y = x.next;
            while(y!=null&&cur.val==y.val){
                cur=y;
                y=y.next;
            }
            // System.out.println(x.val+" "+((prevx!=null)?prevx.val:prevx)+" "+cur.val+" "+((y!=null)?y.val:y));

            if(x==head){
                if(cur==x){
                    prevx=x;
                    x=x.next;}
                else {
                    head=(y!=null)?y:null;
                    prevx=null;
                    x=y;
                    if(y==null)
                        return head;
                }
            }else{
                if(cur==x){
                    prevx.next=x;
                    prevx=x;
                    x=y;
                }else{
                    prevx.next=y;
                    x=y;
                    if(y==null)
                        return head;
                }
            }

        }
        return head;

    }
}
