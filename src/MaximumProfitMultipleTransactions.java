/**
 * Created by anshu on 27/06/17.
 */
public class MaximumProfitMultipleTransactions {
    public int maxProfit(int[] a) {
        int global = 0;
        int i=0,j=1;
        int n = a.length;
        while(i<n&&j<n){

            while(j<n&&a[j]>a[j-1])
                j++;
            int diff = a[j-1]-a[i];
            global+=diff;
            i=j;
            j=i+1;


        }
        return global;
    }
}
