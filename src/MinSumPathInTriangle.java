import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 27/06/17.
 */
public class MinSumPathInTriangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        for(int i=rows-2;i>=0;i--){

            List<Integer> a = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                a.add(triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
            triangle.add(i,a);
            if(i==0){
                return a.get(0);
            }
        }
        return triangle.get(0).get(0);
    }
}
