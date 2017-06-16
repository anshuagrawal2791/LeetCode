/**
 * Created by anshu on 16/06/17.
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode main=head;
        ListNode mainPrev=null;
        ListNode aux = head;
        ListNode auxPrev = null;
        int len=print(head);
        int i=k%len;
        while(i>0){
            auxPrev=aux;
            aux=aux.next;
            if(aux==null)
            {
                aux=head;
                auxPrev=null;
            }
            i--;
        }
        while(aux!=null){
            auxPrev=aux;
            aux=aux.next;
            mainPrev=main;
            main=main.next;
        }
        if(main!=null&&main!=head){
            System.out.print(mainPrev.val+" "+main.val+" "+auxPrev.val+" "+aux);
            mainPrev.next=aux;
            auxPrev.next=head;
            head=main;}

        print(head);

        return head;
    }
    int print(ListNode head){
        ListNode x = head;
        int count=0;
        while(x!=null){
            System.out.println(x.val+"");
            x=x.next;
            count++;
        }
        return count;
    }
}
