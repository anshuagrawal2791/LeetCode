import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by anshu on 06/06/17.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans[0]=map.get(nums[i]);
                ans[1]=i;
                return ans;
            }
            map.put(target-nums[i],i);
        }
        System.out.println(Arrays.asList(map));
        return ans;
    }

}
