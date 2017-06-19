/**
 * Created by anshu on 18/06/17.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        if(rows==0)
            return false;
        int cols = a[0].length;
        int l=0;
        int h = (rows*cols)-1;
        while(l<=h){
            int mid = (l+h)/2;
            int row = mid/cols;
            int col = mid%cols;
            // System.out.println(l+" "+h+" "+row+" "+col);

            if(a[row][col]==target)
                return true;
            else if(a[row][col]>target)
                h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}
