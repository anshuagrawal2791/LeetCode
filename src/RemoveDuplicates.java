/**
 * Created by anshu on 08/06/17.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] a) {
        if(a.length==0)
            return 0;
        if(a.length==1)
            return 1;
        int j=1;
        int i=0;
        for(;i<a.length;i++){

            for(;j<a.length&&a[i]==a[j];j++);
            if(j==a.length)
                break;
            if(j!=i+1&&j<a.length){
                int temp=a[j];
                a[j]=a[i+1];
                a[i+1]=temp;
                j++;
            }


        }
        System.out.println(i);
        return i+1;
    }
}
