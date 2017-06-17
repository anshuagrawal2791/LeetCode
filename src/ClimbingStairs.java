/**
 * Created by anshu on 18/06/17.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==1||n==0)
            return 1;
        if(n==2)
            return 2;
        int a[] = new int[n];
        a[n-1]=1;
        a[n-2]=2;
        for(int i=n-3;i>=0;i--)
            a[i]=a[i+1]+a[i+2];
        return a[0];
    }
}
