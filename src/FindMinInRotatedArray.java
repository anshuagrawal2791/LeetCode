/**
 * Created by anshu on 17/07/17.
 */
public class FindMinInRotatedArray {
    public int findMin(int[] nums) {
        int l=0;
        int h = nums.length-1;
        while(l<h){
            int mid = (l+h)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }else
                h=mid;
        }
        return nums[l];
    }
}
