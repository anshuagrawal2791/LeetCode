import java.util.Arrays;

/**
 * Created by anshu on 19/07/17.
 */
public class NumOfIslands {
    public class Solution {
        int x[] = new int[]{0,0,1,-1};
        int y[] = new int[]{1,-1,0,0};
        char a[][];
        int visited[][];
        int rows,cols;
        public int numIslands(char[][] grid) {
            rows=grid.length;
            if(rows==0)
                return 0;
            cols = grid[0].length;
            a = new char[rows][cols];
            visited = new int[rows][cols];
            for(int aux[]:visited)
                Arrays.fill(aux,-1);
            int count=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++)
                    a[i][j]=grid[i][j];
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(a[i][j]=='1'){
                        count++;
                        visited[i][j]=1;
                        a[i][j]='2';
                        for(int l=0;l<4;l++){
                            if(isValid(i+x[l],j+y[l])&&visited[i+x[l]][j+y[l]]!=1){
                                floodfill(i+x[l],j+y[l]);
                            }
                        }
                    }
                }
            }
            return count;
        }
        boolean isValid(int i,int j){
            return (i>=0&&i<rows&&j>=0&&j<cols);
        }
        void floodfill(int i,int j){
            visited[i][j]=1;
            if(a[i][j]=='0'||a[i][j]=='2')
                return;
            a[i][j]='2';
            for(int l=0;l<4;l++){
                if(isValid(i+x[l],j+y[l])&&visited[i+x[l]][j+y[l]]!=1){
                    floodfill(i+x[l],j+y[l]);
                }
            }

        }
    }
}
