import java.util.Arrays;

/**
 * Created by anshu on 27/07/17.
 */
public class ShortestUnsortedContSubArray {
    public class Solution {
        public int findUnsortedSubarray(int[] nums) {
            if(nums.length==0)
                return 0;
            int a[] = Arrays.copyOf(nums,nums.length);
            Arrays.sort(a);
            int i,j;
            for(i=0;i<a.length;i++){
                if(a[i]!=nums[i])
                    break;
            }
            if(i==a.length)
                return 0;
            // if(i==0)
            //     return a.length;
            for(j=a.length-1;j>=0;j--){
                if(a[j]!=nums[j])
                    break;
            }
            return j-i+1;
        }
    }
}
