/**
 * Created by anshu on 26/07/17.
 */
public class TargetSum {
    public class Solution {
        public int findTargetSumWays(int[] nums, int S) {
            if(nums.length==0)
                return 0;
            return check(0,nums.length,S,nums,0);
        }
        int check(int i,int n,int sum,int a[],int cur){
            if(i==n){
                if(sum==cur)
                    return 1;
                else return 0;
            }
            return check(i+1,n,sum,a,cur+a[i])+check(i+1,n,sum,a,cur-a[i]);
        }
    }
}
