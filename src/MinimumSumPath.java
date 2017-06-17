/**
 * Created by anshu on 17/06/17.
 */
public class MinimumSumPath {
    public class Solution {
        public int minPathSum(int[][] grid) {
            int rows = grid.length;
            if(rows==0)
                return 0;
            int cols = grid[0].length;
            if(cols==1&&rows==1)
                return grid[0][0];
            int a[][] = new int[rows][cols];
            a[rows-1][cols-1]=grid[rows-1][cols-1];
            for(int i=rows-1;i>=0;i--){
                for(int j=cols-1;j>=0;j--){
                    if(i!=rows-1||j!=cols-1){
                        if(i==rows-1){
                            a[i][j]=a[i][j+1]+grid[i][j];;
                        }
                        else if(j==cols-1)
                            a[i][j]=a[i+1][j]+grid[i][j];
                        else{
                            a[i][j]=grid[i][j]+Math.min(a[i][j+1],a[i+1][j]);
                        }
                    }
                }
            }
            // System.out.println(Arrays.deepToString(a));
            return a[0][0];

        }
    }
}
