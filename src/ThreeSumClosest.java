import java.util.Arrays;

/**
 * Created by anshu on 08/06/17.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        double global=Double.MAX_VALUE;
        double ans=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int h = nums.length-1;
            while(l<h){
                double sum = nums[i]+nums[l]+nums[h];
                double diff = Math.abs(target-sum);
                if(diff<global){
                    global = diff;
                    ans=sum;
                }
                if(sum==target){
                    return (int)ans;
                }else if(sum<target){
                    l++;
                }else
                    h--;
            }
        }
        return (int)ans;
    }
}
