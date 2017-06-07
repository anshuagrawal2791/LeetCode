import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 08/06/17.
 */
public class ThreeSum {
    HashSet<List<Integer>> finalList = new HashSet<>();
    int[][] cache;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        check2(nums,nums.length-1,new ArrayList<Integer>(),0,0);
        // System.out.println(finalList.toString());
        return new ArrayList<List<Integer>>(finalList);
    }
    void check(int nums[],int i,ArrayList<Integer> list,int curSum,int count){
        if(curSum==0&&count==3){
            finalList.add(list);

        }if(i<0||count>3)
            return;
        ArrayList<Integer> aux = new ArrayList<>(list);
        aux.add(nums[i]);
        check(nums,i-1,aux,curSum+nums[i],count+1);
        check(nums,i-1,list,curSum,count);
    }
    void check2(int nums[],int lastIndex,ArrayList<Integer>list, int curSum,int count){
        for(int i=0;i<=lastIndex-2;i++){
            int l=i+1;
            int h=lastIndex;
            while(l<h){
                // System.out.println(i+" "+l+" "+h);
                if(nums[i]+nums[l]+nums[h]==0){
                    list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[h]);
                    finalList.add(list);
                    l++;
                    h--;
                }else if(nums[i]+nums[l]+nums[h]<0){
                    l++;
                }else
                    h--;
            }
        }
    }
}
