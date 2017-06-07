import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 08/06/17.
 */
public class FourSum {
    HashSet<List<Integer>> finalList = new HashSet<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        check2(nums,nums.length-1,new ArrayList<Integer>(),0,target);
        // System.out.println(finalList.toString());
        return new ArrayList<List<Integer>>(finalList);

    }
    void check2(int nums[],int lastIndex,ArrayList<Integer>list, int curSum,int count){
        for(int j=0;j<=lastIndex-3;j++){
            for(int i=j+1;i<=lastIndex-2;i++){
                int l=i+1;
                int h=lastIndex;
                while(l<h){
                    // System.out.println(i+" "+l+" "+h);
                    if(nums[i]+nums[l]+nums[h]+nums[j]==count){
                        list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[h]);
                        list.add(nums[j]);
                        finalList.add(list);
                        l++;
                        h--;
                    }else if(nums[i]+nums[l]+nums[h]+nums[j]<count){
                        l++;
                    }else
                        h--;
                }
            }
        }
    }
}
