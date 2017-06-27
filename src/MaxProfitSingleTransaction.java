/**
 * Created by anshu on 27/06/17.
 */
public class MaxProfitSingleTransaction {
    public int maxProfit(int[] a) {
        int global = 0;
        int i=0,j=1;
        int n = a.length;
        while(i<n&&j<n){

            if(a[j]>a[i]){
                int diff = a[j]-a[i];
                global = Math.max(global,diff);
                j++;
            }else
            {
                i++;
                j=i+1;
            }

        }
        return global;
    }
}
