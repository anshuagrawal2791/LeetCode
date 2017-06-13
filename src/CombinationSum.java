import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 13/06/17.
 */
public class CombinationSum {
    HashSet<List<Integer>> finalList = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] a, int target) {

        check(a,a.length-1,target,new ArrayList<Integer>());
        return new ArrayList<List<Integer>>(finalList);
    }
    void check(int[] a,int i,int sum, List<Integer> list){
        if(sum==0){
            finalList.add(list);
        }
        if(i<0||sum<0)
            return;
        List<Integer> aux = new ArrayList<>(list);
        aux.add(a[i]);
        check(a,i,sum-a[i],aux);
        check(a,i-1,sum,list);
    }
}
