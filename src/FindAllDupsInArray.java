import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 26/07/17.
 */
public class FindAllDupsInArray {
    public class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(nums[Math.abs(nums[i])-1]>0){
                    nums[Math.abs(nums[i])-1]*=-1;
                }else{
                    set.add(Math.abs(nums[i]));
                }
            }
            return new ArrayList<Integer>(set);
        }
    }
}
