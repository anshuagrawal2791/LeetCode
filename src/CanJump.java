/**
 * Created by anshu on 15/06/17.
 */
public class CanJump {
    int cache[];
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int last=n-1,i,j;
        for(i=n-2;i>=0;i--){
            if(i+nums[i]>=last)last=i;
        }
        return last<=0;
    }
}
