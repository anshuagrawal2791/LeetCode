import java.util.HashMap;
import java.util.Map;

/**
 * Created by anshu on 17/07/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>(n/2))
                    return nums[i];
            }
            else
                map.put(nums[i],1);
        }
        int max=Integer.MIN_VALUE;
        int maxKey = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
