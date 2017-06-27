import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 27/06/17.
 */
public class KthRowInPascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            if(i==0)
                li.add(1);
            else
                li.add(0);
            for(int j=li.size()-1;j>=1;j--)
            {
                int x = li.get(j)+li.get(j-1);
                li.set(j,x);
            }
        }


        return li;
    }
}
