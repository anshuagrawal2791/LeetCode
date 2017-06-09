/**
 * Created by anshu on 09/06/17.
 */
public class NextPermutation {
    public void nextPermutation(int[] a) {
        int n = a.length;
        int i;
        for(i=n-1;i>0;){
            if(a[i-1]>=a[i])
                i--;
            else break;

        }
        i--;

        if(i==-1){
            reverse(a,0,n-1);
        }else if(i!=-1){
            int min = Integer.MAX_VALUE;
            int minj=i+1;
            for(int j=n-1;j>=i+1;j--){
                if(a[j]>a[i]&&a[j]<min)
                {
                    min=a[j];
                    minj=j;
                }
            }
            int temp = a[minj];
            a[minj]=a[i];
            a[i]=temp;
            reverse(a,i+1,n-1);
        }
    }
    void reverse(int a[],int l,int h){
        for(int i=0;i<(((h-l+1)/2));i++){
            int temp=a[i+l];
            a[i+l]=a[h-i];
            a[h-i]=temp;
        }
    }
}
