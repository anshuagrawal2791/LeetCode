/**
 * Created by anshu on 08/06/17.
 */
public class RemoveElement {
    public int removeElement(int[] a, int val) {
        int i=0,j=a.length-1;
        for(;i<=j;){
            if(a[i]==val){
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                j--;
            }
            else
                i++;

        }
        return i;
    }
}
