/**
 * Created by anshu on 08/06/17.
 */
public class SwapAdjacentPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode curX=head;
        if(curX==null)
            return null;
        ListNode curY=curX.next;
        ListNode prevX=null;
        while(curY!=null&&curX!=null){
            curX.next=curY.next;
            curY.next=curX;
            if(prevX!=null)
                prevX.next=curY;
            else
                head=curY;
            prevX=curX;
            curX=curX.next;

            if(curX!=null)
                curY = curX.next;
            else curY=null;
        }
        return head;
    }
}
