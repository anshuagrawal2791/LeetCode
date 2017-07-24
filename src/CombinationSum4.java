import java.util.Arrays;

/**
 * Created by anshu on 24/07/17.
 */
public class CombinationSum4 {
    public class Solution {
        int cache[];
        public int combinationSum4(int[] nums, int target) {
            cache = new int[target+1];
            Arrays.fill(cache,-1);
            return comb(nums,target,nums.length);
        }
        int comb(int a[],int n,int total){

            if(n<0)
                return 0;

            if(n==0)
                return 1;
            if(cache[n]!=-1)
                return cache[n];
            int ways=0;
            for(int i=0;i<total;i++){
                ways+=comb(a,n-a[i],total);
            }
            return cache[n]=ways;
        }
    }
}
