import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 27/06/17.
 */
public class PascalTriangle {
    List<List<Integer>> finalList = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li;
            if(i!=0)
            { li = new ArrayList<>(finalList.get(i-1));
                li.add(0);
            }
            else{
                li = new ArrayList<>();
                li.add(1);
            }

            for(int j=li.size()-1;j>=1;j--){
                int x = li.get(j)+li.get(j-1);
                li.set(j,x);
            }
            finalList.add(li);
        }
        return finalList;
    }
}
