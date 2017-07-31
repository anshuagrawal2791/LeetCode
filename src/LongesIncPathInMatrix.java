import java.util.Arrays;

/**
 * Created by anshu on 31/07/17.
 */
public class LongesIncPathInMatrix {
    public class Solution {
        int a[][];
        int xs[] = new int[]{0,0,1,-1};
        int ys[] = new int[]{1,-1,0,0};
        int rows,cols;
        int grid[][];
        public int longestIncreasingPath(int[][] matrix) {
            if(matrix.length==0)
                return 0;
            grid = matrix;
            rows = matrix.length;
            cols = matrix[0].length;
            a = new int[rows][cols];
            for(int b[]: a)
                Arrays.fill(b,-1);
            // System.out.println(Arrays.deepToString(a));


            int max=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    // boolean visited[][] = new boolean[rows][cols];
                    // visited[i][j]=true;
                    int x = dfs(i,j);
                    max=Math.max(max,x);
                    a[i][j]=x;
                }
            }
            // System.out.println(Arrays.deepToString(a));
            return max;
        }
        int dfs(int i,int j){
            if(a[i][j]!=-1)
                return a[i][j];
            int max=0;
            for(int k=0;k<4;k++){
                int newi = i+xs[k];
                int newj = j+ys[k];
                if(isValid(newi,newj)){
                    if(grid[newi][newj]>grid[i][j]){
                        // visited[newi][newj]=true;
                        int x = dfs(newi,newj);
                        max=Math.max(max,x);
                        // visited[newi][newj]=false;
                    }
                }
            }
            return a[i][j]=1+max;
        }
        boolean isValid(int i,int j){
            return (i>=0&&i<rows&&j>=0&&j<cols);
        }
    }
}
