import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 20/06/17.
 */
public class Subsets {
    HashSet<List<Integer>> finalList = new HashSet<>();
    public List<List<Integer>> subsets(int[] nums) {
        for(int i=0;i<1<<nums.length;i++){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(((1<<j)&i)!=0)
                    li.add(nums[j]);
            }
            finalList.add(li);
        }
        return new ArrayList<List<Integer>>(finalList);
    }
}
