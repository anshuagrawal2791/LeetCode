/**
 * Created by anshu on 24/07/17.
 */
public class HouseRobber2 {
    public class Solution {
        public int rob(int[] nums) {
            if(nums.length==1)
                return nums[0];
            return Math.max(rob2(nums,0,nums.length-2),rob2(nums,1,nums.length-1));
        }
        int rob2(int a[],int l,int h){
            int inc=0;
            int exc=0;
            for(int i=l;i<=h;i++){
                int temp=inc;
                inc=exc+a[i];
                exc=Math.max(temp,exc);
            }

            return Math.max(inc,exc);
        }
    }
}
