/**
 * Created by anshu on 21/07/17.
 */
public class MoveZeroes {
    public class Solution {
        public void moveZeroes(int[] nums) {
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]==0){
                    for(int j=i;j<nums.length-1;j++){
                        if(nums[j+1]==0)
                            break;
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
    }
}
