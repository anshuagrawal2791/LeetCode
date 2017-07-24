/**
 * Created by anshu on 20/07/17.
 */
public class MaximalSquare {
    public class Solution {
        public int maximalSquare(char[][] matrix) {
            int rows = matrix.length;
            if(rows==0)
                return 0;
            int cols = matrix[0].length;
            int a[][] = new int[rows][cols];
            int max=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(i==0||j==0){
                        a[i][j]=(matrix[i][j]=='1')?1:0;
                    }else{
                        if(matrix[i][j]=='0')
                            a[i][j]=0;
                        else{
                            a[i][j] = Math.min(Math.min(a[i-1][j-1],a[i-1][j]),a[i][j-1])+1;
                        }
                    }
                    max=Math.max(a[i][j],max);
                }
            }
            // System.out.println(Arrays.deepToString(a));
            // return a[rows-1][cols-1];
            return max*max;
        }
    }
}
