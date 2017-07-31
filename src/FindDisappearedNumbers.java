import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 26/07/17.
 */
public class FindDisappearedNumbers {
    public class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[Math.abs(nums[i])-1]>0){
                    //     res.add(Math.abs(nums[i]));
                    nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
                }
                // }else{
                //     res.remove(res.indexOf(Math.abs(nums[i])));
                // }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0)
                    res.add(i+1);
            }
            return res;
        }
    }
}
