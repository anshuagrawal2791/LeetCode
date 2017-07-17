/**
 * Created by anshu on 17/07/17.
 */
public class MaxNonConsecSum {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        int inc=nums[0];
        int exc=0;
        for(int i=1;i<n;i++){
            int temp = inc;
            inc=exc+nums[i];
            exc=Math.max(exc,temp);
        }
        return Math.max(inc,exc);
    }
}
