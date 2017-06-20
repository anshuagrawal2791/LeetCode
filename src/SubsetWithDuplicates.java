import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 20/06/17.
 */
public class SubsetWithDuplicates {
    HashSet<List<Integer>> finalList = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((1<<j)&i)!=0)
                    li.add(nums[j]);
            }

            finalList.add(li);
        }
        return new ArrayList<List<Integer>>(finalList);
    }
}
