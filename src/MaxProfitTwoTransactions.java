/**
 * Created by anshu on 29/06/17.
 */
public class MaxProfitTwoTransactions {
    public int maxProfit(int[] a) {
        int buy1=Integer.MIN_VALUE,buy2=Integer.MIN_VALUE;
        int sell1=0;
        int sell2=0;
        for(int i=0;i<a.length;i++){
            buy1 = Math.max(buy1,-a[i]);
            sell1=Math.max(sell1,a[i]+buy1);
            buy2=Math.max(buy2,sell1-a[i]);
            sell2 = Math.max(sell2,buy2+a[i]);
        }
        return sell2;
    }
}
