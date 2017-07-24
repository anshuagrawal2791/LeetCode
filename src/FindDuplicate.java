/**
 * Created by anshu on 23/07/17.
 */
public class FindDuplicate {
    public class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0],fast=nums[slow];
            while(slow!=fast){
                // System.out.println(slow+" "+fast);
                slow = nums[slow];
                fast=nums[nums[fast]];
            }
            fast=0;
            while(fast!=slow){
                // System.out.println("--"+slow+" "+fast);


                fast=nums[fast];
                slow=nums[slow];
            }
            return fast;

        }
    }
}
