/**
 * Created by anshu on 15/06/17.
 */
public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int start =0,end=0,s=0,max=Integer.MIN_VALUE, cur=0;
        for(int i=0;i<n;i++){
            cur+=nums[i];
            if(max<cur){
                max=cur;
                start=s;
                end=i;
            }
            if(cur<0){
                cur=0;
                s=i+1;
            }
        }
        return max;
    }
}
