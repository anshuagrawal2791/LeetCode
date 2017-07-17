/**
 * Created by anshu on 17/07/17.
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int global = nums[0],min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0)
            {
                int temp = min;
                min =max;
                max=temp;
            }
            max = Math.max(nums[i],max*nums[i]);
            min = Math.min(nums[i],min*nums[i]);
            global=Math.max(global,max);
        }
        return global;
    }
}
