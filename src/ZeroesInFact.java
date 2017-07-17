/**
 * Created by anshu on 17/07/17.
 */
public class ZeroesInFact {
    public int trailingZeroes(int n) {
        int sum=0;
        while(n>0){
            sum+=(n/5);
            n/=5;
        }
        return sum;
    }
}
