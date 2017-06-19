import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 20/06/17.
 */
public class Combinations {
    HashSet<List<Integer>> finalList = new HashSet<>();
    public List<List<Integer>> combine(int n, int k) {
        add(n,k,0,1,new ArrayList<>());
        return new ArrayList<List<Integer>>(finalList);
    }
    void add(int n,int k,int i,int min,List<Integer> list){
        if(i==k){
            finalList.add(list);
            return;
        }
        for(int l=min;l<=n;l++){
            List<Integer> li = new ArrayList<>(list);
            li.add(l);
            add(n,k,i+1,l+1,li);
        }
    }
}
