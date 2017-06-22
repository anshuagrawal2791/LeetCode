/**
 * Created by anshu on 23/06/17.
 */
public class NumberOfBST {
    public int numTrees(int n) {
        int a[] = new int[n+1];
        a[0]=1;
        a[1]=1;


        int i=2;
        while(i<=n){
            for(int j=0;j<i;j++){
                a[i]+=a[j]*a[i-1-j];
            }
            i++;
        }
        return a[n];
    }
}
