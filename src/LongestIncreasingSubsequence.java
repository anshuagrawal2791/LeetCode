/**
 * Created by anshu on 23/07/17.
 */
public class LongestIncreasingSubsequence {
    public class Solution {
        public int lengthOfLIS(int[] nums) {
            int n = nums.length;
            if(n==0)
                return 0;
            int a[] = new int[n];
            a[n-1]=1;
            for(int i=n-2;i>=0;i--){
                int max=Integer.MIN_VALUE;
                for(int j=i+1;j<n;j++){
                    if(nums[j]>nums[i]&&a[j]>max){
                        max=a[j];
                    }
                    if(max!=Integer.MIN_VALUE){
                        a[i]=max+1;
                    }else
                        a[i]=1;
                }
            }
            int max=1;

            for(int i=0;i<n;i++){
                if(a[i]>max)
                    max=a[i];
            }
            return max;

        }
    }
}
