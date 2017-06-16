import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 16/06/17.
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] a) {

        int rows = a.length;
        int col=0;
        if(rows>0)
            col = a[0].length;
        else
            return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        int rowBegin=0,rowEnd=rows-1,colBegin=0,colEnd=col-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                res.add(a[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                res.add(a[i][colEnd]);

            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--)
                    res.add(a[rowEnd][i]);
                rowEnd--;
            }
            if(colEnd>=colBegin){
                for(int i=rowEnd;i>=rowBegin;i--)
                    res.add(a[i][colBegin]);
                colBegin++;
            }
        }
        return res;
    }
}
