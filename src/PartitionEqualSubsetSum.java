import java.util.Arrays;

/**
 * Created by anshu on 25/07/17.
 */
public class PartitionEqualSubsetSum {
    public class Solution {
        int cache[][];
        public boolean canPartition(int[] nums) {
            int sum=0;
            for(int x:nums)
                sum+=x;
            if(sum%2!=0)
                return false;
            cache = new int[nums.length+1][sum+1];
            for(int a[]:cache)
                Arrays.fill(a,-1);
            return check(nums,sum/2,nums.length-1);
        }
        boolean check(int a[],int sum,int i){
            if(sum==0)
                return true;
            if(sum<0||i<0)
                return false;
            if(cache[i][sum]!=-1)
                return (cache[i][sum]==1)?true:false;
            boolean x=(check(a,sum-a[i],i-1)||check(a,sum,i-1));
            if(x)
                cache[i][sum]=1;
            else cache[i][sum]=0;
            return x;
        }
    }
}
