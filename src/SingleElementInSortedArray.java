/**
 * Created by anshu on 26/07/17.
 */
public class SingleElementInSortedArray {
    public class Solution {
        public int singleNonDuplicate(int[] nums) {
            int l=0;
            int h=nums.length-1;
            while(l<h){
                int mid = (l+h)/2;
                if((mid-l+1)%2!=0){
                    if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
                        return nums[mid];
                    else if(nums[mid]==nums[mid-1]){
                        h=mid-2;
                    }
                    else{
                        l=mid;
                    }
                }else{
                    if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
                        return nums[mid];
                    else if(nums[mid]==nums[mid-1]){
                        l=mid+1;
                    }
                    else{
                        h=mid-1;
                    }
                }
            }
            return nums[l];
        }
    }
}
